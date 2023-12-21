public class Samochud {
    private Silnik silnik;
    public Samochud(Silnik silnik)
    {
        this.silnik = silnik;
    }
    public void start()
    {
        silnik.uruchom();
    }
    public void stop()
    {
        silnik.zatrzymaj();
    }

}
