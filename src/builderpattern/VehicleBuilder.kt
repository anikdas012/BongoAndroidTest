package builderpattern

class VehicleBuilder {
    private lateinit var vehicleType: String

    fun vehicleType(type: String): VehicleBuilder {
        vehicleType = type
        return this
    }

    fun build(): Vehicle? {
        return when(vehicleType.toLowerCase()) {
            "car" -> Car()
            "plane" -> Plane()
            else -> null
        }
    }
}