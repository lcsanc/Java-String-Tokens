/*Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens
Sample Input

He is a very very good boy, isn't he?

Sample Output

10
He
is
a
very
very
good
boy
isn
t
he
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if (s.trim().length()==0 || s.trim().length()>400000)
        {
            System.out.println(0);
            return;
         }
        
        String[] arrString = s.trim().split("[ !,?._'@]+");
        
        System.out.println(arrString.length); 
        for(String i : arrString)
        {
            System.out.println(i); 
        } 
        
        scan.close();
    }
}