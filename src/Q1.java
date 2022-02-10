import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList();
        System.out.print("Enter the value of arr: ");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        sc.close();
        System.out.println(arr);
        int i=0;
        while(i<arr.size()){
            if(i==arr.size()-1) break;
            if(arr.get(i)==arr.get(i+1)) {
                while (i<arr.size()-1 && arr.get(i)==arr.get(i + 1)) {
                    arr.remove(i + 1);
                }
            }
            else i++;
        }
        System.out.println("After removing consecutive duplicate elements:");
        System.out.println(arr);
    }
}
