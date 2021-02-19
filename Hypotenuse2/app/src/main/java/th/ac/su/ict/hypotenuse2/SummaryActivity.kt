package th.ac.su.ict.hypotenuse2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SummaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)

        var aScore=findViewById<TextView>(R.id.aScore)
        var bScore=findViewById<TextView>(R.id.bScore)
        var cScore=findViewById<TextView>(R.id.cScore)

        var btnOK=findViewById<Button>(R.id.btnOk)

        val A=intent.getStringExtra("a")
        aScore.setText(A)
        val B=intent.getStringExtra("b")
        bScore.setText(B)
        val C=intent.getStringExtra("c")
        cScore.setText(C)

        val okBtn=findViewById<Button>(R.id.btnOk);
        okBtn.setOnClickListener {
            var intent = Intent()
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}