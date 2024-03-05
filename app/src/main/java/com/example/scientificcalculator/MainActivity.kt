package com.example.scientificcalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var tvsec: TextView
    lateinit var tvMain: TextView
    lateinit var bac: Button
    lateinit var bc: Button
    lateinit var bbrac1: Button
    lateinit var bbrac2: Button
    lateinit var bsin: Button
    lateinit var bcos: Button
    lateinit var btan: Button
    lateinit var blog: Button
    lateinit var bln: Button
    lateinit var bfact: Button
    lateinit var bsquare: Button
    lateinit var bsqrt: Button
    lateinit var binv: Button
    lateinit var b0: Button
    lateinit var b9: Button
    lateinit var b8: Button
    lateinit var b7: Button
    lateinit var b6: Button
    lateinit var b5: Button
    lateinit var b4: Button
    lateinit var b3: Button
    lateinit var b2: Button
    lateinit var b1: Button
    lateinit var bpi: Button
    lateinit var bmul: Button
    lateinit var bminus: Button
    lateinit var bplus: Button
    lateinit var bequal: Button
    lateinit var bdot: Button
    lateinit var bdiv: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
                // initializing all our variables.
                tvsec = findViewById(R.id.idTVSecondary)
                tvMain = findViewById(R.id.idTVprimary)
                bac = findViewById(R.id.bac)
                bc = findViewById(R.id.bc)
                bbrac1 = findViewById(R.id.bbrac1)
                bbrac2 = findViewById(R.id.bbrac2)
                bsin = findViewById(R.id.bsin)
                bcos = findViewById(R.id.bcos)
                btan = findViewById(R.id.btan)
                blog = findViewById(R.id.blog)
                bln = findViewById(R.id.bln)
                bfact = findViewById(R.id.bfact)
                bsquare = findViewById(R.id.bsquare)
                bsqrt = findViewById(R.id.bsqrt)
                binv = findViewById(R.id.binv)
                b0 = findViewById(R.id.b0)
                b9 = findViewById(R.id.b9)
                b8 = findViewById(R.id.b8)
                b7 = findViewById(R.id.b7)
                b6 = findViewById(R.id.b6)
                b5 = findViewById(R.id.b5)
                b4 = findViewById(R.id.b4)
                b3 = findViewById(R.id.b3)
                b2 = findViewById(R.id.b2)
                b1 = findViewById(R.id.b1)
                bpi = findViewById(R.id.bpi)
                bmul = findViewById(R.id.bmul)
                bminus = findViewById(R.id.bminus)
                bplus = findViewById(R.id.bplus)
                bequal = findViewById(R.id.bequal)
                bdot = findViewById(R.id.bdot)
                bdiv = findViewById(R.id.bdiv)


                b1.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "1")
                }
                b2.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "2")
                }
                b3.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "3")
                }
                b4.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "4")
                }
                b5.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "5")
                }
                b6.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "6")
                }
                b7.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "7")
                }
                b8.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "8")
                }
                b9.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "9")
                }
                b0.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "0")
                }
                bdot.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + ".")
                }
                bplus.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "+")
                }
                bdiv.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "/")
                }
                bbrac1.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "(")
                }
                bbrac2.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + ")")
                }
                bpi.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "3.142")
                    tvsec.text = (bpi.text.toString())
                }
                bsin.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "sin")
                }
                bcos.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "cos")
                }
                btan.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "tan")
                }
                binv.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "^" + "(-1)")
                }
                bln.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "ln")
                }
                blog.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "log")
                }

                bminus.setOnClickListener {
                    val str: String = tvMain.text.toString()
                    if (!str.get(index = str.length - 1).equals("-")) {
                        tvMain.text = (tvMain.text.toString() + "-")
                    }
                }
                bmul.setOnClickListener {
                    val str: String = tvMain.text.toString()
                    if (!str.get(index = str.length - 1).equals("*")) {
                        tvMain.text = (tvMain.text.toString() + "*")
                    }
                }
                bsqrt.setOnClickListener {
                    if (tvMain.text.toString().isEmpty()) {
                        Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
                    } else {
                        val str: String = tvMain.text.toString()
                        val r = Math.sqrt(str.toDouble())
                        val result = r.toString()
                        tvMain.setText(result)
                    }
                }
                bequal.setOnClickListener {
                    val str: String = tvMain.text.toString()
                    val result: Double = evaluate(str)
                    val r = result.toString()
                    tvMain.setText(r)
                    tvsec.text = str
                }
                bac.setOnClickListener {
                    tvMain.setText("")
                    tvsec.setText("")
                }
                bc.setOnClickListener {
                    var str: String = tvMain.text.toString()
                    if (!str.equals("")) {
                        str = str.substring(0, str.length - 1)
                        tvMain.text = str
                    }
                }
                bsquare.setOnClickListener {
                    if (tvMain.text.toString().isEmpty()) {
                        // if the entered number is empty we are displaying an error message.
                        Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
                    } else {
                        val d: Double = tvMain.getText().toString().toDouble()
                        val square = d * d
                        tvMain.setText(square.toString())
                        tvsec.text = "$d²"
                    }
                }
                bfact.setOnClickListener {
                    if (tvMain.text.toString().isEmpty()) {
                        Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
                    } else {
                        val value: Int = tvMain.text.toString().toInt()
                        val fact: Int = factorial(value)
                        tvMain.setText(fact.toString())
                        tvsec.text = "$value`!"
                    }

                }

            }

            fun factorial(n: Int): Int {
                // this method is use to find factorial
                return if (n == 1 || n == 0) 1 else n * factorial(n - 1)
            }

            fun evaluate(str: String): Double {
                return object : Any() {
                    var pos = -1
                    var ch = 0

                    fun nextChar() {
                        ch = if (++pos < str.length) str[pos].toInt() else -1
                    }

                    fun eat(charToEat: Int): Boolean {
                        while (ch == ' '.toInt()) nextChar()
                        if (ch == charToEat) {
                            nextChar()
                            return true
                        }
                        return false
                    }
                    fun parse(): Double {
                        nextChar()
                        val x = parseExpression()
                        if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
                        return x
                    }

                    fun parseExpression(): Double {
                        var x = parseTerm()
                        while (true) {
                            if (eat('+'.toInt())) x += parseTerm() // addition
                            else if (eat('-'.toInt())) x -= parseTerm() // subtraction
                            else return x
                        }
                    }

                    fun parseTerm(): Double {
                        var x = parseFactor()
                        while (true) {
                            if (eat('*'.toInt())) x *= parseFactor() // multiplication
                            else if (eat('/'.toInt())) x /= parseFactor() // division
                            else return x
                        }
                    }

                    fun parseFactor(): Double {
                        if (eat('+'.toInt())) return parseFactor() // unary plus
                        if (eat('-'.toInt())) return -parseFactor() // unary minus

                        var x: Double
                        val startPos = pos

                        if (eat('('.toInt())) { // parentheses
                            x = parseExpression()
                            eat(')'.toInt())
                        } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) {
                            // numbers
                            while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) nextChar()

                            x = str.substring(startPos, pos).toDouble()
                        } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) {

                            while (ch >= 'a'.toInt() && ch <= 'z'.toInt()) nextChar()
                            val func = str.substring(startPos, pos)

                            x = parseFactor()

                            x =
                                if (func == "sqrt") Math.sqrt(x)

                                else if (func == "sin") Math.sin(
                                    Math.toRadians(x)
                                ) else if (func == "cos") Math.cos(
                                    Math.toRadians(x)

                                ) else if (func == "tan")
                                    Math.tan(Math.toRadians(x))
                                else if (func == "log")
                                    Math.log10(x)
                                else if (func == "ln") Math.log(x)
                                else throw RuntimeException(
                                    "Unknown function: $func"
                                )
                        } else {
                            throw RuntimeException("Unexpected: " + ch.toChar())
                        }
                        if (eat('^'.toInt())) x = Math.pow(x, parseFactor()) // exponentiation
                        return x
                    }
                }.parse()
            }
        }