package com.example.hesapmakinesi

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    var first = ""
    var second=""
var symbol : String?=null
    var x =0.0
     var y =0.0
    var z =0.0
    var v=0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // TextView ve Button'ları buluyoruz
        val calculate = findViewById<TextView>(R.id.Counter)
        val zero: Button = findViewById(R.id.b0)
        val one: Button = findViewById(R.id.b1)
        val two: Button = findViewById(R.id.b2)
        val three: Button = findViewById(R.id.b3)
        val four: Button = findViewById(R.id.b4)
        val five: Button = findViewById(R.id.b5)
        val six: Button = findViewById(R.id.b6)
        val seven: Button = findViewById(R.id.b7)
        val eight: Button = findViewById(R.id.b8)
        val nine: Button = findViewById(R.id.b9)
        val esittir: Button = findViewById(R.id.esittir)
        val ondalik: Button = findViewById(R.id.ondalik)
        val carpma: Button = findViewById(R.id.carpma)
        val bolme: Button = findViewById(R.id.bolme)
        val toplama: Button = findViewById(R.id.toplama)
        val cikartma: Button = findViewById(R.id.cikartma)
        val clear: Button = findViewById(R.id.Clear)

        // Button tıklama olayları
        carpma.setOnClickListener {
            if(symbol==null){
                symbol="x"
                x=first.toDouble()
                first+=symbol
                second=first
                first=" "
            }
            println("Butona tıklanıldı")
        }
        esittir.setOnClickListener {
            Result()
            println("Butona tıklanıldı")
        }
        ondalik.setOnClickListener {
            calculate(".")
            println("Butona tıklanıldı")
        }
        bolme.setOnClickListener {
            if(symbol==null){
                symbol="/"
                x=first.toDouble()
                first+=symbol
                second=first
                first=" "
            }
            println("Butona tıklanıldı")
        }
        toplama.setOnClickListener {
            if(symbol==null){
                symbol="+"
                x=first.toDouble()
                first+=symbol
                second=first
                first=" "
            }
            println("Butona tıklanıldı")
        }
        clear.setOnClickListener {
calculate.setText("0")
            first=""
            symbol=null
            println("Butona tıklanıldı")
        }
        cikartma.setOnClickListener {
            if(symbol==null){
                symbol="-"
                x=first.toDouble()
                first+=symbol
                second=first
                first=" "
            }
            println("Butona tıklanıldı")
        }
        zero.setOnClickListener {
            calculate("0")
            println("Butona tıklanıldı")
        }
        one.setOnClickListener {
            calculate("1")
            println("Butona tıklanıldı")
        }
        two.setOnClickListener {
            calculate("2")
            println("Butona tıklanıldı")
        }
        three.setOnClickListener {
            calculate("3")
            println("Butona tıklanıldı")
        }
        four.setOnClickListener {
            calculate("4")
            println("Butona tıklanıldı")
        }
        five.setOnClickListener {
            calculate("5")
            println("Butona tıklanıldı")
        }
        six.setOnClickListener {
            calculate("6")
            println("Butona tıklanıldı")
        }
        seven.setOnClickListener {
            calculate("7")
            println("Butona tıklanıldı")
        }
        eight.setOnClickListener {
            calculate("8")
            println("Butona tıklanıldı")
        }
        nine.setOnClickListener {
            calculate("9")
            println("Butona tıklanıldı")
        }
    }

    fun Result() {
        y = first.toDouble()
        z = x + y
        val calculate = findViewById<TextView>(R.id.Counter)
        if (symbol == "+") {
            z = x + y
        }
        if (symbol == "/") {
            z = x / y
        }
        if (symbol == "x") {
            z = x * y
        }
        if (symbol == "-") {
            z = x - y
        }

        if (z - Math.floor(z) == 0.0) {
            v = Math.round(z).toInt()
            calculate.text = v.toString()
        } else {
            calculate.text = z.toString()
        }
    }
//calculate.setText("0")
//            first=" "
    //                 x=first.toDouble()
    // calculate fonksiyonu sınıf dışında, ana sınıfın içinde tanımlandı
    fun calculate(value: String) {
        val calculate = findViewById<TextView>(R.id.Counter)
        when (value) {

            "0" -> {
                if(first==" ")
                    return
                first += value

            }
            "1" -> {
                first += value
            }
            "2" ->                 first += value

            "3" ->                 first += value

            "4" ->                 first += value

            "5" ->                 first += value

            "6" ->                 first += value

            "7" ->                 first += value

            "8" ->                 first += value

            "9" ->                 first += value

            "." ->                 first += value

            else -> {
                // Eğer value 0-9 dışında bir değer ise buraya düşer
            }

        }
        calculate.setText(""+first)
    }
}
