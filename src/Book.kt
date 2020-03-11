

class Book(var conInput:Int = 2) {


    fun returnInt(input: Int): Int {
        return input + conInput
    }

    fun changeInput(input:Int){
        conInput = input * 2
    }
}