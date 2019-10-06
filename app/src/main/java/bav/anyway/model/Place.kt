package bav.anyway.model

data class Place(
    val id: Int,
    val coords: Coordinates,
    val name: String,
    val price: Int,
    val image: String,
    val description: String
)