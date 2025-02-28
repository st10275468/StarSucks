package vcmsa.projects.starsucks

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import vcmsa.projects.starsucks.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {
    //Creating instance of order object
    var order = Order()
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
        //
        binding.imageView2.setOnClickListener(this)
        binding.imageView3.setOnClickListener(this)
        binding.imageView4.setOnClickListener(this)
        binding.imageView5.setOnClickListener(this)
        binding.imageView6.setOnClickListener(this)
        binding.imageView7.setOnClickListener(this)

    }


    override fun onClick(v: View?){

        when (v?.id) {
            //When imageview clicked, sets product name to soy latte
            R.id.imageView2 -> order.productName = "Soy Latte"
            R.id.imageView3 -> order.productName = "Chocco Frapp"
            R.id.imageView4 -> order.productName = "Bottled Americano"
            R.id.imageView5 -> order.productName = "Rainbow Frapp"
            R.id.imageView6 -> order.productName = "Caramel Frapp"
            R.id.imageView7 -> order.productName = "Black forest Frapp"


        }
        Toast.makeText(this, "MMM" + order.productName, Toast.LENGTH_SHORT).show()

    }
}