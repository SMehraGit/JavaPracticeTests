import java.util.HashMap;
import java.util.Map;

public class stringProblems {

    // For loop method
    public void getWordOccurrenceUsingForLoop(String yourWord, char search){
        int wordLength = yourWord.length();

        int count = 0;
        for(int i = 0; i<wordLength; i++){
            if(yourWord.charAt(i) == search)
                count++;
        }

        System.out.println("Letter " + search + " has occurred " + count + " times in the word " + yourWord);
    }

    // Java 8 feature
    public void getWordOccurrenceUsingJava8Feature(String yourWord, char search){
        long count = yourWord.chars().filter(ch->ch == search).count();
        System.out.println("Letter " + search + " has occurred " + count + " times in the word " + yourWord);
    }

    // Get occurrences of all the letters in a String
    public void getAllWordOccurrences(String yourWord){
        char[] arrayString = yourWord.toCharArray();

        HashMap<Character, Integer> mappingGroup = new HashMap<Character, Integer>();

        for(char c: arrayString){
            if(mappingGroup.containsKey(c)){
                mappingGroup.put(c,mappingGroup.get(c)+1);
            }
            else{
                mappingGroup.put(c,1);
            }
        }
        System.out.println("Occurrences of each letter is as follows " + mappingGroup);
    }


    public static void main(String[] args){
        stringProblems a = new stringProblems();
        a.getWordOccurrenceUsingForLoop("Sagar", 'g');
        a.getWordOccurrenceUsingJava8Feature("Amazon",'A');
        a.getAllWordOccurrences("Sanyam Mehra");
    }

}
