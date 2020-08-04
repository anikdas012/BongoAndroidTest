package builderpattern

class Car(private var gas: Boolean = false, private var passengerNum: Int = 3, private var wheelNum: Int = 4): Vehicle {
    override fun set_num_of_wheels(): Int {
        println("Car set_num_of_wheels called")
        return wheelNum
    }

    override fun set_num_of_passengers(): Int {
        println("Car set_num_of_passengers called")
        return passengerNum
    }

    override fun has_gas(): Boolean {
        println("Car has_gas called")
        return gas
    }
}