package TestManager;

public class Printer {

    public static void print(String suite,String title, String priority, String owner  ){

     System.out.println("------------------------------------------------------------");
     System.out.println(String.format("|Suite: %-67s|", suite));
     System.out.println(String.format("|Test Case: %-63s|",title));
     System.out.println(String.format("|Priority: %-28s|Owner: %-28s|",priority,owner));

    }
}
