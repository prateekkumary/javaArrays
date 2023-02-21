import java.util.Scanner;

public class movealltheElementintheend {
    public static void moveElementinend(int a[],int n){
        int tempAll[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]>0){
                tempAll[j++]=a[i];
            }
        }
        if(j==0 ||j==n){
            return;
        }
        for(int i=0;i<n;i++){
            if(a[i]<0){
                tempAll[j++]=a[i];
            }
        }
        for(int i=0;i<tempAll.length;i++){
            a[i]=tempAll[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        moveElementinend(a,n);
        for(int i:a){
            System.out.print(i+" ");
        }


    }
}
