import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import java.util.Scanner;

public class SpellChecker {
    public HashSet<String> dictionary = new HashSet<String>(370104); //declares hashset variable name
    public HashSet<String> misspelledWords;

    public static String removeLowerCaseandPunc(String s){
        String newStr; //for s in StrArray
        //remove evil punctuation and convert the whole line to lowercase
        newStr = s.toLowerCase().replaceAll("[^a-zA-Z\\s]", "").replaceAll("\\s+", " ");
        return newStr;
    }


    public void initSet() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("letter_from_gandhi.txt"));
        while (sc.hasNextLine()) { //run thru file
            String[] line = getLine(sc.nextLine()); //built in nextLine gets first line from  the file of the input scaner sc, passes to getline
             misspelledWords = new HashSet<String>(Arrays.asList(line)); //putting values into hash set
        }
    }

    public void dictionarySetUp() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("words_alpha.txt"));
        while (sc.hasNextLine()) { //run thru file
            dictionary.add(sc.nextLine().toLowerCase()); // adds each and every word into our set

        }

    }
    public String[] getLine(String nextLine){
        String [] line=nextLine.split(" "); //splits  first line into a string array
        return line; //passes string array back to initSet String [] line
    }
}