public class Main {
    public static void main(String[] args) {
        //Input input = new Input();
        //int data[] = input.inputData();
        Assignment2 assignment2 = new Assignment2();
        assignment2.part1();
        int index = assignment2.findClosestPair();
        System.out.println("Index of first number in the pair with the smallest distance is: "+ index);
        assignment2.part3();
    }
}