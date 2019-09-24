package com.ibeth.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdapterKnowledge(private val context: Context, private val topics: List<String>, private val imagenes: IntArray) : BaseAdapter() {

    override fun getCount(): Int {
        return topics.size
    }

    override fun getItem(i: Int): Any {
        return topics[i]
    }

    override fun getItemId(i: Int): Long {
        return 0
    }

    override fun getView(i: Int, view: View?, viewGroup: ViewGroup): View {
        var view = view
        if (view == null) {

            val layoutInflater = context.getSystemService(context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = layoutInflater.inflate(R.layout.item_knowledge, null)
        }
        val iTopic = view!!.findViewById<ImageView>(R.id.imagen)
        val tTittle = view.findViewById<TextView>(R.id.tittle)
        //iTopic.se(lincisos.get(position));
        tTittle.text = topics[i]
        return view
    }
}
