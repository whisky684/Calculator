package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b0.setOnClickListener {
            if(num.text.toString() == "0") {
                num.setText("0")
            }
            else{
                var str = num.text.toString().plus(0)
                num.setText(str)
            }
        }

        b1.setOnClickListener {
            if(num.text.toString() == "0") {
                num.setText("1")
            }
            else{
                var str = num.text.toString().plus(1)
                num.setText(str)
            }
        }

        b2.setOnClickListener {
            if(num.text.toString() == "0") {
                num.setText("2")
            }
            else{
                var str = num.text.toString().plus(2)
                num.setText(str)
            }
        }

        b3.setOnClickListener {
            if(num.text.toString() == "0") {
                num.setText("3")
            }
            else{
                var str = num.text.toString().plus(3)
                num.setText(str)
            }
        }

        b4.setOnClickListener {
            if(num.text.toString() == "0") {
                num.setText("4")
            }
            else{
                var str = num.text.toString().plus(4)
                num.setText(str)
            }
        }

        b5.setOnClickListener {
            if(num.text.toString() == "0") {
                num.setText("5")
            }
            else{
                var str = num.text.toString().plus(5)
                num.setText(str)
            }
        }

        b6.setOnClickListener {
            if(num.text.toString() == "0") {
                num.setText("6")
            }
            else{
                var str = num.text.toString().plus(6)
                num.setText(str)
            }
        }

        b7.setOnClickListener {
            if(num.text.toString() == "0") {
                num.setText("7")
            }
            else{
                var str = num.text.toString().plus(7)
                num.setText(str)
            }
        }

        b8.setOnClickListener {
            if(num.text.toString() == "0") {
                num.setText("8")
            }
            else{
                var str = num.text.toString().plus(8)
                num.setText(str)
            }
        }

        b9.setOnClickListener {
            if(num.text.toString() == "0") {
                num.setText("9")
            }
            else{
                var str = num.text.toString().plus(9)
                num.setText(str)
            }
        }

        bclear.setOnClickListener {
            num.setText("0")
        }
        bdel.setOnClickListener {
        if(num.text.toString().length <= 1) {
            num.setText("0")

        }
            else if(num.text.isNotEmpty()){
            num.text = num.text.dropLast(1)

        }
    }
}
}




