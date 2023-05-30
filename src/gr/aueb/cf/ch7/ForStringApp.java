package gr.aueb.cf.ch7;

public class ForStringApp {
    public static void main(String[] args) {
        String s = "Coding Factory";

        //Δημιουργεί υπο string Με start point και endpoint//
        String substring = s.substring(0, 8);
        System.out.println(substring);

//        //Μέθοδο s.charAt(i)
//        for (int i = 0; i < s.length(); i++) {
//            System.out.print(s.charAt(i) + " ");
//
//        }
//
//        System.out.println("\u2764");
//
//        // Enhanced for Με κλάση toCharArray
//        for (char ch : s.toCharArray()) {
//            System.out.print(ch + " ");
//        }
//        System.out.println("\u2764");
//
//
//     //Μέτρημα θέσης Position.
//        int index = s.indexOf("o", 7);
//        System.out.println(index);
//
//        //Μέτρημα απο τελευταίο στοιχείο.
//        int index2 = s.lastIndexOf("o");
//        System.out.println(index);
//
//        //s.startsWith()
//
//        if (s.startsWith("C")) System.out.println("Coding Factory");
    }


}
