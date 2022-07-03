package nz.ac.vuw.jenz.mayan;

/**
 * Convert a arabic (standard western) number to (a textual representation of) a Mayan number.
 * @author jens dietrich
 */
public class Arabic2Mayan {
    public static final char ZERO = '0';
    public static final char DOT = '*';
    public static final char BAR = '|';
    public static final char SPACE = '_';

    public static void main (String[] args) {
        int i = 26;
        String mayan = convert(i);
        System.out.println("" + i + "  ->  " + mayan);
    }

    public static String convert (int number) {
        if (number<0) {
            throw new IllegalArgumentException("input must be > 0");
        }

        if (number==0) {
            return ""+ZERO;
        }

        // find highest power of n
        int pow = 0;
        while (number > Math.pow(20,pow)) {
            pow = pow+1;
        }
        pow=pow-1;

        String mayan = "";
        while (pow>=0) {
            int mod = (int) (number % Math.pow(20,pow));
            if (pow==0) {
                String digit = convertDigit(number);
                if (mayan.length()>0) {
                    mayan = mayan + SPACE;
                }
                mayan = mayan + digit;
            }
            else {
                int n = number - mod;
                int t = (int) (n / Math.pow(20,pow));
                String digit = convertDigit(t);
                if (mayan.length()>0) {
                    mayan = mayan + SPACE;
                }
                mayan = mayan + digit;
                number = number - n;
            }
            pow = pow-1;

        }
        return mayan;
    }

    public static String convertDigit(int number) {
        if (number<0) {
            throw new IllegalArgumentException("input must be > 0");
        }
        if (number>=20) {
            throw new IllegalArgumentException("input must be <= 20");
        }
        if (number==0) {
            return ""+ZERO;
        }
        int rem = number%5;
        int fiv = number-rem;
        String part1 = "";
        for (int i=rem;i>0;i--) {
            part1 = part1+DOT;
        }
        String part2 = "";
        for (int i=fiv/5;i>0;i--) {
            part2 = part2+BAR;
        }
        return part1+part2;
    }
}
