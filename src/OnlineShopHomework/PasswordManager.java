package OnlineShopHomework;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class PasswordManager {
    public static void readPassword(String password) {
    }

    public void writePassword(String password) {
        String pathToFIle = "C:\\Users\\User\\Desktop\\Java Projects\\OnlineShop\\src\\OnlineShopHomework\\saugykla.txt";
        File file = new File(pathToFIle);
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(password);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("klaida irasant faila");
        }
    }

    public static String readPassword() {
        String pathToFIle = "C:\\Users\\User\\Desktop\\Java Projects\\OnlineShop\\src\\OnlineShopHomework\\saugykla.txt";
        File file = new File(pathToFIle);
        String password = null;
        try {
            Scanner scanner = new Scanner(file); // scanneri galima naudoti ir failu skaitymui
            password = scanner.nextLine();
            scanner.close();
        } catch (Exception e) {
            System.out.println("klaida skaitant faila");
        }
        return password;
    }

    public static void main(String[] args) {
        PasswordManager passwordManager = new PasswordManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įrankis skirtas prisijungimų administravimui \nįveskite el.paštą+slaptažodį be tarpų išaugojimui");
        String password = scanner.nextLine();
        passwordManager.writePassword(password);
        // patikrinkim ar tikrai sekmingai irase
        System.out.println(passwordManager.readPassword());
    }
}
