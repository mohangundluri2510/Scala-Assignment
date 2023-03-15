## Question-1
Created a class Question_1 in that created a function getBucket which accepts an argument and displays the Bucket in which it present.<br>
**Input** <br>

```
val values = List(
    12.05,
    12.99,
    10.33,
    11.45,
    13.50)
```
**Output**
```
Item:  12.05 is in the Bucket : 12.050 - 12.099

Item:  12.99 is in the Bucket : 12.950 - 12.999

Item:  10.33 is in the Bucket : 10.300 - 10.349

Item:  11.45 is in the Bucket : 11.450 - 11.499

Item:  13.5 is in the Bucket : 13.500 - 13.549
```

## Question-2
Created a class Question_2 which has three function <br>
**readData**: This function is to read data from the file <br>
**displayPlayerDetails(playerobjects: List[Player]): Unit**:This function is to display the player details <br>
**diaplayPlayerWithRank(playerobjects: List[Player]): Unit**: This function is to display the player details with the Rank <br>
**Input** <br>



**Question-2 - i** <br>
Player with the best  highest runs scored :
```
 s.no : 1 , Name : Mohan, County : India , Year : 2021 , Runs : 2500, Matches : 23 , Wickets : 100
```

**Question-2 - ii** <br>
Top 5 player with run scored.
```
 s.no : 1 , Name : Mohan, County : India , Year : 2021 , Runs : 2500, Matches : 23 , Wickets : 100

 s.no : 2 , Name : Sam, County : India , Year : 2021 , Runs : 2300, Matches : 23 , Wickets : 3

 s.no : 3 , Name : Sravan, County : India , Year : 2021 , Runs : 1000, Matches : 23 , Wickets : 15

 s.no : 4 , Name : Ram, County : India , Year : 2021 , Runs : 300, Matches : 23 , Wickets : 30

 s.no : 5 , Name : Mano, County : India , Year : 2021 , Runs : 300, Matches : 23 , Wickets : 13
```

**Question-2 - iii** <br>
Top 5 Players by wicket taken
```
 s.no : 1 , Name : Mohan, County : India , Year : 2021 , Runs : 2500, Matches : 23 , Wickets : 100

 s.no : 2 , Name : Ram, County : India , Year : 2021 , Runs : 300, Matches : 23 , Wickets : 30

 s.no : 3 , Name : Sravan, County : India , Year : 2021 , Runs : 1000, Matches : 23 , Wickets : 15

 s.no : 4 , Name : Mano, County : India , Year : 2021 , Runs : 300, Matches : 23 , Wickets : 13

 s.no : 5 , Name : Akash, County : India , Year : 2021 , Runs : 190, Matches : 23 , Wickets : 10

```


**Question-2 - iv** <br>
Rank players with overall performance give weight 5x to wicket taken and (5/100)x to run scored.
```
 Name : Mohan, Rank : 1, County : India, Year : 2021, Runs : 2500, Matches : 23, Wickets : 100, Performance :625.0

 Name : Ram, Rank : 2, County : India, Year : 2021, Runs : 300, Matches : 23, Wickets : 30, Performance :165.0

 Name : Sam, Rank : 3, County : India, Year : 2021, Runs : 2300, Matches : 23, Wickets : 3, Performance :130.0

 Name : Sravan, Rank : 4, County : India, Year : 2021, Runs : 1000, Matches : 23, Wickets : 15, Performance :125.0

 Name : Mano, Rank : 5, County : India, Year : 2021, Runs : 300, Matches : 23, Wickets : 13, Performance :80.0
```


