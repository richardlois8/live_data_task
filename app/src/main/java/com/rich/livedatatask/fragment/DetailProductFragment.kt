package com.rich.livedatatask.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.rich.livedatatask.R
import com.rich.livedatatask.databinding.FragmentDetailProductBinding
import com.rich.livedatatask.databinding.ToolbarBinding
import com.rich.livedatatask.model.Product

class DetailProductFragment : Fragment() {
    private lateinit var binding: FragmentDetailProductBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_detail_product, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val argsData = arguments?.getParcelable<Product>("data")
        binding.toolbarDetail.toolbarTitle.text = argsData?.productName
        binding.productDetail = argsData
        binding.btnBeli.setOnClickListener {
            val intentWa = Intent().apply {
                action = Intent.ACTION_VIEW
//                putExtra(
//                    Intent.EXTRA_TEXT,
//                    "Halo, saya tertarik dengan produk ${argsData?.productName} dengan harga Rp. ${argsData?.price}. Apakah masih tersedia?"
//                )
//                type = "text/plain"
                var url = "https://api.whatsapp.com/send?phone=+6285748277740&text=Halo, saya tertarik dengan produk ${argsData?.productName} dengan harga Rp. ${argsData?.price}. Apakah masih tersedia?"
                setData(Uri.parse(url))
            }
            startActivity(intentWa)
        }
    }
}