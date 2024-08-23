package com.example.multipletabs.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.multipletabs.fragments.BlankFragment
import com.example.multipletabs.fragments.EightFragment
import com.example.multipletabs.fragments.ElevenFragment
import com.example.multipletabs.fragments.FifteenFragment
import com.example.multipletabs.fragments.FiveFragment
import com.example.multipletabs.fragments.FourFragment
import com.example.multipletabs.fragments.FourteenFragment2
import com.example.multipletabs.fragments.NineFragment
import com.example.multipletabs.fragments.OneFragment
import com.example.multipletabs.fragments.SevenFragment
import com.example.multipletabs.fragments.SixFragment
import com.example.multipletabs.fragments.TenFragment
import com.example.multipletabs.fragments.ThreeFragment
import com.example.multipletabs.fragments.TwelveFragment
import com.example.multipletabs.fragments.TwoFragment

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 15
    }

    override fun getItem(position: Int): Fragment {
        when(position)
        {
            0 -> return OneFragment()
            1 -> return TwoFragment()
            2 -> return ThreeFragment()
            3 -> return FourFragment()
            4 -> return FiveFragment()
            5 -> return SixFragment()
            6 -> return SevenFragment()
            7 -> return EightFragment()
            8 -> return NineFragment()
            9 -> return TenFragment()
            10 -> return ElevenFragment()
            11 -> return TwelveFragment()
            12 -> return BlankFragment()
            13-> return FourteenFragment2()
            else -> return FifteenFragment()
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {

        when(position)
        {
            0 -> return "One"
            1 -> return "Two"
            2 -> return "Three"
            3 -> return "Four"
            4 -> return "Five"
            5 -> return "Six"
            6 -> return "Seven"
            7 -> return "Eight"
            8 -> return "Nine"
            9 -> return "Ten"
            10 -> return "Eleven"
            11 -> return "Twelve"
            12 -> return "Thirteen"
            13 -> return "Fourteen"
            else -> return "Fifteen"
        }
    }
}