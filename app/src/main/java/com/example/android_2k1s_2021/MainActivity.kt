package com.example.android_2k1s_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    private var tvUsername: TextView? = null
    private var etUsername: EditText? = null
    private var btnEdit: AppCompatButton? = null
    private var btnSave: AppCompatButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findView()
        initListeners()
    }

    private fun initListeners() {
        btnEdit?.setOnClickListener() {
            tvUsername?.visibility = View.INVISIBLE
            btnEdit?.visibility = View.INVISIBLE
            etUsername?.visibility = View.VISIBLE
            btnSave?.visibility = View.VISIBLE
        }

        btnSave?.setOnClickListener() {
            tvUsername?.text = etUsername?.text
            tvUsername?.visibility = View.VISIBLE
            btnEdit?.visibility = View.VISIBLE
            etUsername?.visibility = View.INVISIBLE
            btnSave?.visibility = View.INVISIBLE
        }
    }

    private fun findView() {
        tvUsername = findViewById(R.id.username)
        etUsername = findViewById(R.id.username_edit)
        btnEdit = findViewById(R.id.edit_btn)
        btnSave = findViewById(R.id.save_btn)
    }
}
