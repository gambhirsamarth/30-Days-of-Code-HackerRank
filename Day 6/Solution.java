import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t; i++){
            
            String s = sc.next();
            String even = "";
            String odd = "";
            
            for(int j=0; j<s.length(); j++){
                if (j%2==0){
                    even = even + s.charAt(j);
                }else{
                    odd = odd + s.charAt(j);

                }
            }
            System.out.println(even + " " + odd);
            
            
        }
        sc.close();
        
    }
}
