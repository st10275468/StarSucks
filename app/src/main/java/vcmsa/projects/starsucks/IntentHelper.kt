package vcmsa.projects.starsucks


import android.app.Activity
import android.content.Context
import android.content.Intent


fun openIntent(context: Context, order: String, activityToOpen: Class<*>) {

        val intent = Intent(context, activityToOpen)

        intent.putExtra("order", order)

        if (context !is Activity) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        }
        context.startActivity(intent)
    }

    fun shareIntent(context: Context, order: String){
        //Creating new intent object
        val sendIntent = Intent()
        //What this intent will do,,, Send stuff
        sendIntent.setAction(Intent.ACTION_SEND)
        //Extra information to intent
        sendIntent.putExtra(Intent.EXTRA_TEXT, order)
        //What data we are sharing
        sendIntent.type = "text/plain"
        //Create new variable that pulls up the share sheet
        val shareIntent = Intent.createChooser(sendIntent, null)

        if(context !is Activity){
            shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        }
        context.startActivity(shareIntent)
    }




