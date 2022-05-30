package com.example.navegation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class SegundoFragment : Fragment() {
    lateinit var  button: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v1 = inflater.inflate(R.layout.fragment_segundo, container, false)
        button = v1.findViewById(R.id.btn_A)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_segundoFragment_to_primerFragment)
        }
        return v1
    }

}