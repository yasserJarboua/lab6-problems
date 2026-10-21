package problem3;

import problem1.Item;

import java.util.Scanner;

public class Test {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=scan.nextInt();
        Library lib=new Library(n);
        Novel b=new Novel("HSK","DINI Ahmed",256,96);
        Magazine m=new Magazine("The monthly...","December",2025);
        lib.add(b);
        lib.add(m);
        String keepShopping = "y";
        int choice;
        boolean exist=true;
        do
        {
            System.out.println ("1-add ");
            System.out.println ("2-display authors ");
            System.out.println ("3-display documents ");
            System.out.println ("4-delete ");
            System.out.println ("5-exit ");
            choice = scan.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the title of the document: ");
                    String title=scan.next();
                    lib.add(new Document(title));
                    break;
                case 2:
                    lib.displayAuthors();
                    break;
                case 3:
                    lib.displayDocuments();
                    break;
                case 4:
                    System.out.print("Enter the number of record of the document: ");
                    int number=scan.nextInt();
                    lib.delete(lib.document(number));
                    break;
                case 5:
                    exist=false;
            }
            scan.nextLine();
        }
        while (exist);

    }
}
