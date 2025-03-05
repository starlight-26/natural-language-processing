import java.util.ArrayList;
import java.util.Scanner;

public class MyNLP {

  private ArrayList<String> words;

  public MyNLP() {
    words = FileReader.toStringList("words.txt");
  }

  /**
   * Starts the app and gets user input
   */
  public void prompt() {
    Scanner input = new Scanner(System.in);

    System.out.println("Type in your text:");
    String userInput = input.nextLine();
    userInput = userInput.toLowerCase();
    System.out.println("\n");

    ArrayList<String> wordList = textToWords(userInput);

    wordList = removePunctuation(wordList);

    spellCheck(wordList);

    input.close();
  }

  /**
   * STUDENT DEVELOPED METHOD
   * Prints out the mispelled words
   * @param List to be printed out
   */
  public void printOut(ArrayList<String> list) {
    if (list.size() == 0) {
      System.out.println("No misspelled words");
    } else {
      System.out.println("Misspelled Words:");
      
      for (String i : list) {
        System.out.println(i);
      }
    }
  }


  /**
   * STUDENT DEVELOPED METHOD
   * Checks the spelling of all words in an ArrayList
   * @param  wordList The ArrayList containing words to be spell checked 
   */
  public void spellCheck(ArrayList<String> wordList) {
    ArrayList<String> list = new ArrayList<String>();
    
    for (String i : wordList) {
      if (!isWord(i)) {
        list.add(i);
      }
    }
    
    printOut(list);
  }

  /**
   * STUDENT DEVELOPED METHOD
   * Checks if a word matches with a word in the words instance variable
   * @param  The word to be checked 
   * @return True if the word matches, False if it doesn't
   */
  public boolean isWord(String word) {
    for (String i : words) {
      if (word.equals(i)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Returns an ArrayList containing the individual words from textList
   * @param  text String to be made into an ArrayList
   * @return List of individual words
   */
  public ArrayList<String> textToWords(String text) {
    ArrayList<String> wordList = new ArrayList<String>();

    int location = text.indexOf(" ");

    while (location != -1) {
      String currentWord = text.substring(0, location);
      wordList.add(currentWord);
      text = text.substring(location + 1);
      location = text.indexOf(" ");
    }

    wordList.add(text);
    
    return wordList;
  }

  /**
   * STUDENT DEVELOPED METHOD
   * Removes all punctuation in an ArrayList
   * @param  list An ArrayList potentially containing punctuation 
   * @return An ArrayList without any punctuation
   */
  public ArrayList<String> removePunctuation(ArrayList<String> list) {
    ArrayList<String> wordList = new ArrayList<String>();
    
    for (int i = 0; i < list.size(); i++) {
      char[] cArray = list.get(i).toCharArray();
      String word = "";

      for (int j = 0; j < cArray.length; j++) {
        Character temp = cArray[j];
        int value = temp.getNumericValue(temp);

        if (value > 0) {
          word += temp.toString();
        }
      }

      wordList.add(word);
      word = "";
    }

    return wordList;
  }

}