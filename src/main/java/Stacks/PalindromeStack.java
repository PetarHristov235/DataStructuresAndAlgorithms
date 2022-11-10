package Stacks;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.List;

public class PalindromeStack {

    public static void main(final String[] args) {
        //should return true
        System.out.println(checkForPalindrome("abccba"));
        //should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw"));
        //should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        //should return false
        System.out.println(checkForPalindrome("hello"));
        //should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    private static boolean checkForPalindrome(final String text) {
        final LinkedList<Character>stack=new LinkedList<>();
        final StringBuilder stringNoPunctuation=new StringBuilder(text.length());
        final String lowercase=text.toLowerCase();

        for (int i = 0; i <lowercase.length() ; i++) {
            final char c=lowercase.charAt(i);
            if('a' <= c && 'z' >= c){
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        final StringBuilder reversedString=new StringBuilder(stack.size());
        while (!stack.isEmpty()){
            reversedString.append(stack.pop());
        }

        return reversedString.toString().equals(stringNoPunctuation.toString());
    }
}
