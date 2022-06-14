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
        long start = System.nanoTime();
        System.out.println("BRUTE FORCE :");
        System.out.println(bruteforce.wordBreak(str1,dict));
        long end = System.nanoTime();
        System.out.println("Time : " + (end - start));

        System.out.println("                             ");
        long start1 = System.nanoTime();
        System.out.println("Dynamic Programming1 :");
         System.out.println(dynamicProgramming.wordBreak(str1,dict));
        long end2 = System.nanoTime();
        System.out.println("Time : " + (end2 - start1));
        //dynamicProgramming


    }
}