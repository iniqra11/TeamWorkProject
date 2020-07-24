package com.example.teamworks.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.teamworks.R
import kotlinx.android.synthetic.main.fragment_images.*


class ImagesFragment : Fragment() {
    lateinit var galleryButton: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val  view =  inflater.inflate(R.layout.fragment_images, container, false)
        galleryButton = view.findViewById(R.id.galleryButton)

        galleryButton.setOnClickListener{
            galleryButton.visibility = View.GONE
            companyLogo.visibility = View.VISIBLE
        }

        return view
    }
}