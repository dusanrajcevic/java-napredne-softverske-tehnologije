package banka;

public class BankaUtil {
    public static <T> void prebaciKlijente(Banka<? extends T> izvor, Banka<? super T> odrediste) {
        odrediste.getKlijenti().addAll(izvor.getKlijenti());
        izvor.getKlijenti().clear();
    }
}
