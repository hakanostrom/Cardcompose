package se.hakanostrom.cardcompose.service

import retrofit2.http.GET
import se.hakanostrom.cardcompose.model.CreditCard

interface CreditCardService {
    @GET("credit_cards")
    suspend fun getCreditCards(): List<CreditCard>
}