package builderpattern

fun main() {
    val car: Vehicle = VehicleBuilder().vehicleType("car").build()!!
    println("Car wheel numbers: ${car.set_num_of_wheels()}")
    println("Car passenger numbers: ${car.set_num_of_passengers()}")
    println("Car has gas: ${car.has_gas()}")

    val plane: Vehicle = VehicleBuilder().vehicleType("plane").build()!!
    println("Plane wheel numbers: ${plane.set_num_of_wheels()}")
    println("Plane passenger numbers: ${plane.set_num_of_passengers()}")
    println("Plane has gas: ${plane.has_gas()}")
}