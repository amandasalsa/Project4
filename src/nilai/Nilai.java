/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai;
import java.util.Scanner;
/**
 *
 * @author Manda Salsa
 */
public class Nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int nilaitugas,nilaipts,nilaipas;
        double total;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Mohon Masukkan Nilai Anda");
        System.out.println("Nilai Tugas = ");
        nilaitugas = input.nextInt();
        System.out.println("Nilai PTS   = ");
        nilaipts = input.nextInt();
        System.out.println("Nilai PAS   = ");
        nilaipas = input.nextInt();
        
        total = (nilaitugas+nilaipts+nilaipas)/3;
        
        System.out.println("==================");
        if(total>90){
            System.out.println("Nilai Akhir = A");
        }else if(total>80) {
            System.out.println("Nilai Akhir = B+");
        }else if(total>70) {
            System.out.println("Nilai Akhir = B");
        }else {
            System.out.println("Nilai Akhir = F");
        }   
    }
}
