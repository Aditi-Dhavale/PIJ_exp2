import java.util.Scanner;
public class Input {
    public int[] inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int s = sc.nextInt();
        int data[]= new int[s];
        System.out.println("Enter data");
        for(int i=0; i<s;i++) {
            data[i] = sc.nextInt();
        }
        return data;
    }
}
