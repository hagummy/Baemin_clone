package com.example.baeminclone

import android.Manifest.permission.ACCESS_COARSE_LOCATION
import android.Manifest.permission.ACCESS_FINE_LOCATION
import java.util.jar.Manifest

class fragment_home : BaseFragment<HomeViewModel, FragmentHomeBinding>() {

    companion object {

        val locationPermission=arrayOf(
            ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION
        )
        const val Tag="MainFragment"

        fun newInstance()=fragment_home()
    }
}