package com.example.homework1_homepagecovidapp

import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import lookup.CaseData
import lookup.adapter.CaseAdapter
import lookup.ui.HotlineActivity
import lookup.ui.LookUpActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupLookupButton()
        setupHotlineButton()

        val caseList = mutableListOf<CaseData>()
        caseList.add(CaseData(totalCase = "10", statusCase = "Positive"))
        caseList.add(CaseData(totalCase = "100", statusCase = "Recovered"))
        caseList.add(CaseData(totalCase = "1", statusCase = "Death"))
        val adapter = CaseAdapter(caseList)
        rvLookUpStatusCases.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvLookUpStatusCases.adapter = adapter
//        rvLookUpStatusCases.addItemDecoration(object : RecyclerView.ItemDecoration() {
//            override fun getItemOffsets(
//                outRect: Rect,
//                view: View,
//                parent: RecyclerView,
//                state: RecyclerView.State
//            ) {
//                val position = parent.getChildAdapterPosition(view) // item position
//
//                val spanCount = 2
//                val spacing = 100 //spacing between views in grid
//
//
//                if (position >= 0) {
//                    val column = position % spanCount // item column
//                    outRect.left =
//                        spacing - column * spacing / spanCount // spacing - column * ((1f / spanCount) * spacing)
//                    outRect.right =
//                        (column + 1) * spacing / spanCount // (column + 1) * ((1f / spanCount) * spacing)
//                    if (position < spanCount) { // top edge
//                        outRect.top = spacing
//                    }
//                    outRect.bottom = spacing // item bottom
//                } else {
//                    outRect.left = 0
//                    outRect.right = 0
//                    outRect.top = 0
//                    outRect.bottom = 0
//                }
//            }
//        })
    }

    private fun setupLookupButton() {
        val lookoutBtn = findViewById<Button>(R.id.btnLookup)
        lookoutBtn.setOnClickListener {
            val intent = Intent(this, LookUpActivity::class.java)

            startActivity(intent)
        }
    }

    private fun setupHotlineButton() {
        val hotlineBtn = findViewById<Button>(R.id.btnHotline)
        hotlineBtn.setOnClickListener {
            val intent = Intent(this, HotlineActivity::class.java)

            startActivity(intent)
        }

    }
}