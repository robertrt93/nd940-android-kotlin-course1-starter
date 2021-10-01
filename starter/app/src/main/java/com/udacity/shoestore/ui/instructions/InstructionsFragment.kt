package com.udacity.shoestore.ui.instructions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentInstructionsBinding
import com.udacity.shoestore.models.Instruction
import com.udacity.shoestore.ui.LoginFragmentDirections

/**
 * A simple [Fragment] subclass.
 */
class InstructionsFragment : Fragment() {

    private lateinit var _binding: FragmentInstructionsBinding
    private val binding get() = _binding

    private var adapterInstruction = InstructionAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_instructions, container, false)
        binding.lifecycleOwner = this
        binding.recycler.adapter = adapterInstruction

        binding.btnGoToShopScreen.setOnClickListener {
            it.findNavController().navigate(InstructionsFragmentDirections.actionInstructionsFragmentToShoeListFragment())
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapterInstruction.submitList(list)
    }

    private val list:List<Instruction> = listOf(Instruction(0, "WHAT ARE SHOESTORE`S SHIPPING OPTIONS?",
        "During checkout, Members and guests can choose their preferred shipping option—we’ll provide an estimated delivery date for every item in your bag based on your shipping selection, the delivery address, and where the item(s) ship from.")
        ,Instruction(1, "WHAT IS SHOESTORE`S RETURN POLICY??",
            "All shoeStore purchases have an extended 60-day return policy (some exceptions apply).\n\n" +
                    "We design our shoes and gear to help you perform at peak level, so if they're not working exactly right for you, we've got you covered. Whether you shop on shoeStore.com, in any of the shoeStore apps, or at a shoeStore store, we give you 60 days to take your shoeStore and Converse purchases for a trial run, confidently knowing you can return items (some exceptions apply) for any reason within those 60 days. That includes custom shoeStore By You sneakers. Even after 60 days, you can still return items if they’re unworn and unwashed. And remember, returns are always free for shoeStore Members.\n" +
                    "So go ahead, shop with confidence, and enjoy your 60-day trial")
        ,Instruction(2, "WHAT PAYMENT OPTIONS CAN I USE ON SHOESTORE ORDERS??",
            "During checkout, Members and guests can choose their preferred shipping option—we’ll provide an estimated delivery date for every item in your bag based on your shipping selection, the delivery address, and where the item(s) ship from.")
        ,Instruction(3, "WHAT ARE SHOESTORE`S SHIPPING OPTIONS?",
            "We want to make buying your favorite Nike shoes and gear fast and easy, and accept the following payment options:\n" +
                    "\n" +
                    "* Visa, MasterCard, American Express, Discover\n" +
                    "* Apple Pay\n" +
                    "* PayPal\n" +
                    "* Klarna\n" +
                    "Product Vouchers")

        ,Instruction(4, "CONTACT US",
            "---- 1-800-806-6453  ----\n" +
                    "---- 4 am - 11 pm PT  ----\n" +
                    "---- 7 days a week.    ----")
    )
}