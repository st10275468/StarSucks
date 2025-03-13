package vcmsa.projects.starsucks

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import vcmsa.projects.starsucks.databinding.ActivityOrderDetailsBinding

class order_details : AppCompatActivity() {
    var order = Order()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_order_details)
        val binding = ActivityOrderDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        order.productName = intent.getStringExtra("order").toString()

        binding.textView2.text = order.productName

        when(order.productName){
            "Soy Latte" -> binding.imageView9.setImageResource(R.drawable.sb1)
            "Chocco Frapp" -> binding.imageView9.setImageResource(R.drawable.sb2)
            "Bottled Americano" -> binding.imageView9.setImageResource(R.drawable.sb3)
            "Rainbow Frapp" -> binding.imageView9.setImageResource(R.drawable.sb4)
            "Caramel Frapp" -> binding.imageView9.setImageResource(R.drawable.sb5)
            "Black Forest Frapp" -> binding.imageView9.setImageResource(R.drawable.sb1)
        }

        binding.floatingActionButton.setOnClickListener(){
            shareIntent(applicationContext, order.productName)
        }
    }
}