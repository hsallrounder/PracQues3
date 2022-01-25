import java.util.Scanner;

public class Q2 {

    static long fact(int n){
        long res=1;
        for(int i=n;i>0;i--) res*=i;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n=sc.nextInt();
        sc.close();
        long f=fact(n);
        int ctr=0,check=0;
        while(f>0){
            if(f%10==0) {
                ctr++;
                check=1;
            }
            else if(ctr!=0 && check==1) break;
            f/=10;
        }
        System.out.println(ctr);
    }
}
