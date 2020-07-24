package com.example.teamworks.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.teamworks.adapter.MyItemAdapter
import com.example.teamworks.model.MyItemData
import com.example.teamworks.R


class ViewImagesFragment : Fragment() {

    lateinit var imagesRecyclerView: RecyclerView
    lateinit var myItemAdapter: MyItemAdapter
    lateinit var linearLayoutManager: LinearLayoutManager
    var itemsList  = arrayListOf<MyItemData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_view_images, container, false)
        linearLayoutManager = LinearLayoutManager(activity)
        imagesRecyclerView = view.findViewById(R.id.imagesRecyclerView)
        for (i in 0 until 3)
        {
            val j = i+1
            val myItemData = MyItemData(
                R.drawable.company_logo,
                j.toString(),
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
            )
            itemsList.add(i,myItemData)
        }

        myItemAdapter = MyItemAdapter(itemsList)
        imagesRecyclerView.adapter = myItemAdapter
        imagesRecyclerView.layoutManager = linearLayoutManager


        return view
    }
}