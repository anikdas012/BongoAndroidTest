package builderpattern

import org.junit.Test

import org.junit.Assert.*

class BuilderDemoKtTest {

    @Test
    fun main() {
        val car: Vehicle = VehicleBuilder().vehicleType("car").build()!!
        assertEquals(4, car.set_num_of_wheels())
        assertEquals(3, car.set_num_of_passengers())
        assertFalse(car.has_gas())

        val plane: Vehicle = VehicleBuilder().vehicleType("plane").build()!!
        assertEquals(10, plane.set_num_of_wheels())
        assertEquals(180, plane.set_num_of_passengers())
        assertEquals(true, plane.has_gas())

        val noVehicle = VehicleBuilder().vehicleType("null").build()
        assertEquals(null, noVehicle)
    }
}