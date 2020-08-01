import java.util.ArrayList;

public class SpellingSuggestions extends SpellChecker{
    ArrayList<String> suggestions = new ArrayList<String>();

    public String insertLetter(String word){
        StringBuilder str = new StringBuilder(word); // using sb to created a new str and it's taking in our word
        str.insert(5, "a"); // using built in method (insert) to insert the letter and it's using their index
        return str.toString(); // converting str to an actual string
    }
    public String swapTwoLetters(String word){
        int index = 2;
        //swap two neighboring letters
        //ga to rade , 2 and 3
        char [] arr= word.toCharArray(); //change word to char array so can access ea character
        // [g,a,t,o,r,a,d,e]
        char temp= arr[index];//t (starts at index 2)
        arr[index] = arr[index+1]; //t is in o's place ( +1 to swap the next index)
        arr[index+1] = temp; // setting o to the variable we created
        StringBuilder str= new StringBuilder(); //make stringbuilder
        for (int i=0;i<arr.length;i++){
            str.append(arr[i]); } //add char arr to stringbuilder
        return str.toString();
    }
    public String changeLetter(String word){
        int index=2; 
        char ch='l';
        //char tempWord=word.charAt(3);  //change the 3rd index , get the char here
        word =word.substring(0, index)
                + ch
                + word.substring(index + 1);
        return word;
    }
    public String deleteFL(String word){
        String tempWord=word.substring(1,word.length()); //makes new word without first
        if(dictionary.contains(tempWord)){ //if word without first letter is in the dict
            suggestions.add(tempWord); //add it to the array list
        }
        return tempWord;
    }
    /**
     * This deletes last letter and sees if it is in dictionary
     * @param word the word being manipulated.
     */
    public String deleteLL(String word){
        String tempWord=word.substring(0,word.length()-1); //makes new word without last
        if(dictionary.contains(tempWord)){
            suggestions.add(tempWord); //add it to the array list
        }
        return tempWord;
    }
    /**
     * This method pluralizes a word input
     * @param word the word being manipulated.
     */
    public String pluralize(String word) {
        String tempWord = word + "s"; //pluralize the word
        if (dictionary.contains(tempWord)) {
            suggestions.add(tempWord); //add it to the array list
        }
        return tempWord;
    }

}

