package com.vm.testtaskgosport.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.vm.testtaskgosport.R
import com.vm.testtaskgosport.databinding.FragmentTabsBinding
import com.vm.testtaskgosport.presentation.adapters.MealAdapter


class TabsFragment: Fragment(R.layout.fragment_tabs) {
    private var _binding: FragmentTabsBinding? = null
    private val binding: FragmentTabsBinding
       get() = _binding ?: throw RuntimeException("FragmentTabsBinding = null")

    private val viewModel by lazy {
        ViewModelProvider(this)[MealViewModel::class.java]
    }
    private val args by lazy {
        requireArguments().getString(CATEGORY_EXTRA)
    }

    override fun onCreateView(
        inflater : LayoutInflater,
        container : ViewGroup?,
        savedInstanceState : Bundle?
    ) : View {
        _binding =FragmentTabsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view : View, savedInstanceState : Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rvAdapter = MealAdapter()
        binding.rv.adapter = rvAdapter
        binding.rv.itemAnimator = null
        viewModel.mealList.observe(viewLifecycleOwner){ it1 ->
            rvAdapter.submitList(it1.filter { it.strCategory == args })
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object{
        private const val CATEGORY_EXTRA = "CATEGORY_EXTRA"
        fun newInstance(category: String) = TabsFragment().apply {
            arguments = Bundle().apply {
                putString(CATEGORY_EXTRA, category)
            }
        }
    }
}