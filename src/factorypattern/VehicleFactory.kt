package factorypattern

class VehicleFactory {
    fun getVehicle(type: String): Vehicle? {
        when(type.toLowerCase()) {
            "car" -> return Car()
            "plane" -> return Plane()
        }
        return null
    }
}