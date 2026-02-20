public class OOPSBannerAppUC4 {

    public static void main(String[] args) {

        // Each row stored as an array (O, O, P, S)
        String[][] banner = {

            {"   ***   ", "   ***   ", " ****** ", " ***** "},
            {" **   ** ", " **   ** ", " **   **", "**     "},
            {"**     **", "**     **", " **   **", "**     "},
            {"**     **", "**     **", " **   **", "**     "},
            {"**     **", "**     **", " ****** ", " ***** "},
            {"**     **", "**     **", " **     ", "     **"},
            {"**     **", "**     **", " **     ", "     **"},
            {" **   ** ", " **   ** ", " **     ", "     **"},
            {"   ***   ", "   ***   ", " **     ", " ***** "}
        };

        // Loop through rows and print
        for(int i = 0; i < banner.length; i++) {
            System.out.println(String.join(" ", banner[i]));
        }
    }
}