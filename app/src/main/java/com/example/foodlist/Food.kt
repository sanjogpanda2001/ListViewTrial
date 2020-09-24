package com.example.foodlist

class Food {

    var name:String?=null
    var des:String?=null
    var image:Int?=null
    var isColor:Boolean=false
    constructor(name:String,des:String,image:Int,isColor:Boolean){
        this.name=name
        this.des=des
        this.image=image
        this.isColor=isColor
    }
}