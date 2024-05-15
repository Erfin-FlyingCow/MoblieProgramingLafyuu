package com.example.tugas1

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var gridView:GridView ? = null
    private  var arrayList:ArrayList<productitem>? = null
    private var productadapter:productadapter? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.home)

        val flashSale = findViewById<ImageView>(R.id.superFlasesale)
        flashSale.setOnClickListener(){
        goToOffer()
        }

        val btnfavorite = findViewById<ImageView>(R.id.bfavorite)
        btnfavorite.setOnClickListener(){
            goToFavorite()
        }

        val nikeairbtn = findViewById<ImageView>(R.id.nikeairproduct)
        nikeairbtn.setOnClickListener(){
            goToDetailNikeAir()
        }

        showGridview()
    }

    fun goToOffer() {
        Intent(this,Offer::class.java).also {
            startActivity(it)
            finish()
        }
    }

    fun goToFavorite(){
        Intent(this,Favorite::class.java).also {
            startActivity(it)
            finish()
        }
    }

    fun goToDetailNikeAir(){
        Intent(this,ProductDetail::class.java).also {
            startActivity(it)
            finish()
        }
    }

    fun showGridview() {
        gridView =findViewById(R.id.my_gridview)
        arrayList=ArrayList()
        arrayList=setDataList()
        productadapter = productadapter(applicationContext, arrayList!!)
        gridView?.adapter=productadapter
        gridView?.onItemClickListener = this

    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var productitem:productitem = arrayList!!.get(position)
    }


    private fun setDataList(): ArrayList<productitem> {
        var arrayList: ArrayList<productitem> = ArrayList()
        arrayList.add(productitem(R.drawable.gv1))
        arrayList.add(productitem(R.drawable.gv2))
        arrayList.add(productitem(R.drawable.gv3))
        arrayList.add(productitem(R.drawable.gv4))

        return arrayList
    }


}