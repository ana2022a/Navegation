package com.example.navegation

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController


class PrimerFragment : Fragment() {
    lateinit var  button:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v1 = inflater.inflate(R.layout.fragment_primer, container, false)
        button = v1.findViewById(R.id.btn_A)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_primerFragment_to_segundoFragment)
        }
        return v1
    }

}