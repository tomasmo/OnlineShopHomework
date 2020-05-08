package OnlineShopHomework;

public class EmailTikrinimas {
    static String naujasPastas;
    static String pakartotasPastas;
    static String newEmail;
    EmailTikrinimas() {
    }

    public void tikrintiPasta(String naujasPastas, String pakartotasPastas) {
        naujasPastas = naujasPastas.toLowerCase();
        pakartotasPastas = pakartotasPastas.toLowerCase();

        if (naujasPastas.equals(pakartotasPastas)) {
            newEmail = naujasPastas;
            System.out.println("sukurtas naujas paštas: " + newEmail);
        } else {
            System.out.println("pakartotas paštas neatitinka");
        }

    }
}
