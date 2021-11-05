import java.util.ArrayList;

public class MyMain {

    // Counts the number of words that starts with 'a' or 'A'
    public static int startsWithA(ArrayList<String> list) {
        int count = 0;
        for (String s : list) {
            char ch = s.charAt(0);
            if (ch == 'a' || ch == 'A') {
                count++;
            }
        }
        return count;
    }

    // Adds a ! to each element in the ArrayList, returns an ArrayList
    public static ArrayList<String> makeExciting(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)+"!");
        }
        return list;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer x: list1){
            for (Integer y: list2){
                if (x==y){
                    return true;
                }
            }
        }
        return false;
    }


    // METHODS FOR THE HOMEWORK:

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        int count=0;
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    // Unlike the other methods, the input is an array!
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int x: arr){
            list.add(x);
        }
        return list;
    }

    // Takes two **sorted** ArrayLists and merges them together into one big sorted ArrayList
    // (Hint: you may find it useful to use a while loop, as well as the remove() method).
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int index = 0;
        for (Integer integer : list1) {
            while (list2.get(index) < integer) {
                index++;
            }
            list2.add(index, integer);
        }
        return list2;
    }



    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("apple");
        list1.add("crapple");
        list1.add("bapple");
        list1.add("Apple");
        list1.add("banana");
        System.out.println(startsWithA(list1)); //2
        System.out.println(makeExciting(list1)); //apple! crapple! bapple! Apple! banana!
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(5);
        list2.add(36);
        list2.add(40);
        System.out.println(countOdd(list2)); //2
        int[] arr = {1,7,12,45,82};
        ArrayList<Integer> list3 = convertToArrayList(arr);
        System.out.println(list3); //1,7,12,45,82
        System.out.println(checkDuplicates(list2,list3));//true
        System.out.println(merge(list2,list3)); //1,1,2,5,7,12,36,40,45,82

    }
}
