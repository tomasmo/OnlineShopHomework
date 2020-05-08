package OnlineShopHomework;

import java.util.Scanner;

public class SignInMain {
    public static void main(boolean args) {
        Scanner scaneris = new Scanner(System.in);
        //pašto adreso sukūrimas
        System.out.println("suveskite naują elektroninį paštą: ");
        String naujasPastas = scaneris.nextLine();
        EmailTikrinimas.naujasPastas = naujasPastas;

        System.out.println("ivestas pašto adresas: " + naujasPastas);
        System.out.println("pakartokite elektroninį paštą: ");
        String pakartotasPastas = scaneris.nextLine();
        EmailTikrinimas.pakartotasPastas = naujasPastas;

        EmailTikrinimas tikrintojas = new EmailTikrinimas();
        tikrintojas.tikrintiPasta(naujasPastas,pakartotasPastas);

        //slaptažodžio sukūrimas
        System.out.println("suveskite naują spaltažodį: ");
        String naujasSlaptazodis = scaneris.nextLine();
        PassTikrinimas.naujasSlaptazodis = naujasSlaptazodis;

        System.out.println("pakartokite slaptažodį");
        String pakartotasSlaptazodis =scaneris.nextLine();
        PassTikrinimas.pakartotasSlaptazodis =scaneris.nextLine();

        PassTikrinimas tikrintojas2 =new PassTikrinimas();
        tikrintojas2.tikrintiSlaptazodi(naujasSlaptazodis, pakartotasSlaptazodis);

        String loginData = EmailTikrinimas.newEmail + PassTikrinimas.newPassword;
        System.out.println("Verificated login data: " + loginData);
        PasswordManager passwordManager = new PasswordManager();
        passwordManager.writePassword(loginData);
        HomePage.showMenu();

    }
}
