package com.shruti.snackbaractivity

import android.app.Notification.Action
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter.LengthFilter
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    var btSnakebar : Button ?= null
    var etEmail : EditText ?= null
    var etMobile : EditText ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btSnakebar =findViewById(R.id.btSnackbar)
        etEmail =findViewById(R.id.etEmail)
        etMobile =findViewById(R.id.etMobile)
        btSnakebar?.setOnClickListener { if (etEmail?.text.isNullOrEmpty())
        {
            etEmail?.error = "Enter your email"
         }
            else if ( etMobile?.text.isNullOrEmpty() )
         {
            etMobile?.error = "Enter your Mobile number"
        }
            else
            { btSnakebar ?.let {
                 Snackbar.make (  it, "This is a Snackbar", Snackbar.LENGTH_SHORT).setAction(" ok"){}.show()

             }
         }
    }
}
}







