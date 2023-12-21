public class Email implements Powiadomienia{
    @Override
    public void wyslij(String wiadomosc)
    {
        System.out.println("Wysylam email" + wiadomosc);
    }

}
