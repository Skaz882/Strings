fun main() {
    var userAns: String
    println("What is the capital of Illinois?")
    println("Enter a letter.")
    println("A - Springfield")
    println("B - Chicago")
    println("C - Galena")
    println("D - Union")
    userAns = readLine()!!.toString()

    if (userAns == "A")
        println("That's right!")
    else
        println("Wrong")

    println("What is 3 * 4?")
    println("A - 20")
    println("B - 36")
    println("C - 12")
    println("D - 8")
    userAns = readLine()!!.toString()

    if (userAns == "C")
        println("That's right")
    else
        println("Wrong")

    println("What Volcano erupted in 1815?")
    println("A - Krakataua")
    println("B - Tambora")
    println("C - Merapi")
    println("D - Toba")
    userAns = readLine()!!.toString()

    if (userAns == "B")
        println("That's right")
    else
        println("Wrong")

    println("Which Apollo mission went terribly wrong?")
    println("A - 10")
    println("B - 11")
    println("C - 12")
    println("D - 13")
    userAns = readLine()!!.toString()

    if (userAns == "D")
        println("That's right")
    else
        println("Wrong")

    println("Where was the worst United States hurricane?")
    println("A - Galveston")
    println("B - New Orleans")
    println("C - Savannah")
    println("D - Miami")
    userAns = readLine()!!.toString()

    if (userAns == "A")
        println("That's right!")
    else
        println("Wrong")

}