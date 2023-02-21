import java.util.Scanner;

public class reverseArray {
    static void printarray(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println();

    }
    static void reverseArrays(int a[],int start,int end){
        int t;
        while(start<end){
            t=a[start];
            a[start]=a[end];
            a[end]=t;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        reverseArrays(a,0,n-1);
        printarray(a,n);


    }
}
