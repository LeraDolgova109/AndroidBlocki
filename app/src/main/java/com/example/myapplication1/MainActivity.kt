package com.example.myapplication1

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.delete.setOnClickListener{
            binding.root.removeView(binding.root.parent as View)
        }
        binding.menuBlock1.setOnClickListener{
            val inflater =
                getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val rowView: View = inflater.inflate(R.layout.block1_layout, binding.root)
            binding.root.addView(rowView, binding.root.childCount - 1)
        }
    }

}
