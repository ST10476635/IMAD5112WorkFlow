package vcmsa.ci.calculation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.edtNumberT)
        val num2 = findViewById<EditText>(R.id.edtNumTwo)
        val btnAdd = findViewById<Button>(R.id.btnnumAdd)
        val btnSubtract = findViewById<Button>(R.id.btnnumSub)
        val txtAnswer = findViewById<TextView>(R.id.txtnumAnswer)

        btnAdd.setOnClickListener {

            val n1 = num1.text.toString().toIntOrNull()?: 0
            val n2 = num2.text.toString().toIntOrNull()?: 0

            val result = n1 + n2

            txtAnswer.text = "Sum is: $result"

        }

        btnSubtract.setOnClickListener {
            val n1 = num1.text.toString().toIntOrNull()?: 0
            val n2 = num2.text.toString().toIntOrNull()?: 0

            val result = n1 - n2

            txtAnswer.text = "Sum is: $result"

        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    }
}