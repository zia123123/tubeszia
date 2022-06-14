import java.util.*;

class Main {


    // main function
    public static void main(String args[])
    {
        Bruteforce bruteforce = new Bruteforce();
        DynamicProgramming dynamicProgramming = new DynamicProgramming();
        String str1 = "Wordbreakproblem";
        int n1 = str1.length();
        List <String> dict= Arrays.asList("this", "th", "is", "famous",
                "Word", "break", "b", "r", "e", "a", "k",
                "br", "bre", "brea", "ak", "problem");

        //bruteforce
        System.out.println(bruteforce.wordBreak(str1,dict));
        //dynamicProgramming
        System.out.println(dynamicProgramming.wordBreak(str1,dict));

    }
}