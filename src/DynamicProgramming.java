import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class DynamicProgramming
{

    public static boolean wordBreak(Set<String> dict, String word, int[] lookup)
    {
        int n = word.length();

        if (n == 0) {
            return true;
        }
        if (lookup[n] == -1)
        {

            lookup[n] = 0;

            for (int i = 1; i <= n; i++)
            {
                String prefix = word.substring(0, i);


                if (dict.contains(prefix) && wordBreak(dict, word.substring(i), lookup))
                {
                    lookup[n] = 1;
                    System.out.println(prefix);
                    return true;
                }
            }
        }

        return lookup[n] == 1;
    }

    public static void main(String[] args)
    {

        Set<String> dict = Stream.of("this", "th", "is", "famous",
                        "Word", "break", "b", "r", "e", "a", "k",
                        "br", "bre", "brea", "ak", "problem")
                .collect(Collectors.toSet());

        String word = "Wordbreakproblem";

        int[] lookup = new int[word.length() + 1];
        Arrays.fill(lookup, -1);

        if (wordBreak(dict, word, lookup)) {
            System.out.println("Kata dapat di pakai");
        }
        else {
            System.out.println("Kata tidak dapat di pakai");
        }
    }

}