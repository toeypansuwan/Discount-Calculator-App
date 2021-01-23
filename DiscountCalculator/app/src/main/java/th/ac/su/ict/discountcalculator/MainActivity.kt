package th.ac.su.ict.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var price = findViewById<EditText>(R.id.price)
        var percent = findViewById<EditText>(R.id.percent)
        var total = findViewById<TextView>(R.id.total)

        val btn = findViewById<Button>(R.id.btn)
        val vat = findViewById<CheckBox>(R.id.vat)


        btn.setOnClickListener {
            val priceInt = price.text.toString().toInt()
            val percentInt = percent.text.toString().toInt()
            var totalInt = 0.0
            if (vat.isChecked){
                totalInt =(priceInt - (priceInt * percentInt/100.0)) + (priceInt - (priceInt * percentInt/100.0))*7/100.0
            }
            else{
                totalInt = priceInt - (priceInt * percentInt/100.0)
            }
            total.text = totalInt.toString()
        }

    }
}