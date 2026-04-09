package org.APCSLowell;

import java.util.ArrayList;

public class Digits {
    /** The list of digits from the number used to construct this object.
     *  The digits appear in the list in the same order in which they appear in the original number
     */
    public ArrayList<Integer> digitList;

    /** Constructs a `Digits` object that represents `num`.
     *  *Precondition*: `num >= 0`
     */
    public Digits(int num) {
        /* To be implemented in part (a) */
        digitList = new ArrayList<Integer>();
        if (num == 0){
            digitList.add(0);
        }
        while (num > 0){
            int digit = num%10;
            digitList.add(0,digit);
            num = num/10;
        }
       
    }

    /** Returns `true` if the digits in this `Digits` object are in strictly increasing order;
     *      `false` otherwise.
     */
    public boolean isStrictlyIncreasing() {
        /* To be implemented in part (b) */
        int i = 0;
        while (i < digitList.size()-1){
            if (digitList.get(i+1) <= digitList.get(i)){
                return false;
            } else {
                i++;
            }
        }
        return true;
        
    }
}
