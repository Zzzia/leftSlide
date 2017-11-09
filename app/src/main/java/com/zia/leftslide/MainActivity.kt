package com.zia.leftslide

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = Adapter(this)
        recycler.setExtraViewId(R.id.item_cancel)
        recycler.setMyListener(object : MyRecyclerView.MyListener {
            override fun onItemClick(view: View, position: Int) {
                Toast.makeText(this@MainActivity,"click item",Toast.LENGTH_SHORT).show()
            }

            override fun onDeleteClick(position: Int) {
                Toast.makeText(this@MainActivity,"click delete",Toast.LENGTH_SHORT).show()
            }
        })
    }
}
