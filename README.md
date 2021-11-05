# Week Ten Day Three: ArrayList Practice

Today in class, we'll be practicing working with ArrayLists. Recall that ArrayLists are pretty similar to arrays! However, whereas we use the square brackets [] to interact with arrays, ArrayLists have a bunch of different methods that we use: get(), add(), set(), size(), and remove(). 

Note that all the methods we'll be working with today will be **static** just to keep things simple. However, if we wanted to, we can write classes with ArrayLists as instance variables, just as we had classes with arrays as instance variables last class!

The first method, startsWithA(), takes an ArrayList of Strings as input and returns the number of Strings that start with the letter "A" or "a". Your method should have the following signature:
```shell script
public static int startsWithA(ArrayList<String> list) { }
```

The next method, makeExciting(), takes an ArrayList of Strings as input and adds an exclamation mark "!" to the end of every String in the ArrayList. Your method should have the following signature:
```shell script
public static ArrayList<String> makeExciting(ArrayList<String> list) { }
```

The next method is checkDuplicates(). This method takes two ArrayList<Integer> as input and returns true if there is a number that appears in both ArrayLists.
```shell script
public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { }
```

<br />
<br />
<br />

##### Homework:

For the **homework**, you'll be writing three more methods related to ArrayLists. In addition, you should finish up the problems from class. 

The first method is countOdd(). This method takes an ArrayList<Integer> as input and returns the number of odd numbers in the ArrayList. The method should have the following signature:
```shell script
public static int countOdd(ArrayList<Integer> list) { }
```

Next, the second method is convertToArrayList(). Unlike the other methods, this method takes an **int[]** as input. The method returns an ArrayList<Integer> containing the values from the int[]. The method has the following signature:
```shell script
public static ArrayList<Integer> convertToArrayList(int[] arr) { }
```

Finally, the last method is merge(). This method takes two **sorted** (from smallest to largest) ArrayLists and merges them together into one big sorted ArrayList. (_Hint_: you may find it useful to use a while loop, as well as the remove() method). The method has the following signature:
```shell script
public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) { }
```

<br />
<br />

## Run your code with:
The easiest way to run your code is to press the play button in [MyMain.java](src/main/java/MyMain.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make run
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew run
```

## Run your tests with:
The easiest way to run your code is to press the play button in [MyTests.java](src/test/java/MyTests.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make test
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew test
```