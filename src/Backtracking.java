import java.io.*;
import java.util.*;

class Backtracking {

    static void wordBreak(int n, List<String> dict, String s)
    {
        String ans="";
        wordBreakUtil(n, s, dict, ans);
    }

    static void wordBreakUtil(int n, String s, List<String> dict, String ans)
    {
        for(int i = 1; i <= n; i++)
        {
            String prefix=s.substring(0, i);
            if(dict.contains(prefix))
            {
                if(i == n)
                {
                    ans += prefix;
                    System.out.println(ans);
                    return;
                }
                wordBreakUtil(n - i, s.substring(i,n), dict, ans+prefix+" ");
            }
        }
    }

    // main function
    public static void main(String args[])
    {
        String str1 = "Wordbreakproblem";
        int n1 = str1.length();
        List <String> dict= Arrays.asList("this", "th", "is", "famous",
                "Word", "break", "b", "r", "e", "a", "k",
                "br", "bre", "brea", "ak", "problem");
        wordBreak(n1,dict,str1);
    }
}