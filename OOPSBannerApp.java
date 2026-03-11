 for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + " " +
                oPattern[i] + " " +public class uc6{
	  public static String[] getOPattern() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }
    public static String[] getPPattern() {
        return new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
    }
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
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();
                pPattern[i] + " " +
                sPattern[i]
            );
        }
    }
}
