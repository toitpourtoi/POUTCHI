package com.example.poutchy.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.poutchy.Models.BD
import java.util.ArrayList
import com.example.poutchy.R
import kotlinx.android.synthetic.main.bd_card.view.*

class BDAdapter : BaseAdapter() {
    var context : Context?=null
    var listBD = ArrayList<BD>()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val item = listBD.get(position)
        var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val layoutItem = inflator.inflate(R.layout.bd_card,null)
        layoutItem.name.text = item.name
        layoutItem.bd_overview.setImageResource(item.image)
        return layoutItem


    }

    override fun getItem(position: Int): Any {
        return  this.listBD.get(position)
    }

    override fun getItemId(position: Int): Long {
        return  position.toLong()
    }

    override fun getCount(): Int {
        return  this.listBD.size
    }
}