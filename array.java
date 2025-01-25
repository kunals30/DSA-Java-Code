import java.util.*;
public class array{
    public static void main(String args[]){
        ArrayList <Integer> arr = new ArrayList<Integer>();

        //add elements
        arr.add(12);
        arr.add(15);
        arr.add(34);
        arr.add(67);
        arr.add(54);

        System.out.println(arr);

        //get elements
        int ele1 = arr.get(0);
        int ele2 = arr.get(2);
        int ele3 = arr.get(3);
        System.out.println((ele1)+" "+(ele2)+" "+(ele3));

        //add Elements in between without deleting any
        arr.add(3, 78);
        arr.add(2, 32);
        System.out.println(arr);

        //set element by replacing new - at index 1 15 will replace by 23
        arr.set(1,23);
        System.out.println(arr);

        //delete element - deleting element at index 3
        arr.remove(3);
        System.out.println(arr);

        //size of array
        System.out.println(arr.size());

        //sorting
        Collections.sort(arr);
        System.out.println(arr);

        //Reversing the arrayList
        int i = 0, j = arr.size()-1;

        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);

        

    }
}