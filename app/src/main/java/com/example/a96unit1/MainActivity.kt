package com.example.a96unit1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addOneButton=findViewById<Button>(R.id.button)

        addOneButton.setOnClickListener(){
//            Log.v("Hello Worlld","Button clicked")
            val textView=findViewById<TextView>(R.id.textView)
            val currCount=textView.text
//            if(currCount is String){
//                System.out.println("I won!")
//            }
//            Toast.makeText(this, "This button was clicked."+ Integer.parseInt(currCount as String), Toast.LENGTH_SHORT).show()
            textView.text= (Integer.parseInt(currCount as String)+1).toString()

        }
//        fun openNextScreen(){
//            val intent = Intent(this, InformationEnter::class.java)
//            startActivity(intent)
//        }
    }
}