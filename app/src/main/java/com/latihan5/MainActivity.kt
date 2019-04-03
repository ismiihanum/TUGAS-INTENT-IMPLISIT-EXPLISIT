package com.latihan5

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPindahActivityExplisit.setOnClickListener {
           startActivity(Intent(this, ExplisitIntentActivity::class.java))
        }
        btnPindahActivityImplisit.setOnClickListener {
            startActivity(Intent (this,ImplisitIntentActivity::class.java ))
        }
        btnPindahActivityIntentBundle.setOnClickListener {
            val intent : Intent = Intent (this, IntentBundleActivity::class.java)
            intent.putExtra("Nama Panggilan", "Hanum")
            intent.putExtra("TTL", "Batang,05 Desember 1998")
            intent.putExtra("Alamat Rumah", "Ds.Kembanglangit Kec.Blado Kab.Batang")
            intent.putExtra("Hobby", "Membaca,Menulis,Menonton")
            intent.putExtra("Agama", "Islam")
            intent.putExtra("Email", "ismihanum05@gmail.com")
            intent.putExtra("FOTO", R.drawable.hanum)

            startActivity(intent)

        }
    }

}
