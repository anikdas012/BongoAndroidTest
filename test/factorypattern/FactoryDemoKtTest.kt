package factorypattern

import org.junit.Test

import org.junit.Assert.*

class FactoryDemoKtTest {

    @Test
    fun main() {
        val car: Vehicle = VehicleFactory().getVehicle("car")!!
        assertEquals(4, car.set_num_of_wheels())
        assertEquals(3, car.set_num_of_passengers())
        assertFalse(car.has_gas())

        val plane: Vehicle = VehicleFactory().getVehicle("plane")!!
        assertEquals(10, plane.set_num_of_wheels())
        assertEquals(180, plane.set_num_of_passengers())
        assertEquals(true, plane.has_gas())

        val noVehicle = VehicleFactory().getVehicle("null")
        assertEquals(null, noVehicle)
    }
}