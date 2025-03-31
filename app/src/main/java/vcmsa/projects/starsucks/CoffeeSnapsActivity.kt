package vcmsa.projects.starsucks

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.core.CameraSelector
import androidx.core.content.ContextCompat
import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.util.concurrent.ListenableFuture
import vcmsa.projects.starsucks.databinding.ActivityCoffeeSnapsBinding

class CoffeeSnapsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCoffeeSnapsBinding
    private lateinit var cameraProviderFuture: ListenableFuture<ProcessCameraProvider>
    private lateinit var cameraSelector: CameraSelector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_coffee_snaps)

        binding = ActivityCoffeeSnapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cameraProviderResult = regiserForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ){
            if(it.resultCode == Activity.RESULT_OK && it.data != null){
                var bitmap = it.data!!.extras?.get("data") as Bitmap
                binding.imgCameraImage.setImageBitmap(Bitmap)
            }
        }
        binding.photoFab.setOnClickListener(){
            var intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            cameraProviderResult.Launch(intent)
        }
        }

    private fun startCamera(){
        cameraProviderFuture = ProcessCameraProvider.getInstance(this)
        cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA
        cameraProviderFuture.addListener({
            val cameraProvider = camera_ProviderFuture.get()
            val preview = Preview.Builder().build().also{
                it.setSurfaceProvider(binding.imgCameraImage.surfaceProvider)

            }
            imageCapture = ImageCapture.Builder().build()
            try{
                cameraProvider.unbindAll()
                cameraProvider.bindToLifeCycle(this, cameraSelector, preview, imageCapture)
            } catch (e: Exception){
                Log.d("CoffeeSnapsActivity", "Use case binding failed")
            }

        }, ContextCompat.getMainExecutor(this))
    }
    }
