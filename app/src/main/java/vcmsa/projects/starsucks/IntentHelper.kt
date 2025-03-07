package vcmsa.projects.starsucks

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class IntentHelper {


    fun openIntent(context: Context, order: String, ActivityToOpen: Class<*>) {

        val intent = Intent(context, activityToOpen)

        intent.putExtra("order", order)

        if (context !is android.app.Activity) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        }
        context.startActivity(intent)
    }

    fun shareIntent(context: Context, order: String){
        val sendIntent = Intent()
        sendIntent.setAction(Intent.ACTION_SEND)
        sendIntent.putExtra(Intent.EXTRA_TEXT, order)

        sendIntent.type = "text/plain"

        val shareIntent = Intent.createChooser(sendIntent, null)
        if(context !is android.app.Activity){
            shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        }
        context.startActivity(shareIntent)
    }

}

