package com.udacity.shoestore.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import com.udacity.shoestore.R
import com.udacity.shoestore.models.Instruction
import com.udacity.shoestore.models.Shoe
import java.util.*

class ViewModel(application: Application) : AndroidViewModel(application) {
    
    private var list = LinkedList<Shoe>(
            listOf(
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
                    "Reebok",
                    "Trepa por la cuerda, salta y domina cada repetición con esta zapatilla hecha para entrenar como tú lo haces. Pensada para atletas de élite, la nueva Reebok Nano X1 es una zapatilla diseñada para todos aquellos a quienes les apasiona poner a prueba sus límites. Este modelo para hombre viene con una parte superior de punto Flexweave® transpirable y duradera, y cuenta con sujeción integrada para los movimientos multidireccionales. La amortiguación de espuma Floatride Energy en la puntera te proporciona sensibilidad y capacidad de respuesta. El clip en el talón añade estabilidad.",
                    listOf(
                            "https://assets.reebok.com/images/h_840,f_auto,q_auto:sensitive,fl_lossy,c_fill,g_auto/aba35c9a73504f8ea5f9ac940053f418_9366/Nano_X1_Negro_GX2801_01_standard.jpg",
                            "https://assets.reebok.com/images/h_840,f_auto,q_auto:sensitive,fl_lossy,c_fill,g_auto/10992b0117bb447bac06ac9400552113_9366/Nano_X1_Negro_GX2801_03_standard.jpg",
                            "https://assets.reebok.com/images/h_840,f_auto,q_auto:sensitive,fl_lossy,c_fill,g_auto/699156d2b86048ffbe72ac9400527827_9366/Nano_X1_Negro_GX2801_04_standard.jpg"),
                                             )))
    private val _shoeList = MutableLiveData<List<Shoe>>(list)
    val shoeList: LiveData<List<Shoe>> get() = _shoeList
    
    fun addShoe(shoe: Shoe) {
        list.add(shoe)
    }
    
    
    private val listIsnt: List<Instruction> = listOf(
            Instruction(
                    0,
                    "WHAT ARE SHOESTORE`S SHIPPING OPTIONS?",
                    "During checkout, Members and guests can choose their preferred shipping option—we’ll provide an estimated delivery date for every item in your bag based on your shipping selection, the delivery address, and where the item(s) ship from.",
                    application.resources.getDrawable(R.drawable.ic_add_shopping_cart_24, null)),
            Instruction(
            1,
            "WHAT IS SHOESTORE`S RETURN POLICY??",
            "All shoeStore purchases have an extended 60-day return policy (some exceptions apply).\n\n" + "We design our shoes and gear to help you perform at peak level, so if they're not working exactly right for you, we've got you covered. Whether you shop on shoeStore.com, in any of the shoeStore apps, or at a shoeStore store, we give you 60 days to take your shoeStore and Converse purchases for a trial run, confidently knowing you can return items (some exceptions apply) for any reason within those 60 days. That includes custom shoeStore By You sneakers. Even after 60 days, you can still return items if they’re unworn and unwashed. And remember, returns are always free for shoeStore Members.\n" + "So go ahead, shop with confidence, and enjoy your 60-day trial",
            application.resources.getDrawable(R.drawable.ic_policy_24, null)),
            Instruction(
            2,
            "WHAT PAYMENT OPTIONS CAN I USE ON SHOESTORE ORDERS??",
            "During checkout, Members and guests can choose their preferred shipping option—we’ll provide an estimated delivery date for every item in your bag based on your shipping selection, the delivery address, and where the item(s) ship from.",
            application.resources.getDrawable(R.drawable.ic_orders_24, null)),
            Instruction(
            3,
            "WHAT ARE SHOESTORE`S SHIPPING OPTIONS?",
            "We want to make buying your favorite Nike shoes and gear fast and easy, and accept the following payment options:\n" + "\n" + "* Visa, MasterCard, American Express, Discover\n" + "* Apple Pay\n" + "* PayPal\n" + "* Klarna\n" + "Product Vouchers",
            application.resources.getDrawable(R.drawable.ic_credit_card_24, null)),
            Instruction(
            4,
            "CONTACT US",
            "---- 1-800-000-0000  ----\n" + "---- 4 am - 11 pm PT  ----\n" + "---- 7 days a week.    ----",
            application.resources.getDrawable(R.drawable.ic_contact_support_24, null)))
    val instructionList1: LiveData<List<Instruction>> = liveData {
        emit(listIsnt)
    }
    
}