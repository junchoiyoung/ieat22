package org.techtown.mytest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.techtown.mytest.databinding.ActivityRecipeBinding

class RecipeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecipeBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecipeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val eatView = findViewById<RecyclerView>(R.id.allView)

        val itemList = ArrayList<RecipeData>()

        itemList.add(RecipeData("음식1","설명1"))
        itemList.add(RecipeData("음식2","설명2"))
        itemList.add(RecipeData("음식3","설명3"))
        itemList.add(RecipeData("음식4","설명4"))
        itemList.add(RecipeData("음식5","설명5"))
        itemList.add(RecipeData("음식6","설명6"))
        itemList.add(RecipeData("음식7","설명7"))

        val RecipeAdapter = RecipeAdapter(itemList)
        RecipeAdapter.notifyDataSetChanged()

        eatView.adapter = RecipeAdapter
        eatView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }


}