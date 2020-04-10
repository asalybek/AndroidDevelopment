package com.example.lab2

import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.*
import java.text.DecimalFormat
import java.text.NumberFormat
import kotlin.math.ln
import kotlin.math.log10
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    //private var txtScreen: TextView? = null
    private var operations: String = " "
    private var plu:Boolean = false
    private var minu:Boolean = false
    private var mul:Boolean= false
    private var div:Boolean = false
    private var sqrt:Boolean = false
    private var powerTwo:Boolean =false
    private var lastDot:Boolean = false
    private var bntroot:Boolean = false
    private var bpercent:Boolean = false
    private var bsinus:Boolean = false
    private var bcosine:Boolean = false
    private var btangent:Boolean = false
    private var bnatlog:Boolean = false
    private var blogar:Boolean = false
    private var bpower:Boolean = false
    private var bfactorial:Boolean = false
    private var lastNumeric:Boolean = false
    private  var setError :Boolean= false

    private var num1 = 0.0
    private var num2 = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zero:Button = findViewById(R.id.zero)
        val one:Button = findViewById(R.id.one)
        val two:Button = findViewById(R.id.two)
        val three:Button = findViewById(R.id.three)
        val four:Button = findViewById(R.id.four)
        val five:Button = findViewById(R.id.five)
        val six:Button = findViewById(R.id.six)
        val seven:Button = findViewById(R.id.seven)
        val eight:Button = findViewById(R.id.eight)
        val nine:Button = findViewById(R.id.nine)

        val plus:Button = findViewById(R.id.plus)
        val minus:Button = findViewById(R.id.minus)
        val multiply:Button = findViewById(R.id.multiply)
        val divide:Button = findViewById(R.id.divide)
        val percent:Button  = findViewById(R.id.percent)
        val square:Button = findViewById(R.id.square)

        val dot:Button = findViewById(R.id.dot)
        val root:Button = findViewById(R.id.root)
        val back:Button = findViewById(R.id.back)
        val clear:Button = findViewById(R.id.clear)
        val equal:Button = findViewById(R.id.equal)

        val nthroot:Button?  = findViewById(R.id.nthroot)
        val sinus:Button?  = findViewById(R.id.sinus)
        val cosine:Button?  = findViewById(R.id.cosine)
        val tangent:Button?  = findViewById(R.id.tangent)
        val natlog:Button?  = findViewById(R.id.natlog)
        val logar:Button?  = findViewById(R.id.logar)
        val power:Button?  = findViewById(R.id.power)
        val factorial:Button?  = findViewById(R.id.factorial)

        val txtScreen = findViewById<TextView>(R.id.txtScreen)

        if (savedInstanceState != null) {
            val displayText = savedInstanceState.getString("displayText")
            lastNumeric = savedInstanceState.getBoolean("lastNumeric")
            num1 = savedInstanceState.getDouble("num1")
            num2 = savedInstanceState.getDouble("num2")
            operations = savedInstanceState.getString("operations")!!
            txtScreen.text = displayText
        }
        zero.setOnClickListener {
            if (setError) {
                txtScreen.text = null
                setError = false
            } else {
                txtScreen.text = txtScreen.text.toString() + "0"
                lastNumeric = true
            }
        }
        one.setOnClickListener {
            if (txtScreen.text == "0") {
                txtScreen.text = null
            } else {
                if (setError) {
                    txtScreen.text = null
                    setError = false
                }
            }
            txtScreen.text = txtScreen?.text.toString() + "1"
            lastNumeric = true
        }
        two.setOnClickListener {
            if (txtScreen.text == "0") {
                txtScreen.text = null
            } else {
                if (setError) {
                    txtScreen.text = null
                    setError = false
                }
            }
            txtScreen.text = txtScreen.text.toString() + "2"
            lastNumeric = true
        }
        three.setOnClickListener {
            if (txtScreen.text == "0") {
                txtScreen.text = null
            } else if (setError) {
                txtScreen.text = null
                setError = false
            }
            txtScreen.text = txtScreen.text.toString() + "3"
            lastNumeric = true
        }
        four.setOnClickListener {
            if (txtScreen.text == "0") {
                txtScreen.text = null
            } else if (setError) {
                txtScreen.text = null
                setError = false
            }
            txtScreen.text = txtScreen.text.toString() + "4"
            lastNumeric = true
        }
        five.setOnClickListener {
            if (txtScreen.text == "0") {
                txtScreen.text = null
            } else if (setError) {
                txtScreen.text = null
                setError = false
            }
            txtScreen.text = txtScreen.text.toString() + "5"
            lastNumeric = true
        }
        six.setOnClickListener {
            if (txtScreen.text == "0") {
                txtScreen.text = null
            } else if (setError) {
                txtScreen.text = null
                setError = false
            }
            txtScreen.text = txtScreen.text.toString() + "6"
            lastNumeric = true
        }
        seven.setOnClickListener {
            if (txtScreen.text == "0") {
                txtScreen.text = null
            } else if (setError) {
                txtScreen.text = null
                setError = false
            }
            txtScreen.text = txtScreen.text.toString() + "7"
            lastNumeric = true
        }
        eight.setOnClickListener {
            if (txtScreen.text == "0") {
                txtScreen.text = null
            } else if (setError) {
                txtScreen.text = null
                setError = false
            }
            txtScreen.text = txtScreen.text.toString() + "8"
            lastNumeric = true
        }
        nine.setOnClickListener {
            if (txtScreen.text == "0") {
                txtScreen.text = null
            } else if (setError) {
                txtScreen.text = null
                setError = false
            }
            txtScreen.text = txtScreen.text.toString() + "9"
            lastNumeric = true
        }
        dot.setOnClickListener {
            if (!lastDot) {
                txtScreen.text = txtScreen.text.toString() + "."
                lastDot = true
                lastNumeric = false
            }
        }
        plus.setOnClickListener {
            if (lastNumeric && !plu) {
                num1 = (txtScreen.text.toString() + "").toDouble()
                plu = true
                lastDot = false
                lastNumeric = false
                txtScreen.text = null
                operations += "+"
            } else {
                operations += "+"
            }
        }
        minus.setOnClickListener {
            if (lastNumeric && !minu) {
                num1 = (txtScreen.text.toString() + "").toDouble()
                minu = true
                lastNumeric = false
                lastDot = false
                txtScreen.text = null
                operations += "-"
            } else {
                operations += "-"
            }
        }

        multiply.setOnClickListener {
            if (lastNumeric && !mul) {
                num1 = (txtScreen.text.toString() + " ").toDouble()
                mul = true
                lastDot = false
                lastNumeric = false
                txtScreen.text = null
                operations += "*"
            } else {
                operations += "*"
            }
        }

        divide.setOnClickListener {
            if (lastNumeric && !div) {
                num1 = (txtScreen.text.toString() + "").toDouble()
                div = true
                lastDot = false
                lastNumeric = false
                txtScreen.text = null
                operations += "/"
            } else {
                operations += "/"
            }
        }
        root.setOnClickListener {
            if (lastNumeric && !sqrt) {
                num1 = (txtScreen.text.toString() + "").toDouble()
                sqrt = true
                lastDot = false
                lastNumeric = false
                txtScreen.text = null
                operations += "√"
            } else {
                operations += "√"
            }
        }
        square.setOnClickListener {
            if (lastNumeric && !powerTwo) {
                num1 = (txtScreen.text.toString() + "").toDouble()
                powerTwo = true
                lastDot = false
                lastNumeric = false
                txtScreen.text = null
                operations += "2"
            }
            operations += "2"
        }
        percent.setOnClickListener {
            if (lastNumeric && !bpercent) {
                num1 = (txtScreen.text.toString() + "").toDouble()
                bpercent = true
                lastDot = false
                lastNumeric = false
                txtScreen.text = null
                operations += "%"
            } else {
                operations += "%"
            }
        }

        equal.setOnClickListener(object : View.OnClickListener {
            var nf: NumberFormat = DecimalFormat("#.######")
            override fun onClick(v: View) {
                lastDot = false
                if (txtScreen.text.toString() == "" || txtScreen.text.toString() == "Error") {
                    operations = ""
                } else {
                    if (operations[operations.length - 1] == '+') {
                        num2 = (txtScreen.text.toString() + "").toDouble()
                        txtScreen.text = nf.format(num1 + num2)
                        plu = false
                    } else if (operations[operations.length - 1] == '-') {
                        num2 = (txtScreen.text.toString() + "").toDouble()
                        txtScreen.text = nf.format(num1 - num2)
                        minu = false
                    } else if (operations[operations.length - 1] == '*') {
                        num2 = (txtScreen.text.toString() + "").toDouble()
                        txtScreen.text = nf.format(num1 * num2)
                        mul = false
                    } else if (operations[operations.length - 1] == '/') {
                        num2 = (txtScreen.text.toString() + "").toDouble()
                        if (num2 == 0.0) {
                            txtScreen.text = "Error"
                            setError = true
                        } else {
                            txtScreen.text = nf.format(num1 / num2)
                        }
                        div = false
                    } else if (operations[operations.length - 1] == '√') {
                        txtScreen.text = nf.format(kotlin.math.sqrt(num1))
                        sqrt = false
                    } else if (operations[operations.length - 1] == '2') {
                        txtScreen.text = nf.format(num1.pow(2.0))
                        powerTwo = false
                    } else if (operations[operations.length - 1] == '!') {
                        if (num1 > 0 && num1 <= 104) {
                            txtScreen.text = nf.format(factorial(num1))
                        } else {
                            txtScreen.text = "Error"
                            setError = true
                        }
                        bfactorial = false
                    } else if (operations[operations.length - 1] == 'l') {
                        txtScreen.text = nf.format(ln(num1))
                        bnatlog = false
                    } else if (operations[operations.length - 1] == 'g') {
                        txtScreen.text = nf.format(log10(num1))
                        blogar = false
                    } else if (operations[operations.length - 1] == 's') {
                        txtScreen.text = nf.format(kotlin.math.sin(toRadians(num1)))
                        bsinus = false
                    } else if (operations[operations.length - 1] == 't') {
                        txtScreen.text = nf.format(kotlin.math.tan(toRadians(num1)))
                        btangent = false
                    } else if (operations[operations.length - 1] == '%') {
                        num2 = (txtScreen.text.toString() + "").toDouble()
                        txtScreen.text = nf.format(num1 * num2 / 100)
                        bpercent = false
                    } else if (operations[operations.length - 1] == '^') {
                        num2 = (txtScreen.text.toString() + "").toDouble()
                        txtScreen.text = nf.format(num1.pow(num2))
                        bpower = false
                    } else if (operations[operations.length - 1] == 'n') {
                        num2 = (txtScreen.text.toString() + "").toDouble()
                        txtScreen.text = nf.format(num1.pow(1 / num2))
                        bntroot = false
                    }
                }
            }
        })

        back.run {
            setOnClickListener {
                if (txtScreen.text != "") {
                    var s = txtScreen.text.toString()
                    s = s.substring(0, s.length - 1)
                    txtScreen.text = s
                    lastDot = false
                    lastNumeric = false
                }
            }
        }
        clear.setOnClickListener {
            txtScreen.text = ""
            lastDot = false
            lastNumeric = false
        }
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            factorial?.setOnClickListener(View.OnClickListener {
                if (lastNumeric && !bfactorial) {
                    num1 = (txtScreen.text.toString() + "").toDouble()
                    bfactorial = true
                    lastDot = false
                    lastNumeric = false
                    operations += "!"
                } else {
                    operations += "!"
                }
            })
            natlog?.setOnClickListener {
                if (lastNumeric && !bnatlog) {
                    num1 = (txtScreen.text.toString() + "").toDouble()
                    bnatlog = true
                    lastDot = false
                    lastNumeric = false
                    operations += "l"
                } else {
                    operations += "l"
                }
                if (num1 == 0.0) {
                    setError = true
                    txtScreen.text = "Error"
                }
            }
            logar?.setOnClickListener {
                if (lastNumeric && !bnatlog) {
                    num1 = (txtScreen.text.toString() + "").toDouble()
                    blogar = true
                    lastDot = false
                    lastNumeric = false
                    operations += "g"
                } else {
                    operations += "g"
                }
            }
            sinus?.setOnClickListener {
                if (lastNumeric && !bsinus) {
                    num1 = (txtScreen.text.toString() + "").toDouble()
                    bsinus = true
                    lastDot = false
                    lastNumeric = false
                    operations += "s"
                } else {
                    operations += "s"
                }
            }
            cosine?.setOnClickListener {
                if (lastNumeric && !bcosine) {
                    num1 = (txtScreen.text.toString() + "").toDouble()
                    bcosine = true
                    lastDot = false
                    lastNumeric = false
                    operations += "c"
                } else {
                    operations += "c"
                }
            }
            tangent?.setOnClickListener {
                if (lastNumeric && !btangent) {
                    num1 = (txtScreen.text.toString() + "").toDouble()
                    btangent = true
                    lastDot = false
                    lastNumeric = false
                    operations += "t"
                } else {
                    operations += "t"
                }
            }
            power?.setOnClickListener {
                if (lastNumeric && !bpower) {
                    num1 = (txtScreen.text.toString() + "").toDouble()
                    bpower = true
                    lastDot = false
                    lastNumeric = false
                    txtScreen.text = null
                    operations += "^"
                } else {
                    operations += "^"
                }
            }
            nthroot?.setOnClickListener {
                if (lastNumeric && !bntroot) {
                    num1 = (txtScreen.text.toString() + "").toDouble()
                    bntroot = true
                    lastDot = false
                    lastNumeric = false
                    txtScreen.text = null
                    operations += "n"
                } else {
                    operations += "n"
                }
            }
        }
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        savedInstanceState.putString("displayText", txtScreen?.text.toString())
        savedInstanceState.putString("operations", operations)
        savedInstanceState.putBoolean("lastNumeric", true)
        savedInstanceState.putDouble("num1", num1)
        savedInstanceState.putDouble("num2", num2)
        super.onSaveInstanceState(savedInstanceState)
    }


    fun factorial(number: Double): Long {
        var result: Long = 1
        var factor = 2
        while (factor <= number) {
            result *= factor.toLong()
            factor++
        }
        return result
    }

}

