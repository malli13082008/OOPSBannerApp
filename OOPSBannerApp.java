/**
 * OOPSBannerApp - UC4: Array and Loop Implementation
 * @author malli13082008
 * @version 1.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC4: Store banner lines in String array, print with loop
        String[] bannerLines = new String[3];
        
        bannerLines[0] = String.join("", "*", "*", "*", "*", "*", "*", "*", "*");
        bannerLines[1] = String.join("", "*", "O", "O", "P", "P", "S", "*", "*");
        bannerLines[2] = String.join("", "*", "*", "*", "*", "*", "*", "*", "*");
        
        // Enhanced for-loop for modularity
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}

