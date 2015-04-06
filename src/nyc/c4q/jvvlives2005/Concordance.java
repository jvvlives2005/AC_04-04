package nyc.c4q.jvvlives2005;
/**
 * Created by c4q-joshelynvivas on 4/5/15.
 */

import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Concordance
{
    private HashSet<String>           excludedWords;
    private Map<String, Set<Integer>> listing;

    Scanner         input = new Scanner(System.in);
    HashSet<String> words = new HashSet<String>();
    //Set<String>     items = new HashSet<String>(Arrays.asList(words.split(", ")));


    File file = new File(
            "/Users/c4q-joshelynvivas/Desktop/AccessCode/hierarchy/src/com/c4q/davisroman/mobydick-chapter1-loomings.txt");

    String newFile = input.nextLine();

    public Concordance(String filename, Set<String> bannedWords)
    {
        String bannedWords1 = "the";
        //bannedWords != bannedWords1;
        return;
    }

    public Set<Integer> findLineNumbers(String word)
    {

    }

    public Set<Integer> getCommonLines(String word1, String word2)
    {

    }

    public void print()
    {

    }

}


