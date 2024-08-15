import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private lateinit var numberButtons: List<Button>
    private lateinit var operatorButtons: List<Button>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)

        // Create buttons and add them to LinearLayouts
        val numberLayout = findViewById<LinearLayout>(R.id.numberLayout) // Replace with your layout ID
        val operatorLayout = findViewById<LinearLayout>(R.id.operatorLayout) // Replace with your layout ID

        // Create button lists and set click listeners
        numberButtons = listOf(
            Button(this).apply { text = "1" },
            Button(this).apply { text = "2" },
            // ... other number buttons
        )
        operatorButtons = listOf(
            Button(this).apply { text = "+" },
            Button(this).apply { text = "-" },
            // ... other operator buttons
        )

        // Add buttons to layouts
        numberLayout.addView(Button(this).apply { text = "1" })
        // ... add other buttons

        // Set click listeners for buttons
        numberButtons.forEach { button ->
            button.setOnClickListener {
                // Handle number button click
            }
        }
        operatorButtons.forEach { button ->
            button.setOnClickListener {
                // Handle operator button click
            }
        }
    }
}