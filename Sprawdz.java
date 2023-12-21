public class Sprawdz {
    static void sprawdzFormaException(String dane) throws NiepoprawnyFormatDanychException {
        if(!dane.contains("@"))
        {
            throw new NiepoprawnyFormatDanychException("To nie jest poprawny adres email:");
        }
    }
}
