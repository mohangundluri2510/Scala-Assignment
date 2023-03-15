## Scala Peer Learning
<hr>

### Kushagra Singh Approach--

**Question-1**
Created an object Question1 in that created two functions **bucketize(item: Double): String** and **main**
In **bucketize(item: Double): String**, taking last two digits of the item and checking it, if it is greater than 50 
then the bucket in **n-(last two digits/1000)+0.050 to n+(99 - last two digits)/1000** else **n - (last two digits/1000) to n + (49 - last two digits)/1000**
in **main** running the bucketize function for each value and storing the result in ListBuffer. <br>
**Output**
```
ListBuffer(12.050 - 12.099, 12.000 - 12.049, 10.300 - 10.349, 11.450 - 11.499, 13.500 - 13.549)
```
**Question-2** <br>
Created an object Question1 in that created **highestRuns** , **top5ByRun**, **top5Wicket** and **rankPlayers** functions<br>
- In **highestRuns** function sorting the players ArrayBuffer in reverse order by Runs and displaying 1st player name<br>
- In **top5ByRun** function sorting the players in reverse order by runs and sliced the top five player name<br>
- In **top5Wicket** function sorting the players ArrayBuffer in reverse order by wickets and  sliced the top five player name<br>
- In **rankPlayers**  that takes an ArrayBuffer of objects of the playerClass class as input. It sorts the players in descending order of their ranks and prints the player names in the sorted order.

### Jasveen Kohli Approach--

**Question-1**<br>
Created a object **q1**,rounding the item upto 3 decimal places in round_off function.
The input is stored in the Array and each item is divided by 0.050 and convcerted to Int
and then finding the bucket limits by multiplying 0.050 and other by multiply and adding 0.050 and 0.049. These results are appending to bucketizeArray ArrayBuffer and displaying each bucket.<br>

**Question-2**<br>
Created **q2** object in that created **player_with_highest_runs**,**top_5_run_scorer**, **player_ranking**  functions and created a case class Player <br>
- In **player_with_highest_runs** stored highest runs in highest_runs variable loop through the player_data ArrayBuffer and checking the run of each player with the hifhest runs and storing it , finally displaying the player name.<br>
- In **top_5_run_scorer** sorting the player_data in reverse order by Runs and sliced, displays top 5 players in the Array.<br>
- In **top_5_wicket_taker** sorting the player_data in reverse order by Wickets and sliced, displays top 5 players in the Array.<br>
- In **player_ranking**   that takes an ArrayBuffer of objects of the playerClass class as input. It sorts the players in descending order of their ranks and prints the player names in the sorted order.
