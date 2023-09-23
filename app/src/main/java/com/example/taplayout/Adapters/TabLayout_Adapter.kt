package com.example.taplayout.Adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.taplayout.Fragments.Home
import com.example.taplayout.Fragments.Profile
import com.example.taplayout.Fragments.Settings

internal class TabLayout_Adapter(
    var context : Context ,
    fragmentManager: FragmentManager,
    var totalTabs : Int
    ) : FragmentPagerAdapter(fragmentManager){
    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> Home()
            1 -> Profile()
            2 -> Settings()
            else -> getItem(position)
        }
    }
}