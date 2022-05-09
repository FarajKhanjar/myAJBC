package bootcamp.oop.basic.strings;

import java.util.Scanner;

public class Runner {

	public static Scanner scanner = new Scanner(System.in);

	public static void printMsg() //This method print the options
	{
	    String menuText= "Please enter the number of your selection from the following options:\r\n";
		menuText+= "1. Enter 2 sentences and I'll tell you if one is the other written backwards.\r\n";
		menuText+= "2. Enter a word and I'll tell you if it is a palindrome.\r\n";
		menuText+= "3. Enter a sentence and a word and I'll remove that word from anywhere in the sentence for you.\r\n";
		menuText+= "4. Enter a sentence and I'll capitalize the beginning of each word in it.\r\n";
		menuText+= "5. Enter a sentence and 2 words and I'll replace that first word  with the second from everywhere in the sentence for you.\r\n";
		menuText+= "6. Enter a sentence and a letter and I'll print all the words that start with that letter.\r\n";
		menuText+= "7. Exit\r\n";
		System.out.println(menuText);		
	}
	
    public static String inputMsg(String msg) {
        System.out.println(msg);
        String returnMsg = scanner.nextLine();
        return returnMsg;
    }

    public static void menuText_1() 
    {
        String firstSentence = inputMsg("Enter the first sentence: ");
        String secondSentence = inputMsg("Enter the second sentence: ");
        boolean result=isWrittenBackWards(firstSentence,secondSentence);
		String strRes = (result) ? " " : " NOT "; 
        System.out.println("the Two sentences are"+strRes+"written Back Wards");
    }

    private static boolean isWrittenBackWards(String firstSentence, String secondSentence) 
    // if the second sentence is the same as the first sentence but is written backwards return true.
    {
    	
    	int length1 = firstSentence.length();
		int length2 = secondSentence.length();
		for(int i=0; i<length1; i++)
		{
			int index = (length2-1);	
			if(firstSentence.charAt(i)!=secondSentence.charAt(index))
			{
				return false;
			}
			length2--;			
		}
		return true;
    }

    public static void menuText_2() {
        String word = inputMsg("Enter the word: ");        
        boolean word_result = isPalindrome(word);
		String strRes = (word_result) ? " " : " NOT "; 
        String printString = "The word is"+strRes+"palindrome";
        System.out.println(printString);
    }

    private static boolean isPalindrome(String word) //return if the word is palindrome
    { 
        int length = word.length() - 1;
        int start = 0;
        while (length > start) {
            if (word.charAt(length--) != word.charAt(start++)) {
                return false;
            }
        }
        return true;
    }

    public static void menuText_3() {
        String sentence = inputMsg("Enter the sentence: ");
        String word = inputMsg("Enter the word: ");
        removeWordFromSentence(sentence, word);
    }

    private static void removeWordFromSentence(String sentence, String word) //removes the word from the sentence and prints the sentence
    {
        System.out.println(sentence.replace(word, ""));
    }

    public static void menuText_4() {
        String sentence;
        sentence = inputMsg("Enter the sentence: ");
        capitalizeTheBeginningOfWords(sentence);
    }


    private static void capitalizeTheBeginningOfWords(String sentence) //capitalize every beginning of words in the sentence
    {
        String[] sentenceSplit = sentence.split(" ");
        String word = "";
        for (int i = 0; i < sentenceSplit.length; i++) {
            word = sentenceSplit[i].substring(0, 1).toUpperCase() + sentenceSplit[i].substring(1);
            sentenceSplit[i] = word;
        }
        for (int i = 0; i < sentenceSplit.length; i++) {
            System.out.print(sentenceSplit[i] + " ");
        }
    }

    public static void menuText_5() {
        String sentence = inputMsg("Enter the sentence: ");
        String firstWord = inputMsg("Enter the target word: ");
        String secondWord = inputMsg("Enter the replacement word: ");
        replaceFirstWordWithSecondWord(sentence, firstWord, secondWord);
    }


    private static void replaceFirstWordWithSecondWord(String sentence, String firstWord, String secondWord) 
    //replaces the first word with the second word in the sentence and prints the sentence
    {
        sentence = sentence.replace(firstWord, secondWord);
        System.out.println(sentence);
    }

    public static void menuText_6() {
        String sentence = inputMsg("Enter the sentence: ");
        String letter = inputMsg("Enter the letter: ");
        printWordsStartingWithLetter(sentence, letter);
    }


    private static void printWordsStartingWithLetter(String sentence, String letter) 
    //prints all the words in the sentence that start with the letter
    {
        String[] sentenceSplit = sentence.split(" ");
        for (int i = 0; i < sentenceSplit.length; i++) {
            if (sentenceSplit[i].substring(0, 1).equals(letter)) {
                System.out.println(sentenceSplit[i]);
            }
        }
    }
    
public static void main(String[] args) {
        
    	printMsg();
    	int selectionInput;
        do {        	
            selectionInput = Integer.parseInt(inputMsg("Enter you selection index: "));
            switch (selectionInput) {
                case 1:
                	menuText_1();
                    System.out.println();
                    break;
                case 2:
                	menuText_2();
                    System.out.println();
                    break;
                case 3:
                	menuText_3();
                    System.out.println();
                    break;
                case 4:
                	menuText_4();
                    System.out.println();
                    break;
                case 5:
                	menuText_5();
                    System.out.println();
                    break;
                case 6:
                	menuText_6();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid number: ");
            }
        } while (selectionInput != 7);
        scanner.close();
    }
}
