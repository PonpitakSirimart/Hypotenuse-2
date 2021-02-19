package th.ac.su.ict.hypotenuse2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edtTextA=findViewById<EditText>(R.id.edtTextA)
        var edtTextB=findViewById<EditText>(R.id.edtTextB)
        var btnSlove=findViewById<Button>(R.id.btnSlove)

        btnSlove.setOnClickListener {

            var inA:Double=edtTextA.text.toString().toDouble()
            var inB:Double=edtTextB.text.toString().toDouble()

            var calCD=(inA*inA)+(inB*inB)
            var sum = sqrt(calCD)

            var intent=Intent(this@MainActivity,SummaryActivity::class.java)
            intent.putExtra("a",inA.toString())
            intent.putExtra("b",inB.toString())
            intent.putExtra("c",sum.toString())
            startActivity(intent)

        }
    }
}