package com.rich.livedatatask

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rich.livedatatask.databinding.ProductItemBinding
import com.rich.livedatatask.model.Product

class ProductAdapter(var listProduct : ArrayList<Product>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    var onClick : ((Product) -> Unit)? = null

    class ViewHolder(var binding : ProductItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bindView(product: Product, onClick: ((Product) -> Unit)?){
            binding.dataProduct = product
            binding.cardView.setOnClickListener {
                onClick?.invoke(product)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = ProductItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(listProduct[position],onClick)
    }

    override fun getItemCount(): Int = listProduct.size

    fun setProducts(products : ArrayList<Product>){
        listProduct = products
    }
}