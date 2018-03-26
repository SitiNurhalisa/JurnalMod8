/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;
import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // TODO code application logic here
        
        System.out.print("Masukkan Angka : ");        
        int febCount = in.nextInt();
       
        int feb[] = new int[febCount];
        feb[0] = 0;
        feb[1] = 1;
        
        
        for (int i = 2; i < febCount; i++) {
            feb[i] = feb[i-1] + feb[i-2];
        }
        
        for (int i = 0; i < febCount; i++) {
            System.out.print(feb[i] + " ");
            
        }
        System.out.println("Terimakasih");
    }
    
}
