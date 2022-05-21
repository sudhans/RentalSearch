package com.msd.rentalsearch.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.msd.rentalsearch.R
import com.msd.rentalsearch.presentation.viewmodel.SharedSearchViewModel

class RegionFragment : Fragment() {

    private val viewModel: SharedSearchViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_region, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_next)?.setOnClickListener {
            val action = RegionFragmentDirections.actionRegionFragmentToNumberOfRoomsFragment()
            it.findNavController().navigate(action)
        }

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, viewModel.getRegions())
        view.findViewById<AutoCompleteTextView>(R.id.region_inputtext).setAdapter(adapter)
    }

}