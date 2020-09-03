import java.util.*;
public class Bestell {
    public static void main(String argv[]){
        System.out.print("Programm zur Berechnung des Rechnungsbetrags \n Bestellwert in Euro: ");
        double b = rechnung();
        System.out.println(" Rechnungsbetrag: " + b + "\n Programmende.");
    }
    public static double rechnung(){
        Scanner ein = new Scanner(System.in);
        double b = ein.nextDouble();
        if(b < 200 && b > 0)
            b = b + 5.5;
        else if(b <= 0)
            return rechnung();
        return b;
    }
}
