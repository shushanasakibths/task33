package com.example.task33

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.ActionBar
import androidx.navigation.NavController
import androidx.navigation.findNavController

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button3: Button = view.findViewById(R.id.button3)
        val toggleAppBarButton: Button = view.findViewById(R.id.toggleAppBarButton)

        button3.setOnClickListener {
            val navController: NavController = view.findNavController()
            navController.navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        toggleAppBarButton.setOnClickListener {
            val appBar: ActionBar? = (context as MainActivity).supportActionBar
            appBar?.let {
                if (it.isShowing) {
                    it.hide()
                } else {
                    it.show()
                }
            }
        }
    }
}