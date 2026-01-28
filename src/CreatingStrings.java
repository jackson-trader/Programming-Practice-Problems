import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;

public class CreatingStrings
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        int n = word.length();

        // Get unique characters and the count of each character
        HashMap<Character, Integer> uniqueCharacters = new HashMap<>(); // Character, Occurrences
        for (int i = 0; i < n; i++)
        {
            uniqueCharacters.put(word.charAt(i), uniqueCharacters.getOrDefault(word.charAt(i), 0) + 1);
        }

        ArrayList<String> differentStrings = new ArrayList<>();

        solveRecursively(uniqueCharacters, differentStrings);

        Collections.sort(differentStrings); // Sort the different strings alphabetically
    }

    private static void solveRecursively(HashMap<Character, Integer> uniqueCharacters, ArrayList<String> differentStrings)
    {

    }
}
