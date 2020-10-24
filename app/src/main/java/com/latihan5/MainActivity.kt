package com.latihan5

import android.Manifest
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlinpermissions.KotlinPermissions
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        KotlinPermissions.with(this) // where this is an FragmentActivity instance
            .permissions(Manifest.permission.CAMERA)
            .onAccepted { permissions ->
                //List of accepted permissions
            }
            .onDenied { permissions ->
                //List of denied permissions
            }
            .onForeverDenied { permissions ->
                //List of forever denied permissions
            }
            .ask()
        btnPindahActivityExplisit.setOnClickListener {
           startActivity(Intent(this, ExplisitIntentActivity::class.java))
        }
        btnPindahActivityImplisit.setOnClickListener {
            startActivity(Intent (this,ImplisitIntentActivity::class.java ))
        }
        btnPindahActivityIntentBundle.setOnClickListener {
            val intent : Intent = Intent (this, IntentBundleActivity::class.java)
            val bundle = Bundle()
            bundle.putExtra("Nama Panggilan", "Hanum")
            bundle.putExtra("TTL", "Batang,05 Desember 1998")
            bundle.putExtra("Alamat Rumah", "Ds.Kembanglangit Kec.Blado Kab.Batang")
            bundle.putExtra("Hobby", "Membaca,Menulis,Menonton")
            bundle.putExtra("Agama", "Islam")
            bundle.putExtra("Email", "ismihanum05@gmail.com")
            bundle.putExtra("FOTO", "https://drive.google.com/drive/u/0/my-drive")
            
            intent.putExtra("bundle", bundle);
            
            startActivity(intent)

        }
        btnWebView.setOnClickListener {
            startActivity(Intent (this,WebViewActivity::class.java ))
        }
    }

}
