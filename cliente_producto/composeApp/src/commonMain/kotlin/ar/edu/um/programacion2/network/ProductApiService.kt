package ar.edu.um.programacion2.network

import ar.edu.um.programacion2.network.model.Product
import io.ktor.client.call.body
import io.ktor.client.request.get

class ProductApiService(
    private val baseUrl: String = "http://10.0.2.2:8080"
) {
    private val httpClient = NetworkUtils.httpClient

    suspend fun getAllProducts(): List<Product> {
        return httpClient.get("$baseUrl/products").body()
    }

}