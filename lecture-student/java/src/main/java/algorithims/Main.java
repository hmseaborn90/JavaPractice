package algorithims;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.indexOf(20));
        System.out.println(list.contains(40));
//LinkedList
//        LinkedList<Integer> list = new LinkedList<>();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addFirst(5);
//        list.removeLast();
//        list.remove(2);
//        list.removeFirst();
//        System.out.println(list.contains(10));
//        System.out.println(list.indexOf(10));
//        System.out.println(list.size());
//        var array =list.toArray();
//        System.out.println(list);
//        System.out.println(Arrays.toString(array));


// Array list
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.remove(0);
//        list.indexOf(20);
//        list.lastIndexOf(20);
//        list.contains(20);
//        list.size();
//        list.toArray();
//
//        System.out.println(list);
//    Array numbers = new Array(3);
//    numbers.insert(10);
//    numbers.insert(20);
//    numbers.insert(30);
//    numbers.insert(30);
//    numbers.insert(30);
//    numbers.insert(1);
//    numbers.removeAt(2);
//
//    numbers.print();
//        System.out.println("index: "+ numbers.indexOf(1));
    }

    public void log(int[] nums){
        // 0(1)
        System.out.println(nums[0]);
        System.out.println(nums[0]);
        System.out.println(nums[0]);
    }


    // O(n) grows linearly and in direct correlation of the size of the input n represents the size of the input
    public void oOfN(int[] nums){
        // O (1 + n + 1)-> O(2 + n) -> O(n)
        System.out.println();// O(1)
        for (int i = 0; i < nums.length; i++){//O(n)
            System.out.println(nums[i]);
        }
        System.out.println();// O(1)
    }
//    Quadratic time complexity is a mathematical description of how an algorithm's runtime scales in relation to the size of its input. It's represented in Big O notation as O(n^2), or "O of n squared", where n is the input size. This means that as the input size increases, the runtime increases quadratically. For example, if the input size is 1, the runtime is 1 step, but if the input size is 10, the runtime is 100 steps.
    public void oOFn2(int[] nums){
        // O(n * n) -> O(n^2)// quadratic time
        for (int num : nums){  // O(n)
            for (int num2 : nums){ // O(n)
                System.out.println(num + ", " + num2);
            }
        }
    }
    // Logarithmic  O(log n)

    //Exponential growth O(2^n


    public void greet(String[] names){
        //O(n)
        String[] copy = new String[names.length];
        //O(1) space
        for (int i = 0; i < names.length; i ++){
            System.out.println("Hi" + names[i]);
        }
    }
}
