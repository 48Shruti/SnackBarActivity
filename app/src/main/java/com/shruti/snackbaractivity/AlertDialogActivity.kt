package com.shruti.snackbaractivity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertDialogActivity : AppCompatActivity() {
    var btalert: Button? = null
    var tvdigit : TextView ?= null
    var num = 0
    var items = arrayOf("A","B","C")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alertdialog)
         btalert = findViewById(R.id.btalert)
        tvdigit = findViewById(R.id.tvdigit)
        btalert?.setOnClickListener {
             AlertDialog.Builder(this )
                .setTitle("Delete")
                .setCancelable(false)
                 .setMessage("This is a Delete message")
                .setPositiveButton("yes") { _,_->
                    Toast.makeText(this,"add 2",Toast.LENGTH_SHORT).show()
                    num += 2
                    tvdigit?.setText(num.toString())
                }
                 .setNegativeButton("No") {_,_,->
                     Toast.makeText(this, "sub 2", Toast.LENGTH_SHORT).show ()
                     num -=2
                     tvdigit?.setText(num.toString())
                 }
                 .setNeutralButton("new") {_,_->
                     Toast.makeText(this, "new",Toast.LENGTH_SHORT).show()
                 }.show()


        }




         }
}
