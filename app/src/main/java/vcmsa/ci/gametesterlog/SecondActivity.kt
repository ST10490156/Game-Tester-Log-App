package vcmsa.ci.gametesterlog

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Spinner
import android.widget.EditText
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    private lateinit var etDate: EditText
    private lateinit var etTime: EditText
    private lateinit var spinnerGameGenre: Spinner
    private lateinit var spinnerRating: Spinner
    private lateinit var btnAddEntry: Button
    private lateinit var btnClearInputs: Button
    private lateinit var btnGoToDetails: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        etDate = findViewById(R.id.etDate)
        etTime = findViewById(R.id.etTime)
        spinnerGameGenre = findViewById(R.id.GameGenre)
        spinnerRating = findViewById(R.id.Rating)
        btnAddEntry = findViewById(R.id.btnAddEntry)
        btnClearInputs = findViewById(R.id.btnClearInputs)
        btnGoToDetails = findViewById(R.id.btnGoToDetails)

            

    }
}