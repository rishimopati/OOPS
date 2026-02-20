public class OOPSBannerAppUC4 {

    public static void main(String[] args) {

      
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
