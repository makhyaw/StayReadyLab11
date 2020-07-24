import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class SpellingSuggestionsTest {
    SpellingSuggestions spellingSuggestion;

    @Before
    public void setup() {
        this.spellingSuggestion = new SpellingSuggestions();
    }

    @Test
    public void deleteFLTest(){ //FL= first letter
        String name= "Makhya";
        //given
        String expected= "akhya";
        //then
        String actual=spellingSuggestion.deleteFL(name);
        //when
        Assert.assertTrue(expected.matches(actual));
    }
    @Test
    public void deleteLLTest(){ //LL= last letter
        String name= "Some";
        //given
        String expected= "Som";
        //then
        String actual=spellingSuggestion.deleteLL(name);
        //when
        Assert.assertTrue(expected.matches(actual));
    }
    @Test
    public void changeLetterTest(){ // to change any letter from indices 1-one before last index (not first or last)
        //given
        String name= "Some";
        String expected= "Sole";
        //then
        String actual=spellingSuggestion.changeLetter(name);
        //when
        Assert.assertTrue(expected.matches(actual));
    }
    @Test
    public void insertLetterTest(){
        //given
        String name= "Makhy";
        String expected="Makhya";
        //then
        String actual= spellingSuggestion.insertLetter(name);
        //when
        Assert.assertTrue(expected.matches(actual));
    }
    @Test
    public void swapTwoLettersTest(){ //swap neighboring letters
        //given
        String name="Gatorade";
        String expected="Gaotrade";
        //then
        String actual=spellingSuggestion.swapTwoLetters(name);
        //when
        Assert.assertTrue(expected.matches(actual));
    }
    @Test
    public void pluralizeTest(){ //adds s to end of a word
        String name= "Makhya";
        //given
        String expected= "Makhyas";
        //then
        String actual=spellingSuggestion.pluralize(name);
        //when
        Assert.assertTrue(expected.matches(actual));
    }
}