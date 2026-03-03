public class OOPSBannerUC5 {
    public static void main(String[] args) {

        String[] banner = {
            String.join("", "","","","","","","","","","","","","","","*"),
            String.join("", ""," "," "," "," "," "," "," "," "," "," "," "," "," ",""),
            String.join("", ""," "," ","H","E","L","L","O"," "," "," "," "," "," ",""),
            String.join("", ""," "," ","U","C","5"," ","A","P","P"," "," "," "," ",""),
            String.join("", ""," "," "," "," "," "," "," "," "," "," "," "," "," ",""),
            String.join("", "","","","","","","","","","","","","","","*")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
