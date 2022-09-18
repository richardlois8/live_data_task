package com.rich.livedatatask.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rich.livedatatask.R
import com.rich.livedatatask.model.Product

class ProductViewModel : ViewModel() {
    val listData = arrayListOf(
        Product(R.drawable.prod1,"Iphone 14 Pro Max",14000000,100,"Handphone buat orang kaya"),
        Product(R.drawable.prod2,"Laptop ROG Zephyrus",20000000,100,"Laptop buat orang kaya"),
        Product(R.drawable.prod1,"Macbook Pro 2021",7000000,100,"Laptop buat orang kaya"),
        Product(R.drawable.prod2,"Iphone 14 Pro Max",15000000,100,"Handphone buat orang kaya"),
        Product(R.drawable.prod1,"Laptop ROG Zephyrus",299000,100,"Laptop buat orang kaya"),
        Product(R.drawable.prod2,"Macbook Pro 2021",1500000,100,"Laptop buat orang kaya"),
    )

    val dataProducts : MutableLiveData<ArrayList<Product>> = MutableLiveData()

    fun getProducts(){
        dataProducts.value = listData
    }
}