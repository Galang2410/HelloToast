package com.example.hellotoast

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var mCount = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mShowCount = findViewById<TextView>(R.id.show_count)
        val buttonCountUp = findViewById<Button>(R.id.button_count)
        val buttonToast = findViewById<Button>(R.id.button_toast)
        val buttonSwitchPage = findViewById<Button>(R.id.button_switchpage
        )
        val buttonCamera = findViewById<Button>(R.id.button_camera)
        val buttonContact = findViewById<Button>(R.id.button_contact)



        buttonCountUp.setOnClickListener(View.OnClickListener {
            mCount++;
            Log.d("mCount", Integer.toString(mCount))
            if (mShowCount != null)
                mShowCount.text = mCount.toString()
        })


        buttonToast.setOnClickListener(View.OnClickListener {
            val tulisan: String = mShowCount?.text.toString()
            val toast: Toast = Toast.makeText(this, "Angka yang dimunculkan "+tulisan, Toast.LENGTH_LONG)
            toast.show()
        })


        buttonSwitchPage.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        })

        buttonCamera.setOnClickListener(View.OnClickListener {
            val intentCapture = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intentCapture)
        })

        buttonCamera.setOnClickListener(View.OnClickListener {
            val intentCapture = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intentCapture)
        })

        buttonContact.setOnClickListener(View.OnClickListener {
            val intentContact = Intent(Intent.ACTION_VIEW)
            intentContact.setData(ContactsContract.Contacts.CONTENT_URI)
            startActivity(intentContact)
        })






    }

}