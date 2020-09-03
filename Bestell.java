import java.util.*;
public class Bestell {
    public static void main(String argv[]){
        double b = rechnung();
        System.out.println(" Rechnungsbetrag: " + b + "\n Programmende.");
    }
    public static double rechnung(){
        Scanner ein = new Scanner(System.in);
        System.out.print("Programm zur Berechnung des Rechnungsbetrags \n Bestellwert in Euro: ");
        double b = ein.nextDouble();
        if(b < 200 && b > 0)
            b = b + 5.5;
        else if(b <= 0)
            return rechnung();
        return b;
    }
}
