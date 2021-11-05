import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {

    @Test
    public void testStartsWithA() {
        assertEquals(1, MyMain.startsWithA(new ArrayList<String>(Arrays.asList(new String[] {"apple", "banana", "orange", "fig"}))), "The number of words that start with 'a' or 'A' in the ArrayList [\"apple\", \"banana\", \"orange\", \"fig\"] should be: 1");
        assertEquals(1, MyMain.startsWithA(new ArrayList<String>(Arrays.asList(new String[] {"BANANA", "APPLE", "ORANGE", "FIG"}))), "The number of words that start with 'a' or 'A' in the ArrayList [\"BANANA\", \"APPLE\", \"ORANGE\", \"FIG\"] should be: 1");
        assertEquals(3, MyMain.startsWithA(new ArrayList<String>(Arrays.asList(new String[] {"Aardvark" , "apple", "banana", "Aphid"}))), "The number of words that start with 'a' or 'A' in the ArrayList [\"Aardvark\" , \"apple\", \"banana\", \"Aphid\"] should be: 3");
    }

    @Test
    public void testMakeExciting() {
        assertEquals("[apple!, banana!, orange!, fig!]", MyMain.makeExciting(new ArrayList<String>(Arrays.asList(new String[] {"apple", "banana", "orange", "fig"}))).toString(), "The output doesnt match");
        assertEquals("[BANANA!, APPLE!, ORANGE!, FIG!]", MyMain.makeExciting(new ArrayList<String>(Arrays.asList(new String[] {"BANANA", "APPLE", "ORANGE", "FIG"}))).toString(), "The output doesnt match");
        assertEquals("[Aardvark!, apple!, banana!, Aphid!]", MyMain.makeExciting(new ArrayList<String>(Arrays.asList(new String[] {"Aardvark" , "apple", "banana", "Aphid"}))).toString(), "The output doesnt match");
    }

    @Test
    public void testCheckDuplicates() {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 3, 4, 5}));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(new Integer[] {2, 4, 6, 8, 10}));
        ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 3, 5, 7, 9}));
        ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(new Integer[] {9, 8, 7, 6, 5}));

        assertEquals(true, MyMain.checkDuplicates(list1, list2), "Whether or not the ArrayLists [1, 2, 3, 4, 5] and [2, 4, 6, 8, 10] contain a duplicate should be: true");
        assertEquals(true, MyMain.checkDuplicates(list1, list3), "Whether or not the ArrayLists [1, 2, 3, 4, 5] and [1, 3, 5, 7, 9] contain a duplicate should be: true");
        assertEquals(true, MyMain.checkDuplicates(list1, list4), "Whether or not the ArrayLists [1, 2, 3, 4, 5] and [9, 8, 7, 6, 5] contain a duplicate should be: true");
        assertEquals(false, MyMain.checkDuplicates(list2, list3), "Whether or not the ArrayLists [2, 4, 6, 8, 10] and [1, 3, 5, 7, 9] contain a duplicate should be: false");
    }

    @Test
    public void testCountOdd() {
        assertEquals(3, MyMain.countOdd(new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 3, 4, 5}))), "The number of odd numbers in the ArrayList [1, 2, 3, 4, 5] should be: 3");
        assertEquals(0, MyMain.countOdd(new ArrayList<Integer>(Arrays.asList(new Integer[] {2, 4, 6, 8, 10}))), "The number of odd numbers in the ArrayList [2, 4, 6, 8, 10] should be: 0");
        assertEquals(4, MyMain.countOdd(new ArrayList<Integer>(Arrays.asList(new Integer[] {11, -11, 23, -5}))), "The number of odd numbers in the ArrayList [11, -11, 23, -5] should be: 4");
    }

    @Test
    public void testConvertToArrayList() {
        ArrayList<Integer> list1 = MyMain.convertToArrayList(new int[]{1, 2, 3, 4, 5});
        assertEquals("[1, 2, 3, 4, 5]", list1.toString(), "Converting the array [1, 2, 3, 4, 5] to an ArrayList should output the ArrayList: [1, 2, 3, 4, 5]");
    }

    @Test
    public void testMerge() {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 3, 5, 7, 9}));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(new Integer[] {2, 4, 6, 8, 10}));
        ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 4, 15, 21, 23, 26, 28}));
        ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(new Integer[] {2, 5, 7, 8, 24, 37, 38}));

        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", MyMain.merge(list1, list2).toString(), "Merging the lists [1, 3, 5, 7, 9] and [2, 4, 6, 8, 10] should create: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
        assertEquals("[1, 2, 4, 5, 7, 8, 15, 21, 23, 24, 26, 28, 37, 38]", MyMain.merge(list3, list4).toString(), "Merging the lists [1, 4, 15, 21, 23, 26, 28] and [2, 5, 7, 8, 24, 37, 38] should create: [1, 2, 4, 5, 7, 8, 15, 21, 23, 24, 26, 28, 37, 28]");
    }
    
}
