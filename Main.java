public class Main {
    public static void main(String[] args) {

        House domStefana = new House();
        domStefana.garage = true;
        domStefana.floors = 2;
        domStefana.rooms = 6;
        domStefana.area = 150;
        domStefana.garden = false;

        System.out.println(domStefana.getValue());

        House domSelwii = new House();
        domSelwii.garage = true;
        domSelwii.garden = false;
        domSelwii.area = 175;
        domSelwii.rooms = 4;
        domSelwii.floors = 2;

        System.out.println(domSelwii.getValue());


        //zad2
        Dog myDog = new Dog("Burek","Retriwer",3);
        myDog.bark();

        //zad3
        Car myCar = new Car("Porshe","911");
        myCar.acelerate(400);
        System.out.println("Current speed:"+ myCar.getSpeed());
        myCar.dacelerate(100);
        System.out.println("Current speed"+ myCar.getSpeed());

        //zad4
        Time currentTime = new Time(10,30);
        Time additionalTime = new Time(2,45);

        Time newTime = currentTime.addTime(additionalTime);
        System.out.println("Current time:" + currentTime);
        System.out.println("Additional Time:" + additionalTime);
        System.out.println("New Time"+newTime);

        //zad5
        //1)
        Człowiek osoba1 = new Człowiek("Jan");
        osoba1.przedstawSie(osoba1.imie);

        //2)
        Człowiek osoba2 = new Człowiek("Anna");
        osoba1.dowiedzCzesc(osoba2);

        //3)
        Człowiek osoba3 = new Człowiek("Jan");
        osoba3.zmienImie("Karl");
        osoba3.przedstawSie(osoba3.imie);

        //4)
        osoba1.zamianImionami(osoba2);
        osoba1.przedstawSie(osoba1.imie);
        osoba2.zamianImionami(osoba2);

        //zad5
        //1)
        Licznik licznik = new Licznik();
        int zmienna = 5;

        licznik.zwieksz(zmienna);
        System.out.println("Wartosc licznika po zwiekszeniu:"+licznik.liczba);

        //2)
        Licznik licznik1 = new Licznik();
        licznik1.liczba = 10;

        Licznik licznik2 = new Licznik();
        licznik2.liczba =  5;

        licznik1.dodaj(licznik2);
        System.out.println("Wartość ");
    }
}

