package factorypattern

class Plane(private var gas: Boolean = true, private var passengerNum: Int = 180, private var wheelNum: Int = 10): Vehicle {
    override fun set_num_of_wheels(): Int {
        println("Plane set_num_of_wheels called")
        return wheelNum
    }

    override fun set_num_of_passengers(): Int {
        println("Plane set_num_of_passengers called")
        return passengerNum
    }

    override fun has_gas(): Boolean {
        println("Plane has_gas called")
        return gas
    }
}