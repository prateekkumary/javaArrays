import java.util.*;
import java.util.Scanner;

public class addtwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }

        int []b=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int p=n+m;
        int result[]=new int[p];

        int pos=0;
        for(int element :a){
            result[pos]=element;
            pos++;
        }
        for(int element :b){
            result[pos]=element;
            pos++;
        }
//        for(int i=0;i<p;i++){
//            System.out.println(result[i++]+" ");
//        }
        System.out.println((Arrays.toString(result)));


    }
}
