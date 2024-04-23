package se.hakanostrom.cardcompose

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import se.hakanostrom.cardcompose.model.CreditCard
import java.lang.Exception

class CreditCardViewModel : ViewModel() {
    private val repository = CreditCardRepository()

    private val _creditCards = MutableLiveData<List<CreditCard>>()
    val creditCards: LiveData<List<CreditCard>> = _creditCards

    fun fetchCreditCards(){
        viewModelScope.launch {
            try{
                val cards = repository.getCreditCards()
                _creditCards.value = cards
            }catch (e: Exception){
                //Handle error
            }
        }
    }
}