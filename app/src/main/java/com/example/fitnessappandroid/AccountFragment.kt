package com.example.fitnessappandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.preference.PreferenceManager


class AccountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_account, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        loadSettings()
    }

    private fun loadSettings() {
        //val sp = PreferenceManager.getDefaultSharedPreferences(context)
        
        //val signature = sp.getString("username", "")
        //account_username.text = "username: $signature"
    }
}