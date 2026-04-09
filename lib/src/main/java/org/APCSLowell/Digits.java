package org.APCSLowell;

import java.util.ArrayList;

public class Digits {
   /** The list of digits from the number used to construct this object.
     *  The digits appear in the list in the same order in which they appear in the original number
     */
    public ArrayList<Integer> digits;

    /** Constructs a `Digits` object that represents `num`.
     *  *Precondition*: `num >= 0`
     */
    public Digits(int num) {
        /* To be implemented in part (a) */
        digits = new ArrayList<Integer>();
        if (num == 0){
            digits.add(0);
        }
        int nums = num;
        while (nums > 0){
            digits.add(0,nums%10);
            nums = nums/10;
        }
       
    }

    /** Returns `true` if the digits in this `Digits` object are in strictly increasing order;
     *      `false` otherwise.
     */
    public boolean isStrictlyIncreasing() {
        /* To be implemented in part (b) */
        int i = 0;
        while (i < digits.size()-1){
            if (digits.get(i+1) <= digits.get(i)){
                return false;
            } else {
                i++;
            }
        }
        return true;
       
    }
}
