package builderpattern

class VehicleBuilder {
    private lateinit var vehicleType: String

    fun vehicleType(type: String): VehicleBuilder {
        vehicleType = type
        return this
    }
}