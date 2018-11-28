public class ComboLock { // Creating ComboLock class 

    // Private integer fields
    private int combo1, combo2, combo3;
    private int set1, set2, set3;
    private int dial;
    private boolean firstSet = true;


    // Creating ComboLock Constructor - this will take in 3 parameters c1,c2 & c3
    ComboLock(int c1, int c2, int c3){

        combo1 = c1;
        combo2 = c2;
        combo3 = c3;

        if (c1 < 0){ // This will be keep the dial from going to any negative numbers
            combo1 = 0;
        }
        else if (c1 > 39){// if c1 = 39 dial will be set to 0 so the dial isn't turned past 39
            combo1 = 39;
        }
        else{
            combo1 = c1;
        }
        if(c2 < 0){ // This will be keep the dial from going to any negative numbers
            combo2 = 0;
        }
        else if(c2 > 39){// if c2 = 39 dial will be set to 0 so the dial isn't turned past 39
            combo2 = 0;
        }
        else{
            combo2 = 0;
        }
        if (c3 < 0) {// This will be keep the dial from going to any negative numbers
            combo3 = 0;
        }
        else if (c3 > 39){// if c3 = 39 dial will be set to 0 so the dial isn't turned past 39
            combo3 = 39;
        }
        else{
            combo3 = c3;
        }

        //assigning to 0
        set1 = 0;
        set2 = 0;
        set3 = 0;
        dial = 0;
    }

    void turnClockwise(int x){//method for dial to turn clockwise.

        for (int i = 0; i < x; i++){
            dial --;
            if (dial<0){
                dial = 39;
            }
        }

    }

    void turnCounterClockwise(int x){//method for dial to turn counter clockwise.
        for (int i = 0; i < x; i++){
            dial ++;
            if(dial > 39){
                dial = 0;
            }
        }
        if(firstSet){
            set1 = dial;
            firstSet = false;
        }
        else{
            set3 = dial;
        }


    }

    public boolean open(){//This method is will determine if the combination is correct
        if(combo1 == set1 && combo2 == set2 && combo3 == set3){
            return true;
        }
        else{
            return false;
        }
    }
    public void reset(){//This method will reset the dial and sets to 0
        dial = 0;
        set1 = 0;
        set2 = 0;
        set3 = 0;
        firstSet = true;
    }



}
