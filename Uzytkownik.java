public class Uzytkownik {
    private Powiadomienia powiadomienia;
    public Uzytkownik(Powiadomienia powiadomienia)
    {
        this.powiadomienia = powiadomienia;
    }

    public void powiadoOModernizacji(String informacja)
    {
        powiadomienia.wyslij(informacja);
    }

}
