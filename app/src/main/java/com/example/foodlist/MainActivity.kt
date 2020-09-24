package com.example.foodlist

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.foodticket.view.*

class MainActivity : AppCompatActivity() {
    var listOfFood=ArrayList<Food>()
    var adapter:FoodAdapter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //load food
        listOfFood.add(Food("Chicken Biriyani","Rs:250",R.drawable.nv1,true))

        listOfFood.add(Food("Chicken Fried Rice","Rs:180",R.drawable.nv2,false))
        listOfFood.add(Food("Chilly Chicken","Rs:200",R.drawable.nv3,true))
        listOfFood.add(Food("Chicken ButterMasala","Rs:240",R.drawable.nv4,true))
        listOfFood.add(Food("Chicken Pakora","Rs:150",R.drawable.nv5,true))

        adapter= FoodAdapter(this,listOfFood)
        tvListFood.adapter=adapter
    }

    class FoodAdapter: BaseAdapter {
        var context:Context?=null
        var listOfFood=ArrayList<Food>()
        constructor(context:Context,listOfFood:ArrayList<Food>):super(){
            this.listOfFood=listOfFood
            this.context=context
        }

        override fun getCount(): Int {
           return listOfFood.size
        }

        override fun getItem(position: Int): Any {
            return listOfFood[position]
        }

        override fun getItemId(position: Int): Long {
          //  TODO("Not yet implemented")
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            //TODO("Not yet implemented")

            var food=listOfFood[position]
            var inflator=context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var myView= inflator.inflate(R.layout.foodticket,null)
            myView.tvName.text=food.name
            myView.tvDes.text=food.des
            myView.ivName.setImageResource(food.image!!)
            return myView
        }

    }
}