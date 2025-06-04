package vcmsa.ci.gametesterlog

import android.app.Notification.Action
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    private lateinit var btnStart: Button
    private lateinit var btnExit: Button
    private lateinit var etStudentName: EditText
    private lateinit var etStudentNumber: EditText
    private lateinit var tvHeading: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnStart = findViewById(R.id.btnStart)
        btnExit = findViewById(R.id.btnExit)
        etStudentName = findViewById(R.id.etStudentName)
        etStudentNumber = findViewById(R.id.etStudentNumber)
        tvHeading = findViewById(R.id.tvHeading)

        btnStart.setOnClickListener{
            startActivity(Intent(this, SecondActivity::class.java))
        }

        btnExit.setOnClickListener{
            startActivity(Intent(this, btnExit::class.java))
        }



    }

}