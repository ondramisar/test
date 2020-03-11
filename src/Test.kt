fun main() {
    val house = House(4)
    val newHouse = Department(2)
    val school = School()

    val buildings = arrayListOf<Building>()
    buildings.add(house)
    buildings.add(school)
    buildings.add(newHouse)

    val city = City(buildings)

    println(city.returnNumberOfBuilding().toString())
    println(city.returnNameOfFirst())
    println(house.isNumberOfFlatNotZero().toString())
    println(school.getWall())
}