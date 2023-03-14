package scala.assignment


//Create class Question1
class Question_1() {

    //    creating a function getBucket which takes one argument and returns Unit
    def getBucket(item: Double): Unit = {

        val last_two_digits = (item * 1000) % 100      // Fetching the last two digits

        print(s"Item:  $item is in the") // Printing the fetched digits


        //         If the value of the last two digits after the decimal point is greater than or equal to 50,
        //         then the bucket range is from `n - (last two digits/1000) + 0.050 to n + (99 - last two digits)/1000`.
        if (last_two_digits.toDouble >= 50) {
            val left_limit= item - (last_two_digits.toDouble / 1000) + 0.050 // Calculating and Storing the left_limit
            val right_limit = item + (99 - last_two_digits.toDouble) / 1000 // Calculating and Storing the right_limit
            print(f" Bucket : $left_limit%,.3f" + " - " + f"$right_limit%,.3f\n") // Printing the fetched limits
            //            print(s"Bucket:${left_limit.toDouble} - ${right_limit.toDouble} \n")
        }

        //        Otherwise, the bucket range is from `n - (last two digits/1000) to n + (49 - last two digits)/1000`.
        else {
            val left_limit = item - (last_two_digits.toDouble / 1000) // Calculating and Storing the left_limit
            val right_limit = item + (49 - last_two_digits.toDouble) / 1000 // Calculating and Storing  the right_limit
            print(f" Bucket : $left_limit%,.3f" + " - " + f"$right_limit%,.3f\n") // Printing the bucket

        }
        println()
    }
}

// Creating object Question1
object Question_1 {



    def main(args: Array[String]): Unit = {
        val question1_obj = new Question_1() //Creating an instance of the class Question1

        //Storing the values in an List and printing the bucket related to the given values.
        val values = List(
            12.05,
            12.99,
            10.33,
            11.45,
            13.50)

        //        var values1 = new Array[Double](5)
        //        var i = 0
        //        for (elem <- values) {
        //
        //            values1(i) = elem.toDouble
        //            i+=1
        //        }
        //        values1.foreach((println(_)))

        for (ele <- values) {
            //calling the get_bucket function to display the bucket details
            question1_obj.getBucket(ele)
        }
    }
}