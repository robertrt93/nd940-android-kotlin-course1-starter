package com.udacity.shoestore.ui.shoelist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.models.Shoe


/**
 * A simple [Fragment] subclass.
 */
class ShoeListFragment : Fragment() {
    
    private lateinit var _binding: FragmentShoeListBinding
    private val binding get() = _binding
    
    private var shoeAdapter = ShoeAdapter()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
    }
    
    
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        _binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_shoe_list, container, false)
        
        binding.lifecycleOwner = this
        binding.shoeListAdapter.adapter = shoeAdapter
        shoeAdapter.submitList(listShoes)
        
        return binding.root
    }
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
   /*
        val myButton = Button(requireContext())
        myButton.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
        myButton.text = getString(R.string.my_button)
        binding.linearLayout.addView(myButton)
        
        */
    }
    
    private val listShoes: List<Shoe> = listOf(
            Shoe(
                    "ADIDAS TUBULAR X KNIT",
                    43.0,
                    "Adidas",
                    "La marca adidas Originals alemana fundada en 1972 que caracterizan las legendarias tres rayas, o trébol en caso de adidas Originals. Es la originalidad, la singularidad y la expresión perfecta de la personalidad y la individualidad, que durante décadas ha ganado millones de fans. Su lista de artistas es inmensa, por ejemplo, Kanye West, Run DMC, Snoop Dogg y Pharrell, a músicos de clase mundial que saben lo que quieren. E incluso tú lo sabes! Aparte de las zapatillas en Footshop encontrarás ropa de mujer y de hombre.",
                    listOf(
                            "https://static.footshop.com/28097/4707.jpg",
                            "https://static.footshop.com/28098/4707.jpg",
                            "https://static.footshop.com/28099/4707.jpg"),
                ), Shoe(
            "Nike Revolution 5",
            45.5,
            "Nike",
            "Cuando la aventura te llame, responde con unas zapatillas ligeras que te ayuden a moverte kilómetro tras kilómetro.La espuma suave amortigua la pisada y el talón reforzado hace que esta sea suave y estable.El tejido Knit envuelve el pie con una sujeción transpirable, y el diseño minimalista se adapta allí donde te lleve el día.",
            listOf(
                    "https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/jvcf7clhvzyavyopsi9n/revolution-5-zapatillas-de-running-7TKVTL.png",
                    "https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5,q_80/cljsflkbviirew1leboc/revolution-5-zapatillas-de-running-7TKVTL.png",
                    "https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5,q_80/cpnziuszxz5xgcffqjei/revolution-5-zapatillas-de-running-7TKVTL.png"),
                       ), Shoe(
            "Taylor All Star Berkshire",
            43.1,
            "Converse ",
            "El diseño icónico de corte alto que tanto te gusta se actualiza para el invierno y para la comodidad de los más pequeños. La confección de piel y la zona del tobillo de lona revestida y acolchada protegen contra las inclemencias del tiempo, al tiempo que el suave forro de felpa ofrece una mayor calidez. La suela exterior de tracción Counter Climate exclusiva proporciona más adherencia en condiciones de lluvia y frío.",
            listOf(
                    "https://www.converse.com/dw/image/v2/AALW_PRD/on/demandware.static/-/Sites-ConverseMaster/default/dwcccafea6/images/a_107/371524C_A_107X1.jpg?sw=2000",
                    "https://www.converse.com/dw/image/v2/AALW_PRD/on/demandware.static/-/Sites-ConverseMaster/default/dw7bb9bd1d/images/h_08/371524C_H_08X1.jpg?sw=406",
                    "https://www.converse.com/dw/image/v2/AALW_PRD/on/demandware.static/-/Sites-ConverseMaster/default/dw4c701aaa/images/e_08/371524C_E_08X1.jpg?sw=406"),
                              ), Shoe(
            "Nano X1",
            41.1,
            "reebok",
            "Trepa por la cuerda, salta y domina cada repetición con esta zapatilla hecha para entrenar como tú lo haces. Pensada para atletas de élite, la nueva Reebok Nano X1 es una zapatilla diseñada para todos aquellos a quienes les apasiona poner a prueba sus límites. Este modelo para hombre viene con una parte superior de punto Flexweave® transpirable y duradera, y cuenta con sujeción integrada para los movimientos multidireccionales. La amortiguación de espuma Floatride Energy en la puntera te proporciona sensibilidad y capacidad de respuesta. El clip en el talón añade estabilidad.",
            listOf(
                    "https://assets.reebok.com/images/h_840,f_auto,q_auto:sensitive,fl_lossy,c_fill,g_auto/aba35c9a73504f8ea5f9ac940053f418_9366/Nano_X1_Negro_GX2801_01_standard.jpg",
                    "https://assets.reebok.com/images/h_840,f_auto,q_auto:sensitive,fl_lossy,c_fill,g_auto/10992b0117bb447bac06ac9400552113_9366/Nano_X1_Negro_GX2801_03_standard.jpg",
                    "https://assets.reebok.com/images/h_840,f_auto,q_auto:sensitive,fl_lossy,c_fill,g_auto/699156d2b86048ffbe72ac9400527827_9366/Nano_X1_Negro_GX2801_04_standard.jpg"),
                                     ))
    
}