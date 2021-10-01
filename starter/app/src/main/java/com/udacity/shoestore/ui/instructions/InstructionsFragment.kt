package com.udacity.shoestore.ui.instructions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentInstructionsBinding
import com.udacity.shoestore.models.Instruction
import com.udacity.shoestore.ui.LoginFragmentDirections
import com.udacity.shoestore.ui.ViewModel

/**
 * A simple [Fragment] subclass.
 */
class InstructionsFragment : Fragment() {

    private lateinit var _binding: FragmentInstructionsBinding
    private val binding get() = _binding

    private var adapterInstruction = InstructionAdapter()
    private lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_instructions, container, false)
        
        // Get the viewmodel
        viewModel = ViewModelProvider(this).get(ViewModel::class.java)
        
        binding.lifecycleOwner = this
        binding.recycler.adapter = adapterInstruction
        
        viewModel.instructionList1.observe(viewLifecycleOwner, { instructionList ->
            adapterInstruction.submitList(instructionList)
        })

        binding.btnGoToShopScreen.setOnClickListener {
            it.findNavController().navigate(InstructionsFragmentDirections.actionInstructionsFragmentToShoeListFragment())
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
    }

}