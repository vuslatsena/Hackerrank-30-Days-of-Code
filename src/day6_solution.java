/* TASK: Given a string,S , of length N that is indexed from 0 to N-1 ,
 *print its even-indexed and odd-indexed characters as
* 2 space-separated strings on a single line
*/
import java.util.Scanner;
public class day6_solution {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for (int i = 0; i < testCase; i++) {
            String inputStr = in.next();
            System.out.println(splitByIndex(inputStr));
        }
        in.close();
    }
    public static String splitByIndex(String str)
    {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
                even.append(str.charAt(i));
            }
            else
            {
                odd.append(str.charAt(i));
            }
        }
        return even.toString()+" "+odd.toString();
    }
}