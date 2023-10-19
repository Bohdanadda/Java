public class Licznik {
    //1)
    int liczba;
    public void zwieksz(int wartosc)
    {
        liczba += wartosc;
    }
    //2)
    public void dodaj( Licznik innyLicznik)
    {
        liczba += innyLicznik.liczba;
    }

}
