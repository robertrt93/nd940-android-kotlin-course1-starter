package com.udacity.shoestore.ui.shoelist

import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.models.Shoe
import com.udacity.shoestore.ui.ViewModel


/**
 * A simple [Fragment] subclass.
 */
class ShoeListFragment : Fragment() {
    
    private lateinit var _binding: FragmentShoeListBinding
    private val binding get() = _binding
    
    private var shoeAdapter = ShoeAdapter()
    private lateinit var viewModel: ViewModel
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
    }
    
    
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        _binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_shoe_list, container, false)
    
        // Get the viewmodel
        viewModel = ViewModelProvider(this).get(ViewModel::class.java)
        binding.lifecycleOwner = this
        binding.shoeListAdapter.adapter = shoeAdapter
        
        viewModel.shoeList.observe(viewLifecycleOwner, { shoeList ->
            shoeAdapter.submitList(shoeList)
        })
        setHasOptionsMenu(true)
        return binding.root
    }
    
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu, menu)
    }
    
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
   
//        val myLayourt: CardView = CardView(requireContext())
//
//        myLayourt.addView(R.layout.item_list_shoes)
        val myButton = Button(requireContext())
        myButton.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        
        myButton.text = getString(R.string.my_button)
        binding.constraintLayoutShoeList.addView(myButton)
        
        
    }
    
    
    
}