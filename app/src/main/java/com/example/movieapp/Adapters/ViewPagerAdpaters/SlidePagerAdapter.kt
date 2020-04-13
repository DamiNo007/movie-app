package com.example.movieapp.Adapters.ViewPagerAdpaters


import androidx.fragment.app.Fragment

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

//SLIDEPAGERADAPTERDEVELOP2BRANCH
class SlidePagerAdapter(
    fragmentManager: FragmentManager?,
    private val fragmentList: List<Fragment>
) :
    FragmentPagerAdapter(fragmentManager!!) {
    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }
}