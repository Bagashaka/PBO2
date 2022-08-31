/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;
//* mengimpor semua file pada packagenya
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Praktikan
 */
public class Praktikum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intCuy = 2;
        float floatCuy = 3.4f;
        double doubleCuy = 1.5d;
        long longCuy = 10238L;
        System.out.println(intCuy);
        System.out.println(floatCuy);
        System.out.println(doubleCuy);
        System.out.println(longCuy);
        
        boolean isTrue = false;
        System.out.println(isTrue);
        
        char ch ='a';
        System.out.println(ch);
        String str = "Bagas muhammad shaka";
        System.out.println(str);
        
        int angka = 51;
        double fromInt = angka;
        
        double banyak = 2.345678d;
        int fromDb =  (int) banyak;
        System.out.println(fromDb);
         
//        SCANNER
//        Scanner bagas = new Scanner(System.in);
//        System.out.print("Nama anda : ");
//                String namaa = bagas.nextLine();
//        System.out.print("Umur anda : ");
//                int umur = bagas.nextInt();               
//              bagas.nextLine();
//        System.out.print("Hobi anda : ");
//                String hobi = bagas.nextLine();
//        
//        System.out.println("Nama anda : " + namaa);
//        System.out.println("Umur anda : " + umur);
//        System.out.println("Hobi anda : " + hobi);
       
        String nama = JOptionPane.showInputDialog("Input nama anda");
  }
}
