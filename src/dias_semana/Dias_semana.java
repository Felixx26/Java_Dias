/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dias_semana;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Felix
 */
public class Dias_semana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> dias = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.println("Escribe el " +(i+1)+ "° día de la semana");
            dias.add(sc.nextLine());
        }
        for (int i = 7; i > 0; i--) {
            System.out.print(dias.get(i-1) + " ");
        }
    }

}
