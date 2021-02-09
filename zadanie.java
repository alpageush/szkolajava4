import java.util.Scanner;
import java.io.FileWriter;
//import java.io.File;
//import java.io.FileReader;

public class zadanie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int essa = 0;
        while(essa<1) {
            System.out.print("1. Kwadrat\n2. Prostokąt\nEXIT Wyjście\nWYBIERZ: ");
            String wybor = sc.next().toUpperCase();
            if(wybor.equals("1")) {
                System.out.print("Podaj rozmiar kwadratu: ");
                int kw_dlugosc;
                String rysunek = "";
                try { kw_dlugosc = sc.nextInt(); } catch (Exception e) {
                    System.out.println("BŁĄD: Nie wprowadzono liczby."); continue;
                }
                if(kw_dlugosc<=0) {System.out.println("BŁĄD: Wprowadzono ujemną lub zerową wartość."); continue;}
                System.out.print("Pole kwadratu: " + Integer.toString(kw_dlugosc * kw_dlugosc) + "\nObwód kwadratu: " + Integer.toString(kw_dlugosc * 4) + "\nWygląd kwadratu:\n");
                for(int i=kw_dlugosc; i>=1; i--) {
                    System.out.println(drukuj_linie(kw_dlugosc, true));
                    rysunek += drukuj_linie(kw_dlugosc, true);
                } System.out.println("\n");

                //File plik = new File("C:" + System.getProperty("file.separator") + "kwadrat.txt");
                //if(!plik.exists()) plik.createNewFile();
                //
                //FileWriter fw = new FileWriter(plik);
                //fw.write(kw_dlugosc + "\n" + rysunek);
                //fw.close();
            } else if(wybor.equals("2")) {
                System.out.print("Podaj wysokość prostokąta: ");
                int pr_wysokosc;
                try { pr_wysokosc = sc.nextInt(); } catch (Exception e) {
                    System.out.println("BŁĄD: Nie wprowadzono liczby."); continue;
                }
                System.out.print("Podaj długość prostokąta: ");
                int pr_dlugosc;
                try { pr_dlugosc = sc.nextInt(); } catch (Exception e) {
                    System.out.println("BŁĄD: Nie wprowadzono liczby."); continue;
                }

                if(pr_wysokosc<=0 || pr_dlugosc<=0) {System.out.println("BŁĄD: Wprowadzono ujemną lub zerową wartość."); continue;}
                System.out.print("Pole prostokąta: " + Integer.toString(pr_wysokosc * pr_dlugosc) + "\nObwód prostokąta: " + Integer.toString(pr_wysokosc * 2 + pr_dlugosc * 2) + "\nWygląd prostokąta:\n");
                for(int i=pr_wysokosc; i>=1; i--) System.out.println(drukuj_linie(pr_dlugosc, true)); System.out.println("\n");


            } else if(wybor.equals("EXIT")) System.exit(0);
        }
        
    }

    static String drukuj_linie(int dlugosc, boolean pelne) {
        String linia = "";
        if(pelne) for(int i=dlugosc; i>=1; i--) linia += "* ";
        return linia;
    }
}