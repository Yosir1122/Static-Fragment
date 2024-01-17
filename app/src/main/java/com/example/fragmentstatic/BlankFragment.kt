package com.example.fragmentstatic

import android.os.Bundle
import android.service.media.MediaBrowserService.BrowserRoot
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast


class BlankFragment : Fragment() {
    lateinit var root:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_blank, container, false)
        root.findViewById<TextView>(R.id.fragment)
            .setOnClickListener{
                Toast.makeText(context, "Salom", Toast.LENGTH_SHORT).show()
            }
        return root
    }
}