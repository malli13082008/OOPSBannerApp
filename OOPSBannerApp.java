/**
 * OOPSBannerApp - UC3: String Join Implementation
 * @author malli13082008
 * @version 1.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC3: Use String.join() for efficient banner line construction
        String[] line1Parts = {"*", "*", "*", "*", "*", "*", "*", "*"};
        String[] line2Parts = {"*", "O", "O", "P", "P", "S", "*", "*"};
        String[] line3Parts = {"*", "*", "*", "*", "*", "*", "*", "*"};
        
        String line1 = String.join("", line1Parts);
        String line2 = String.join("", line2Parts);
        String line3 = String.join("", line3Parts);
        
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
    }
}
