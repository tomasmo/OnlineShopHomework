package OnlineShopHomework;

public class PassTikrinimas {
    static String naujasSlaptazodis;
    static String pakartotasSlaptazodis;
    static String newPassword;

    PassTikrinimas() {
    }

    public void tikrintiSlaptazodi(String naujasSlaptazodis, String pakartotasSlaptazodis) {
        //naujasSlaptazodis = naujasSlaptazodis.toLowerCase();
        // pakartotasSlaptazodis = pakartotasSlaptazodis.toLowerCase();

        if (naujasSlaptazodis.equals(pakartotasSlaptazodis)) {
            newPassword = naujasSlaptazodis;
            System.out.println("sukurtas naujas slaptažodis: " + newPassword);
        } else {
            System.out.println("pakartotas slaptažosis neatitinka");
        }

    }
}
