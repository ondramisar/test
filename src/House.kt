

class House(private val flat:Int): DefaultHouse(flat) {

    override fun getName(): String {
        return "house"
    }

    fun getRandomName():String{
        return "random"
    }
}