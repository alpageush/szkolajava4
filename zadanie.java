import java.util.Scanner;

public class zadanie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj długość kwadratu: ");
        int kw_dlugosc = sc.nextInt();
        System.out.print("Podaj wysokość kwadratu: ");
        int kw_wysokosc = sc.nextInt();
        for(int i=0; i<=kw_dlugosc; i++) System.out.print("*");
        for(int i=0; i<=kw_wysokosc; i++) System.out.println("*");
    }
}

String drukuj_linie(int dlugosc, boolean pelne) {
    String linia = "*";
    if(pelne) for(dlugosc) linia += "*"
    return String = 
}