public class mainP11 {
    public static void main(String[] args) {
        String password1 = "Abcdef1$";
        String password2 = "roro";//short
        String password3 = "onlyletters";
        String password4 = "12345678";
        String password5 = "ALLCAPITALS1";
        String password6 = "Lowercase123";
        String password7 = "Specials@#$";
        String password8 = "NeedsNumbersAndSpecials";
        
        boolean result1 = Practical11.verifyPassword(password1);
        boolean result2 = Practical11.verifyPassword(password2);
        boolean result3 = Practical11.verifyPassword(password3);
        boolean result4 = Practical11.verifyPassword(password4);
        boolean result5 = Practical11.verifyPassword(password5);
        boolean result6 = Practical11.verifyPassword(password6);
        boolean result7 = Practical11.verifyPassword(password7);
        boolean result8 = Practical11.verifyPassword(password8);
    }
}

