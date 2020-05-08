package OnlineShopHomework;

import java.util.Scanner;

public class CategoriesPage {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        char pageChose = '0';
        System.out.print("CATEGORIES PAGE \n[d]Drinks\n[c]Chocolade\n[b]Burgers\n[h]HOME PAGE\n[e]Exit\nyour chose? ");

        do {
            pageChose = scanner.next().charAt(0);

            switch (pageChose) {
                case 'd':
                    System.out.println("DRINKS PAGE");
                    DrinksPage.readFile();
                    break;

                case 'c':
                    System.out.println("CHOCOLADE PAGE");
                    //SignInMain.main(true);
                    break;

                case 'b':
                    System.out.println("BURGERS PAGE");
                    break;

                case 'h':
                    System.out.println("**************");
                    HomePage.showMenu();

                    break;
                case 'e':
                    System.out.println("**************");
                    break;

                default:
                    System.out.println("neteidingai pasirinktas operacijos numeris. Bandykite dar karta");
                    break;
            }


        } while (pageChose != 'e');
    }
}
