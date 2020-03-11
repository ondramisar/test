fun main() {
    val house = House(4)
    val newHouse = Department(2)
    val newHouse2 = Department(2)
    val school = School()
    val school3 = School()
    val school4 = School()

    val buildings = arrayListOf<Building>()
    buildings.add(house)
    buildings.add(school)
    buildings.add(newHouse)
    buildings.add(school3)
    buildings.add(newHouse2)
    buildings.add(school4)

    val city = City(buildings)

    println(city.returnNumberOfBuilding().toString())
    println(city.returnNameOfFirst())
    println(house.isNumberOfFlatNotZero().toString())
    println(school.getWall())
}