package com.example.teamworks.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.teamworks.fragments.ContactFragment
import com.example.teamworks.fragments.ImagesFragment
import com.example.teamworks.fragments.ViewImagesFragment

class MyPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                // fragment for contact
                ContactFragment()

            }
            1 -> {
                //fragment for  gallery
                ImagesFragment()
            }
            else -> return ViewImagesFragment()
        }

    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position)
        {
            0 -> "Contact Us"
            1 -> "Images"
            else -> return "View Images"
        }
    }
}