package scala.assignment

//Importing required libraries
import scala.io.Source

case class Player(Year: Int, Name: String, Country: String, Matches: Int, Runs: Int, Wickets: Int)

class Question_2 {

    def readData(): List[Player] = {
        val path = raw"/Users/mohangundluri/Desktop/details.txt"

        // Reading data from details.txt file and getting lines and applying map function
        val players = Source.fromFile(path).getLines().map(line => {

            // Storing the values obtained by triming and splitting the line
            val Array(year, name, country, matches, runs, wickets) = line.trim.split(", ")
            // Creating objects from the fecthed values above
            Player(year.toInt, name, country, matches.toInt, runs.toInt, wickets.toInt)
        }).toList

        // Returning the created list of player objects
        players
    }

    def displayPlayerDetails(playerobjects: List[Player]): Unit = {
        var count = 1 // For Serial No

        // For loop for traversing through the objects in the list
        for (playerobject <- playerobjects) {
            println(s" s.no : $count , Name : ${playerobject.Name}, County : ${playerobject.Country} , Year : ${playerobject.Year} , Runs : ${playerobject.Runs}, Matches : ${playerobject.Matches} , Wickets : ${playerobject.Wickets}")
            println()
            count = count + 1 // Incrementing the counter for serial NO
        }
    }


    def diaplayPlayerWithRank(playerobjects: List[Player]): Unit = {
        var count = 1 // For Serial No
        // For loop for traversing through the objects in the list
        for (playerobject <- playerobjects) {
            // Printing the data in the object
            println(s" Name : ${playerobject.Name}, Rank : ${count}, County : ${playerobject.Country}, Year : ${playerobject.Year}, Runs : ${playerobject.Runs}, Matches : ${playerobject.Matches}, Wickets : ${playerobject.Wickets}, Performance :${5 * playerobject.Wickets + 0.05 * playerobject.Runs}")
            count += 1 // Incrementing the counter for serial NO
            println()
        }
    }

}

// Creating object Question_2
object Question_2 {

    def main(args: Array[String]): Unit = {
        val question2_obj = new Question_2() // Creation of Object
        val players = question2_obj.readData() // Reading Data from the file

        println("\n \nQuestion - 1")
        // Sorting the players using sortby function by using runs as metric in reverse order and picking the top element.
        question2_obj.displayPlayerDetails(players.sortBy(_.Runs)(Ordering[Int].reverse).take(1))

        println("\n \nQuestion - 2\n")
        // Sorting the players using sortby function by using runs as metric in reverse order and picking the top 5 elements.
        question2_obj.displayPlayerDetails(players.sortBy(_.Runs)(Ordering[Int].reverse).take(5))

        println("\n \nQuestion - 3\n")
        // Sorting the players using sortby function by using no of wickets as metric in reverse order and picking the top 5 elements.
        question2_obj.displayPlayerDetails(players.sortBy(_.Wickets)(Ordering[Int].reverse).take(5))


        println("\n \nQuestion - 4\n")
        // Sorting the players using sortby function by using 5 * r.Wickets + 0.05 * r.Runs as metric in reverse order and picking the top 5 elements.
        question2_obj.diaplayPlayerWithRank(players.sortBy(r => 5 * r.Wickets + 0.05 * r.Runs)(Ordering[Double].reverse).take(5))
    }
}