package com.example.user.calculator

import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.view.View
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var one: Button? = null
    var two: Button? = null
    var three: Button? = null
    var four: Button? = null
    var five: Button? = null
    var six: Button? = null
    var seven: Button? = null
    var eight: Button? = null
    var nine: Button? = null
    var zero: Button? = null
    var clear: Button? = null
    var bracket: Button? = null
    var mod: Button? = null
    var divide: Button? = null
    var multiply: Button? = null
    var minus: Button? = null
    var plus: Button? = null
    var dot: Button? = null
    var back: Button? = null
    var equal: Button? = null
    var t1: EditText? = null
    var oper = "0"
    var cal: String? = null
    var v1 = 0
    var v2 = 0
    var add: Boolean? = null
    var sub: Boolean? = null
    var mul: Boolean? = null
    var div: Boolean? = null
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val one: Button = findViewById(R.id.one) as Button
        val two: Button = findViewById(R.id.two) as Button
        val three: Button = findViewById(R.id.three) as Button
        val four: Button = findViewById(R.id.four) as Button
        val five: Button = findViewById(R.id.five) as Button
        val six: Button = findViewById(R.id.six) as Button
        val seven: Button = findViewById(R.id.seven) as Button
        val eight: Button = findViewById(R.id.eight) as Button
        val nine: Button = findViewById(R.id.nine) as Button
        val zero: Button = findViewById(R.id.zero) as Button
        val clear: Button = findViewById(R.id.clear) as Button
        val bracket: Button = findViewById(R.id.bracket) as Button
        val mod: Button = findViewById(R.id.mod) as Button
        val divide: Button = findViewById(R.id.divide) as Button
        val multiply: Button = findViewById(R.id.multiply) as Button
        val minus: Button = findViewById(R.id.minus) as Button
        val plus: Button = findViewById(R.id.plus) as Button
        val dot: Button = findViewById(R.id.dot) as Button
        val back: Button = findViewById(R.id.back) as Button
        val equal: Button = findViewById(R.id.equal) as Button
        t1 = findViewById(R.id.t1)
        one.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                if (t1.getText().toString().length() - 1 === '+' || t1.getText().toString().length() - 1 === '-' || t1.getText().toString().length() - 1 === '*' || t1.getText().toString().length() - 1 === '/') {
                    t1.setText(t1.getText().toString() + "1")
                    v2 = (v2.toString() + "1").toInt()
                } else t1.setText(t1.getText().toString() + "1")
            }
        })
        two.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                t1.setText(t1.getText().toString() + "2")
            }
        })
        three.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                t1.setText(t1.getText().toString() + "3")
            }
        })
        four.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                t1.setText(t1.getText().toString() + "4")
            }
        })
        five.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                t1.setText(t1.getText().toString() + "5")
            }
        })
        six.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                t1.setText(t1.getText().toString() + "6")
            }
        })
        seven.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                t1.setText(t1.getText().toString() + "7")
            }
        })
        eight.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                t1.setText(t1.getText().toString() + "8")
            }
        })
        nine.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                t1.setText(t1.getText().toString() + "9")
            }
        })
        zero.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                t1.setText(t1.getText().toString() + "0")
            }
        })
        clear.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                t1.setText("")
            }
        })
        bracket.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {}
        })
        mod.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                t1.setText(t1.getText().toString() + "%")
            }
        })
        divide.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                t1.setText(t1.getText().toString() + "/")
            }
        })
        multiply.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                t1.setText(t1.getText().toString() + "*")
            }
        })
        minus.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                t1.setText(t1.getText().toString() + "-")
            }
        })
        plus.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                if (t1.getText().toString().length() === 0) {
                    t1.setText("")
                } else {
                    if (oper === "0") {
                        v1 = t1.getText().toString().toInt()
                        oper = "+"
                    } else {
                        cal = v1.toString() + v2.toString()
                        t1.setText(cal)
                        v1 = cal.toInt()
                    }
                    t1.setText(t1.getText().toString() + "+")
                }
            }
        }
        )
        dot.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                if (t1.getText() == null) {
                    t1.setText(t1.getText().toString() + "0.")
                } else t1.setText(t1.getText().toString() + ".")
            }
        })
        back.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                if (t1.getText() != null) {
                    var value: String = t1.getText().toString()
                    if (value.length > 0) {
                        value = value.substring(0, value.length - 1)
                        t1.setText(value)
                    }
                }
            }
        })
        equal.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                val q = (1 + 2).toString()
                t1.setText(cal)
            }
        })
    }
}