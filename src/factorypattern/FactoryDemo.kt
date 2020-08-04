package factorypattern

fun main() {
    val car: Vehicle = VehicleFactory().getVehicle("car")!!
    println("Car wheel numbers: ${car.set_num_of_wheels()}")
    println("Car passenger numbers: ${car.set_num_of_passengers()}")
    println("Car has gas: ${car.has_gas()}")

    val plane: Vehicle = VehicleFactory().getVehicle("plane")!!
    println("Plane wheel numbers: ${plane.set_num_of_wheels()}")
    println("Plane passenger numbers: ${plane.set_num_of_passengers()}")
    println("Plane has gas: ${plane.has_gas()}")
}