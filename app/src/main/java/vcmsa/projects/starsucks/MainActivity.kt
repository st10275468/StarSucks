package vcmsa.projects.starsucks

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vcmsa.projects.starsucks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    /*
    private lateinit var  sb1: ImageView2
    private lateinit var  sb2: ImageView
    private lateinit var  sb3: ImageView
    private lateinit var  sb4: ImageView
    private lateinit var  sb5: ImageView
    private lateinit var  sb6: ImageView
*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    //Way to bind our images and do stuff with them when it is clicked
        val binding = ActivityMainBinding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    //Making it do something when the image is clicked
        binding.imageView2.setOnClickListener(){}



    }
}