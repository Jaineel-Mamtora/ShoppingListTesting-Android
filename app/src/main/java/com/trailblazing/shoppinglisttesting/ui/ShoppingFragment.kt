package com.trailblazing.shoppinglisttesting.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.trailblazing.shoppinglisttesting.R
import kotlinx.android.synthetic.main.fragment_shopping.*

class ShoppingFragment : Fragment(R.layout.fragment_shopping) {

    private lateinit var viewModel: ShoppingViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[ShoppingViewModel::class.java]

        fabAddShoppingItem.setOnClickListener {
            findNavController().navigate(
                ShoppingFragmentDirections.actionShoppingFragmentToAddShoppingItemFragment()
            )
        }
    }

}