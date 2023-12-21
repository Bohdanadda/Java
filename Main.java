import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Koncert koncert = new Koncert();
        LotMiedzynarodowy lotMiedzynarodowy = new LotMiedzynarodowy();
        BramkaNaAutostradzie bramka = new BramkaNaAutostradzie();
        koncert.wystaw;
        lotMiedzynarodowy.wystawBilet();
        bramka.wystawBilet();
         */

        KierownikWycieczki kierownik = new KierownikWycieczki(new Koncert());
        kierownik.oganijBilet();
        kierownik = new KierownikWycieczki(new LotMiedzynarodowy());
        kierownik.oganijBilet();
        kierownik = new KierownikWycieczki(new BramkaNaAutostradzie());
        kierownik.oganijBilet();


        StandardowyPrinter mojPrintre = new StandardowyPrinter();
        Biuro biuro = new Biuro(mojPrintre);
        biuro.drukujDokument("");

        BenzynowySilnik sylnik = new BenzynowySilnik();
        Samochud samochud = new Samochud(sylnik);
        samochud.start();
        samochud.stop();

        Email email = new Email();
        Uzytkownik uzytkownik = new Uzytkownik(email);
        uzytkownik.powiadoOModernizacji("");
        /*
       int[] agesToChek = {25,16,20};
       for(int age : agesToChek)
       {
           try {
               checkAge(age);
               System.out.println("Wiek " + age + " jest poprawny");
           }
           catch (IllegalArgumentException e)
           {
               System.out.println("Wyjatek zlapano" + e.getMessage());
           } catch (IllegalAccessException e) {
               System.out.println("Wijatek" + e.getMessage());
           }
       }

         */

       Scanner scanner = new Scanner(System.in);
       while (true)
       {
           try {
               System.out.println("Wprowadz 1 liczbe: ");
               int liczba1 = Integer.parseInt(scanner.nextLine());
               System.out.println("Wprowadz 2 liczbe: ");
               int liczba2 = Integer.parseInt(scanner.nextLine());

               if(liczba2 == 0)
               {
                   throw new ArithmeticException(" Nie mozna dzielicz przes 0.");
               }
               int wynik = liczba1 / liczba2;
               System.out.println("Dzielenia:" + wynik);
               break;
           }
           catch (NumberFormatException e)
           {
               System.out.println("Blad");
           }
           catch (ArithmeticException e)
           {
               System.out.println("Blad retmetyczny" + e.getMessage());
           }
       }


       String testowyEmail = ("niepoprawny adres");
        try
        {
            sprawdzFormatDanych(testowyEmail);
            System.out.println("jest poprawny");
        }
        catch (NiepoprawnyFormatDanychException e)
        {
            System.out.println("Wyjatek" + e.getMessage());
        }
    }
}