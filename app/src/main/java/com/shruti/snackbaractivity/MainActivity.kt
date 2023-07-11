package com.shruti.snackbaractivity

import android.app.Notification.Action
import android.content.Intent
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
    var btnext : Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btSnakebar =findViewById(R.id.btSnackbar)
        etEmail =findViewById(R.id.etEmail)
        etMobile =findViewById(R.id.etMobile)
        btnext =findViewById(R.id.btnext)
        btnext ?.setOnClickListener {
           var intent = Intent(this , AlertDialogActivity::class.java)
            startActivity(intent)
        }
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
                 Snackbar.make (  it, "This is a Snackbar", Snackbar.LENGTH_SHORT).setAction(" ok"){

                 }
                     .setAnchorView(btSnakebar)
                     .show()

             }

         }
    }
}
}







