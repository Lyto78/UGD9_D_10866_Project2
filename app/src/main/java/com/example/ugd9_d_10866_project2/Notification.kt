package com.example.ugd9_d_10866_project2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class Notification : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent) {
        val message = intent.getStringExtra("toastMessage")
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}