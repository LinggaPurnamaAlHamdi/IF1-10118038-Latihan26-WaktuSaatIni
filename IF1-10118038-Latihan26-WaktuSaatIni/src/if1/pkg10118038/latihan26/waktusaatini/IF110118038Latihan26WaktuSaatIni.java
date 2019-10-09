/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan26.waktusaatini;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Waktu Saat Ini
 */
public class IF110118038Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateFormatted = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");
        String formattedDate = date.format(dateFormatted);
        System.out.println("Hari ini adalah hari : " + formattedDate);
    }
    
}
