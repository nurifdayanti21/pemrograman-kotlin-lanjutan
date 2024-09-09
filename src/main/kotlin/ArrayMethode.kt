fun main(args: Array<String>) {
    //Array methods
    //sort()
val simpsonsA = arrayOf("Homer", "Marge", "Bart", "Lias", "Meggie")
    simpsonsA.sort()
    for (simpson in simpsonsA){
        print(simpson + ' ')
    }
    print('\n')

    //sorted()
    val simpsonsB: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpsons_sorted = simpsonsB.sortedArray()
    for (simpson in simpsons_sorted){
        print(simpson + ' ')
    }
    print('\n')
    //reverse() and reversedArray()
    val simpsonsC: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonsC.sort()
    simpsonsC.reverse()
    for (simpson in simpsonsC){
        print(simpson + ' ')
    }
    print('\n')

    //indexof()
    val simpsonsD = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpson = "Lisa"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1){
        println("Yeah, thats my number ${position + 1} Simpson!")
    }else{
        println("Hey that's not simpson!")
    }

    val simpsonE = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    println("simpsons size: " + simpsonE.size)
    if (!simpsonE.isEmpty())
        println("Array tidak kososng!")
    println("Min = "+ simpsonE.min())
    println("Max = "+ simpsonE.max())
    println("First = "+ simpsonE.first())
    println("Last = "+ simpsonE.last())
    println(simpsonE.contains("Marge"))
}