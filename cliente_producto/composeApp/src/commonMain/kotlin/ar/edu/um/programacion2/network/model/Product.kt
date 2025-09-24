package ar.edu.um.programacion2.network.model

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val id: Long,
    val description: String,
    val price: Double
)