import java.util.Scanner;

public class moveallZeroinend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
           if(a[i]!=0){
               a[count++]=a[i];
           }
        }
        while(n>count){
            a[count++]=0;
        }
        for(int data:a){
            System.out.print(data+" ");
        }
    }
}
