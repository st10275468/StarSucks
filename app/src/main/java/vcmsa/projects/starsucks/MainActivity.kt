package vcmsa.projects.starsucks

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import vcmsa.projects.starsucks.databinding.ActivityMainWithNavBinding


class MainActivity : AppCompatActivity(), View.OnClickListener,
    NavigationView.OnNavigationItemSelectedListener {
    //Creating instance of order object
    var order = Order()
    private lateinit var binding: ActivityMainWithNavBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val binding = ActivityMainWithNavBinding.inflate(layoutInflater)
        setContentView(binding.root)


    //Way to bind our images and do stuff with them when it is clicked

        setSupportActionBar(binding.navToolbar1)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        var toggleOnOff = ActionBarDrawerToggle(this, binding.drawerLayout, binding.navToolbar1,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close)
        binding.drawerLayout.addDrawerListener(toggleOnOff)
        toggleOnOff.syncState()

        binding.navView.bringToFront()
        binding.navView.setNavigationItemSelectedListener(this)
        //
        binding.imageView2.setOnClickListener(this)
        binding.imageView3.setOnClickListener(this)
        binding.imageView4.setOnClickListener(this)
        binding.imageView5.setOnClickListener(this)
        binding.imageView6.setOnClickListener(this)
        binding.imageView7.setOnClickListener(this)

    }
    override fun onBackPressed(){

        if(binding.drawerLayout.isDrawerOpen(GravityCompat.START)){
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        }
            else{
                super.onBackPressed()
        }
    }

    override fun onClick(v: View?){

        when (v?.id) {
            //When imageview clicked, sets product name to soy latte
            R.id.imageView2 -> order.productName = "Soy Latte"
            R.id.imageView3 -> order.productName = "Chocco Frapp"
            R.id.imageView4 -> order.productName = "Bottled Americano"
            R.id.imageView5 -> order.productName = "Rainbow Frapp"
            R.id.imageView6 -> order.productName = "Caramel Frapp"
            R.id.imageView7 -> order.productName = "Black Forest Frapp"


        }
        Toast.makeText(this, "MMM" + order.productName, Toast.LENGTH_SHORT).show()
        openIntent(applicationContext, order.productName, order_details::class.java)



    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {when (item.itemId){
       R.id.nav_photo -> openIntent(this, "", CoffeeSnapsActivity::class.java)
    }
        binding.drawerLayout.closeDrawer(GravityCompat.START)

        return true
    }
}