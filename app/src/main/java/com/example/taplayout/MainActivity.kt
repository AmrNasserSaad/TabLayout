package com.example.taplayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.taplayout.Adapters.TabLayout_Adapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayoutFeatrue()

    }


  private fun  tabLayoutFeatrue(){


      tabLayout = findViewById(R.id.tabLayout)
      viewPager = findViewById(R.id.viewPager)

      tabLayout.addTab(tabLayout.newTab().setText("Home"))
      tabLayout.addTab(tabLayout.newTab().setText("Profile"))
      tabLayout.addTab(tabLayout.newTab().setText("Settings"))

      tabLayout.tabGravity = TabLayout.GRAVITY_FILL

      val adapter = TabLayout_Adapter(this,supportFragmentManager,tabLayout.tabCount)
      viewPager.adapter = adapter

      viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))


      tabLayout.addOnTabSelectedListener(object :TabLayout.OnTabSelectedListener{
          override fun onTabSelected(tab: TabLayout.Tab?) {
              viewPager.currentItem = tab!!.position
          }
          override fun onTabUnselected(tab: TabLayout.Tab?) {}

          override fun onTabReselected(tab: TabLayout.Tab?) {}
      })

  }
}