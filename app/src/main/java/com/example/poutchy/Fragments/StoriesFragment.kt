package com.example.poutchy.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.poutchy.Activities.MainActivity
import com.example.poutchy.Adapters.BDAdapter
import com.example.poutchy.R
import kotlinx.android.synthetic.main.stories_fragment.*

class StoriesFragment :Fragment() {
    var adapter:BDAdapter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter = BDAdapter()
        adapter!!.listBD =MainActivity.listBD
        adapter!!.context = this.context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.stories_fragment, container, false)
        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        listBD.adapter = adapter
    }

}