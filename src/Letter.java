/**
 * Created by Jack Li on 10/2/2015.
 */
public class Letter {
    private char let;
    private int[] arrT;
    public Letter (char s, int[] a) {
        let = s;
        arrT = a;
    }
    public char getLetter() {
        return let;
    }
    public int getArr(int x) {
        return arrT[x];
    }
    public boolean checkArr(int a) {
        boolean check = true;
        for(int i = 0; i < arrT.length - 1; i++) {
            if(a != arrT[i]) {
                check = false;
            }
        }
        return check;
    }
}
