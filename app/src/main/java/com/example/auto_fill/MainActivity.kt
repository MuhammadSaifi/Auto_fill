package com.example.auto_fill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      val suggestion=arrayOf("Shoaib","Saif","Sohaib","Shehzad")
        val adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,suggestion)
        result.threshold=0
        result.setAdapter(adapter)
        result.setOnFocusChangeListener { view, b -> if(b)
        result.showDropDown()}
    }
}
