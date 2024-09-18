import DataStructure.BinarySearch;
import DataStructure.LinkedList;
import DataStructure.Queue;
import DataStructure.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select question to be run");
        int question = scanner.nextInt();
        scanner.nextLine();

        switch (question){
            // Stack : LIFO (Last in First Out)
            case 1 : {
                Stack stk = new Stack();

                stk.push('a');
                stk.push('b');
                stk.push('c');

                System.out.println("Top Stack : " + stk.peek());
                System.out.println("Stack size : " + stk.size());
                System.out.println();

                stk.pop();
                System.out.println("Top Stack after pop : " + stk.peek());
                System.out.println("Stack size after pop : " + stk.size());
                break;
            }
            // Queue : FIFO (First In First Out)
            case 2 : {
                Queue que = new Queue();

                que.enqueue('a');
                que.enqueue('b');
                que.enqueue('c');

                System.out.println("First Queue : " + que.peek());
                System.out.println("Queue size : " + que.size());
                System.out.println();

                System.out.println("First queue before dequeu : " + que.dequeue());
                System.out.println("First Queue after dequeue : " + que.peek());
                System.out.println("Queue size after pop : " + que.size());
                break;
            }
            // binary search
            case 3 : {
                // create new array
//                ArrayList<Integer> arr = new ArrayList<>();
//                while(true){
//                    System.out.println("Input number, press q to stop");
//                    char inputtedVal = scanner.next().charAt(0);
//
//                    if (Character.toLowerCase(inputtedVal) == 'q'){
//                        break;
//                    }
//                    arr.add(Character.getNumericValue(inputtedVal));
//                }
//                System.out.println("Your array is : " + arr);
//
//                // convert to int[]
//                int[] array = new int[arr.size()];
//                for(int i=0; i<array.length; i++){
//                    array[i] = arr.get(i);
//                }
                int[] array = {1,3,2,6,9,10};

                // sort array
                Arrays.sort(array);
                System.out.println("Your sorted array is : " + Arrays.toString(array));

                // binary search
                while(true){
                    System.out.println("Input your target number or press q to quit");
                    String inputVal = scanner.nextLine();
                    if(inputVal.charAt(0) == 'q'){
                        break;
                    }

                    int x = Integer.parseInt(inputVal);
                    int index = BinarySearch.run(array, x);
                    if (index == -1){
                        System.out.println("Target not found !");
                    } else {
                        System.out.println("Target index : " + index);
                    }
                }
                break;
            }
            default : System.out.println("Invalid input !");
        }

    }
}