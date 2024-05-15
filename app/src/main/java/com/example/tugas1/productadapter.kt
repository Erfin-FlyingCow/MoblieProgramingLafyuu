package com.example.tugas1

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class productadapter(var context: Context, var arrayList: ArrayList<productitem>): BaseAdapter() {
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View = View.inflate(context, R.layout.itemview, null)

        var gambar:ImageView = view.findViewById(R.id.gambar)

        var productitem : productitem = arrayList.get(position)

        gambar.setImageResource(productitem.gambar!!)

        return  view
    }


}