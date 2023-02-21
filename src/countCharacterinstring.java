import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countCharacterinstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        findEachCharactercount(s);
    }
    private static void findEachCharactercount(String s){
        if(s==null){
            System.out.println("enter valid string");
            return;

        }
        Map<Character,Integer>charCount=new LinkedHashMap<>();
        char charArray[]=s.toCharArray();
        for(char c:charArray){
            if(c==' ')
                continue;
            if(charCount.containsKey(c)){
                charCount.put(c,charCount.get(c)+1);
            }
            else {
                charCount.put(c,1);
            }
        }
        charCount.forEach((k,v)-> System.out.println(k + ":" + v));

    }
}
