


abstract class DefaultHouse( val numberOfFlat:Int):Building {
    override fun getWall(): String {
        return "sss"
    }

    fun isNumberOfFlatNotZero():Boolean{
        return numberOfFlat > 0
    }
}