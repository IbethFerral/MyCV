package com.ibeth.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdapterExperience(private val context: Context, private val companies: List<String>, private val positions: List<String>, private val descriptions: List<String>, private val imagenes: IntArray) : BaseAdapter() {

    override fun getCount(): Int {
        return 0
    }

    override fun getItem(i: Int): Any? {
        return null
    }

    override fun getItemId(i: Int): Long {
        return 0
    }

    override fun getView(i: Int, view: View?, viewGroup: ViewGroup): View {
        var view = view
        if (view == null) {
            val layoutInflater = context.getSystemService(context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = layoutInflater.inflate(R.layout.item_experience, null)
        }
        val iTopic = view!!.findViewById<ImageView>(R.id.imagen)
        val tCompany = view.findViewById<TextView>(R.id.company)
        val tPosition = view.findViewById<TextView>(R.id.tittle)
        val tDescription = view.findViewById<TextView>(R.id.description)
        //iTopic.se(lincisos.get(position));
        tCompany.text = companies[i]
        tPosition.text = positions[i]
        tDescription.text = descriptions[i]
        return view
    }


}
