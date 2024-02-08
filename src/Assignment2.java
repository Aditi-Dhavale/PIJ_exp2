import java.util.*;
public class Assignment2 {
    public void part1(){
        Input input = new Input();
        int[] data = new int[10];
        data = input.inputData();
        int len = data.length;
        int[] evenArray = new int[len];
        int[] oddArray = new int[len];
        int evenCnt = 0, oddCnt = 0;
        for(int i=0; i<len;i++) {
            if(data[i]%2==0){
                evenArray[evenCnt] = data[i];
                evenCnt++;
            }
            else{
                oddArray[oddCnt] = data[i];
                oddCnt++;
            }
        }
        System.out.println("Original array");
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]+"\t");
        }

        System.out.println("Even array");
        for(int i=0;i<evenCnt;i++){
            System.out.println(evenArray[i]+"\t");
        }

        System.out.println("Odd array");
        for(int i=0;i<oddCnt;i++){
            System.out.println(oddArray[i]+"\t");
        }
    } //part1

    public int findClosestPair(){
        //Implement a Java function that finds two neighbouring numbers in an array with the smallest
        //distance to each. The function should return the index of the 1st number.
        Input input = new Input();
        int[] data = new int[10];
        data = input.inputData();
        int len = data.length;
        if(len<2){
            return -1;
        }
        int minDist = Math.abs(data[0] - data[1]);
        int minIndex = 0;

        for(int i=0;i<data.length-1;i++){
            int dist = Math.abs(data[i] - data[i+1]);
            if(dist<minDist){
                minDist = dist;
                minIndex=i;
            }
        }
        return minIndex;

    }

    public void part3(){
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("Array List: "+ arrayList);

        ArrayList<Integer> anotherArrayList = new ArrayList<>(Arrays.asList(6,7,8,9,10));
        Integer[] anotherArray = anotherArrayList.toArray(new Integer[0]);
        System.out.println("Array: "+ Arrays.toString(anotherArray));

    }
}