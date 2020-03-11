class Department(numberOfFlat: Int) :DefaultHouse(numberOfFlat) {
    override fun getName(): String {
        return "department"
    }
}