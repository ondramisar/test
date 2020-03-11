
class City(val buildings: ArrayList<Building>) {

    fun returnNumberOfBuilding(): Int {
        var count = 0
        buildings.forEach {
            count+=1
        }
        return count
    }

    fun  returnNameOfFirst(): String {
        return buildings.first().getName()
    }
}