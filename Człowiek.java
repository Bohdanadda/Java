//1)
public class Człowiek {
    //1)
    String imie;

    public Człowiek(String imie)
    {
        this.imie = imie;
    }

    public void przedstawSie(String imie)
    {
        System.out.println("Cześć, jestem "+imie);
    }

    //2)
    public void dowiedzCzesc(Człowiek innaOsoba)
    {
        System.out.println("Ceść " + innaOsoba.imie);
    }

    //3)
    public void zmienImie(String noweImie)
    {
        imie = noweImie;
    }

    //4)
    public  void zamianImionami(Człowiek innaOsoba)
    {
        String temp = this.imie;
        this.imie = innaOsoba.imie;
        innaOsoba.imie = temp;
    }

}