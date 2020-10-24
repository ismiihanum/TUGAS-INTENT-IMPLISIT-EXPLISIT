package com.latihan5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_intent_bundle.*

class IntentBundleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_bundle)

        val bundle = intent.getBundleExtra("bundle")
        
        val namapanggilan = bundle.getStringExtra("Nama Panggilan")
        val ttl = bundle.getStringExtra("TTL")
        val alamatrumah = bundle.getStringExtra("Alamat Rumah")
        val hobby = bundle.getStringExtra("Hobby")
        val agama = bundle.getStringExtra("Agama")
        val email = bundle.getStringExtra("Email")
        val foto = bundle.getStringExtra("FOTO")


        Glide.with(this).load(foto).override(512, 512).error(R.drawable.hanum).into(ivProfil)
        tvnamapanggilan.text = namapanggilan
        tvttl.text = ttl
        tvalamatrumah.text = alamatrumah
        tvhobby.text = hobby
        tvagama.text = agama
        tvemail.text = email


    }
}
