package com.example.task33

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.findNavController

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button: Button = view.findViewById(R.id.button)
        val button2: Button = view.findViewById(R.id.button2)

        button.setOnClickListener {
            val navController: NavController = view.findNavController()
            navController.navigate(R.id.action_firstFragment_to_secondFragment)
        }

        button2.setOnClickListener {
            val navController: NavController = view.findNavController()
            navController.navigate(R.id.action_firstFragment_to_thirdFragment)
        }
    }
}