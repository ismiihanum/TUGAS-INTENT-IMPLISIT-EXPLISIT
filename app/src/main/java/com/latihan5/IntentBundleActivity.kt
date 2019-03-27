package com.latihan5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_bundle.*

class IntentBundleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_bundle)

        val namaku=intent.getStringExtra("NAMAKU")
        val npm=intent.getStringExtra("NPM")
        val kelas=intent.getStringExtra("KELAS")
        val alamat=intent.getStringExtra("ALAMAT")
//        val foto=intent.getStringExtra("FOTO")

        tvNamaku.text = namaku
         tvnpm.text = npm
         tvkelas.text = kelas
         tvalamat.text = alamat



    }
}
