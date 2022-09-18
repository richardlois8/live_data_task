package com.rich.livedatatask.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rich.livedatatask.ProductAdapter
import com.rich.livedatatask.R
import com.rich.livedatatask.databinding.FragmentListProductsBinding
import com.rich.livedatatask.viewmodel.ProductViewModel

class ListProductsFragment : Fragment() {
    private lateinit var binding : FragmentListProductsBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var productAdapter: ProductAdapter
    private lateinit var viewModel: ProductViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListProductsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
        viewModel = ViewModelProvider(requireActivity()).get(ProductViewModel::class.java)
        viewModel.getProducts()
        viewModel.dataProducts.observe(viewLifecycleOwner, {
            productAdapter.setProducts(it)
        })

    }

    fun setRecyclerView(){
        recyclerView = binding.recyclerView
        productAdapter = ProductAdapter(ArrayList())
        recyclerView.adapter = productAdapter
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        productAdapter.onClick = {
            val action = ListProductsFragmentDirections.actionListProductsFragmentToDetailProductFragment(it)
            findNavController().navigate(action)
        }
    }
}