package com.udacity.shoestore.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.udacity.shoestore.models.Shoe

class ViewModel(application: Application): AndroidViewModel(application) {



    val listasCargadas: LiveData<List<Shoe>> = liveData {

    }
}