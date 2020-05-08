package OnlineShopHomework;

import java.io.*;

public class DrinksPage {
    Drinks[] allDrinks = new Drinks[5];
    public static void showMenu() {
        int fantaquantity = 1000;
        int merindaquantity = 1100;
        int spritequantity = 1200;
        int schweppesuantity = 1300;
        int pepsiquantity = 1400;

        DrinksPage t = new DrinksPage();
        t.allDrinks[0] = new Drinks("Fanta", 1.15, "eur/pc", fantaquantity, " pcs");
        t.allDrinks[1] = new Drinks("Merinda", 1.25, "eur/pc", merindaquantity, " pcs");
        t.allDrinks[2] = new Drinks("Sprite", 1.35, "eur/pc", spritequantity, " pcs");
        t.allDrinks[3] = new Drinks("Schweppes", 1.45, "eur/pc", schweppesuantity, " pcs");
        t.allDrinks[4] = new Drinks("Pepsi", 1.55, "eur/pc", pepsiquantity, " pcs");
        t.writeFile();
        t.readFile();
    }

    public static void main() {
    }

    public void writeFile() {
        try {
            FileOutputStream fos = new FileOutputStream("drinksFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(allDrinks);
            oos.close();
            // System.out.println("File Saved");
        } catch (Exception e) {
            System.out.println("Error in output:" + e.toString());
        }
    }

    public static void readFile() {
        try {
            FileInputStream fis = new FileInputStream("drinksFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Drinks[] allDrinks = (Drinks[]) ois.readObject();
            for (int i = 0; i < 4; i++) {
                System.out.println(allDrinks[i].drinkName +
                        " price = " + allDrinks[i].price + allDrinks[i].priceUnit +
                        ", quantity = " + allDrinks[i].quantity + allDrinks[i].quantityUnit);
            }
        } catch (Exception e) {
            System.out.println("Error in output:" + e.toString());
        }
    }

    static class Drinks implements Serializable {
        private static final long serialVersionUID = 1647631086810497694L;
        String drinkName;
        double price;
        String priceUnit;
        int quantity;
        String quantityUnit;

        Drinks(String drinkName, double price, String priceUnit, int quantity, String quantityUnit) {
            this.drinkName = drinkName;
            this.price = price;
            this.priceUnit = priceUnit;
            this.quantity = quantity;
            this.quantityUnit = quantityUnit;
        }
    }
}

