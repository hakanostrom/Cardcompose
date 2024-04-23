package se.hakanostrom.cardcompose

import se.hakanostrom.cardcompose.model.CreditCard

class CreditCardRepository {
    private val creditCardService = RetrofitInstance.creditCardService

    suspend fun getCreditCards(): List<CreditCard>{
        return creditCardService.getCreditCards()
    }
}