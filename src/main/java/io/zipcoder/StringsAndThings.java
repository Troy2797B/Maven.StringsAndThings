package io.zipcoder;


import java.util.ArrayList;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        //ArrayList<String> index = new ArrayList<>();
        char [] index = input.toCharArray();
        Integer numOfYZ = 0;
        for (int i = 0; i < index.length; i++){

            if (index[i] == ' '){
                if (index[i - 1] == 'y' || index[i - 1] == 'z'){
                    numOfYZ = numOfYZ + 1;
                }
            }
        } if (index[index.length - 1] == 'y' || index[index.length - 1] == 'z'){
            numOfYZ = numOfYZ + 1;
        }return numOfYZ;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        /*char[] indexBase = base.toCharArray();
        char[] indexRemove = remove.toCharArray();
        StringBuffer sb = new StringBuffer();
        //looping through remove array
        for (int i = 0; i < indexRemove.length - 1; i++){
            //looping inside with base array
            for (int k = 0; k < indexBase.length -1; i++){
                //checking if both current indexes are the same
                if (indexRemove[i] == indexBase[k]){
                    //trying to remove it from base if they are
                    sb.deleteCharAt(indexBase[k]);
                }
            }
        }*/
        return base.replaceAll(remove, "");
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        int numOfIs = 0;
        int numOfNot = 0;
        for (int i = 0; i < input.length(); i++){
            if (i == input.length() - 1){
                break;
            } else if (input.charAt(i) == 'i' && input.charAt(i +1) == 's'){
                numOfIs = numOfIs + 1;
            } else if(input.charAt(i) == 'n' && input.charAt(i + 1) == 'o' && input.charAt(i + 2) == 't'){
                numOfNot = numOfNot + 1;
            }
        }
        return numOfNot == numOfIs;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        //run a loop through input
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == 'g' && input.charAt(i + 1) == 'g'){
                return true;
            }
        } return false;
        //check if character.isletter ' g'
        // if it is true, run a second loop through it at the next letter
        //check if that character is also 'g'
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        Integer triple = 0;
        //run for loop through input
        for (int i = 0; i < input.length(); i++){
            if (i == input.length() - 1){
                break;
            } else if (input.charAt(i) == input.charAt (i+1) && input.charAt(i) == input.charAt(i + 2)){
                triple = triple + 1;
            }
        }
        //check the letter and iff the next two are equal
        //then triple = triple + 1

        return triple;
    }
}
