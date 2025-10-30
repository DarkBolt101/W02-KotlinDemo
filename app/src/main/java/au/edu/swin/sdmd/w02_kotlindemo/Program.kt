package au.edu.swin.sdmd.w02_kotlindemo

class Card(var rank:String, var suit:String, var flip:Boolean = true) {
    fun flip() {
        flip = flip.not()
    }

    fun printDetails() {
        if(flip == true) {
            println("$rank $suit")
        }
        else {
            println("----")
        }
    }
}

fun flip(TheCard:Card) {
    TheCard.flip = TheCard.flip.not()
}

fun printDetails(TheCard:Card) {
    if(TheCard.flip == true) {
        println(TheCard.rank + " " + TheCard.suit)
    }
    else {
        println("----")
    }
}

fun main() {
    val AceofHearts = Card("Ace", "Hearts")

    printDetails(AceofHearts)
    flip(AceofHearts)
    printDetails(AceofHearts)


    AceofHearts.printDetails()
    AceofHearts.flip()
    AceofHearts.printDetails()
}