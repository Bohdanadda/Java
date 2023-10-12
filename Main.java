import java.util.*;

public class Main {
    public static Random random = new Random();

    public static void main(String[] args) {

        System.out.println(generateRandomDouble());
        int[] tab = {1,2,3,4,5};
        System.out.println(Arrays.stream(tab).min());
        piramida();
        MinMax();
        zmiana();
        sume();

    }
    public static int generateRandomInt()
    {
        return random.nextInt();
    }
    //zad2
    public static double generateRandomDouble()
    {
        return random.nextDouble(15,20);
    }
    //zad3
    public static void tab()
    {
        double randomDouble = generateRandomDouble();
        System.out.println("Losowa liczba zmiennoprzecinkowa" + randomDouble);
    }
    //zad4

    //zad 5
    public static void piramida()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj znak");
        String znak = scanner.next();
        System.out.println("Podaj wysokość");
        int wysokosc = scanner.nextInt();

        for(int i =0;i<wysokosc; i++)
        {
            int liczbaspacji = wysokosc - i - 1;
            int liczbaznakow = 2*i+1;
            StringBuilder sb = new StringBuilder();
            while (liczbaspacji-- > 0)
                sb.append(' ');
            while (liczbaznakow-- > 0)
                sb.append(znak);
            System.out.println(sb.toString());

        }

    }
    //zad6
    public static void  MinMax()
    {
        int[] tab=new int[15];
        for(int i=0;i<15;i++)
        {
            tab[i]=random.nextInt(1,100);
        }
        System.out.println(Arrays.stream(tab).min().getAsInt());
        System.out.println(Arrays.stream(tab).max().getAsInt());
    }
    //zad9
    public static void zmiana()
    {
        String input = "bananowy";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i<input.length();i++)
        {
            char currentChar = input.charAt(i);
            if(result.indexOf(String.valueOf(currentChar))== -1)
            {
                result.append(currentChar);
            }
        }
        System.out.println("Napis bez powtórzeń:"+ result.toString());
    }
    //zad10

    //zad11

    //zad12

    public static void sume()
    {
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner scanner= new Scanner(System.in);

        System.out.println("Podaj 10 liczb ");

        for (int i =0; i <10; i++)
        {
            System.out.print("liczba"+(i+1)+"i");
            double num = scanner.nextDouble();
            numbers.add(num);
        }

        double sum = 0.0;
        for (Double number: numbers)
        {
            sum += number;
        }
        System.out.println("Suma wszystkich liczb:"+ sum);
    }

    //zad13

}