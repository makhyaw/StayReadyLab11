import java.util.ArrayList;

public class SpellingSuggestions extends SpellChecker{
    ArrayList<String> suggestions = new ArrayList<String>();
    public void deleteFL(String word){
        String tempWord=word.substring(1,word.length()-1); // stores temp made up word

        if (dictionary.contains(tempWord)){
            suggestions.add(tempWord);
        }

    }


    public void deleteLL(String word){
        String tempWord=word.substring(0,word.length()-1); // stores temp made up word
        if (dictionary.contains(tempWord)){
            suggestions.add(tempWord);
        }

    }

    public void pluralize(String word){
        String tempWord=word+"s";
        if (dictionary.contains(tempWord)){
            suggestions.add(tempWord);
        }
    }

}

