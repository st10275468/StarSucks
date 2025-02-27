package vcmsa.projects.starsucks

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import vcmsa.projects.starsucks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
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
        setContentView(binding.root)

    //Making it do something when the image is clicked
        binding.imageView2.setOnClickListener() {
            Toast.makeText(  this, "Soy Latte", Toast.LENGTH_LONG).show()
        //Making text appear when coffee is clicked
        }
        binding.imageView3.setOnClickListener() {
            Toast.makeText(  this,  "Chocco Frap", Toast.LENGTH_SHORT).show()

        }
        binding.imageView4.setOnClickListener() {
            Toast.makeText(  this,  "Bottled americano", Toast.LENGTH_SHORT).show()

        }
        binding.imageView5.setOnClickListener() {
            Toast.makeText(  this,  "Rainbow Frappo", Toast.LENGTH_SHORT).show()

        }
        binding.imageView6.setOnClickListener() {
            Toast.makeText(  this,  "Caramel Frappo", Toast.LENGTH_SHORT).show()

        }
        binding.imageView7.setOnClickListener() {
            Toast.makeText(  this,  "Black Forest Frappo", Toast.LENGTH_SHORT).show()

        }


    }
}