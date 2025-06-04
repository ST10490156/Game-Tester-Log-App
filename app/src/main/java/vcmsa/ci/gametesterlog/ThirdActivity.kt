package vcmsa.ci.gametesterlog

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.EditText
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    private lateinit var tvDisplay: TextView
    private lateinit var etAverage: EditText
    private lateinit var etHighestGameGenre: EditText
    private lateinit var etTotalPlay: EditText
    private lateinit var btnBackToScreen: Button
    private lateinit var btnExitApp: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        tvDisplay = findViewById(R.id.tvDisplay)
        etAverage = findViewById(R.id.etAverage)
        etHighestGameGenre = findViewById(R.id.etHighestGameGenre)
        etTotalPlay = findViewById(R.id.etTotalPlay)
        btnBackToScreen = findViewById(R.id.btnBackToScreen)
        btnExitApp = findViewById(R.id.btnExitApp)

        btnBackToScreen.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

        btnExitApp.setOnClickListener{
            startActivity(Intent(this, btnExitApp::class.java))
        }

    }
}