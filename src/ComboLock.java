public class ComboLock {
    int combo1, combo2, combo3;
    int set1, set2, set3;
    int dial;
    boolean firstset;


    ComboLock(int c1, int c2, int c3){

        combo1 = c1;
        combo2 = c2;
        combo3 = c3;
    }

    void turnClockwise(int x){

        for (int i = 0; i < x; i++){
            dial --;
            if (dial<0){
                dial = 39;
            }
        }

    }

    void turnCounterClockwise(){

    }







}