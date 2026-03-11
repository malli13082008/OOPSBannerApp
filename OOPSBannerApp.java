public class OOPSBannerApp{

    // Static method for O pattern
    public static String[] getOPattern() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Static method for P pattern
    public static String[] getPPattern() {
        return new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
    }

    // Static method for S pattern
    public static String[] getSPattern() {
        return new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {

        // Call static methods
        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        // Loop to print banner
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}

