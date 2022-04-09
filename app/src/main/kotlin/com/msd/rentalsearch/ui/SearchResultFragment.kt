package com.msd.rentalsearch.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.msd.rentalsearch.R

class SearchResultFragment: Fragment() {
    companion object {
        fun newInstance() = SearchResultFragment()
    }

    private val viewModel: com.msd.rentalsearch.viewmodel.MainViewModel by lazy {
        ViewModelProvider(this).get(com.msd.rentalsearch.viewmodel.MainViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_region, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.printHello()
    }
}