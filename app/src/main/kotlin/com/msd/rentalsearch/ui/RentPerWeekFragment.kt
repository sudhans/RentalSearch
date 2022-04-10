package com.msd.rentalsearch.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.msd.rentalsearch.R
import com.msd.rentalsearch.presentation.viewmodel.SharedSearchViewModel

class RentPerWeekFragment : Fragment(){

    private val viewModel: SharedSearchViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_rent_per_week, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_next)?.setOnClickListener {
            viewModel.printHello()
            val action = RentPerWeekFragmentDirections.actionRentPerWeekFragmentToSearchResultFragment()
            it.findNavController().navigate(action)
        }
    }
}