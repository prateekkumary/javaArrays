import java.util.Scanner;
import java.util.Stack;

public class stack2 {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
