/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sekar Arum
 */
import java.io.*;
import static java.lang.Integer.parseInt;
public class Utama {
   public static void main (String [] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        //instance of class
        Pembeli pb = new Pembeli();
        Barang brg = new Barang();
        Transaksi tr = new Transaksi();
        //input
        System.out.println("==============TOKO BUKU===============");
        System.out.println("Kode Buku C++ = 001");
        System.out.println("Kode Buku C# = 010");
        System.out.println("Kode Buku Java = 100");
        System.out.println("");
        System.out.println("Masukkan kode buku : ");
        int kode_buku = parseInt (br.readLine());
        System.out.println("Masukkan jumlah buku : ");
        int jml_buku = parseInt (br.readLine());
        tr.setjumlahBuku(jml_buku);
        System.out.println("Masukkan nama pembeli : ");
        String nama_pembeli = br.readLine();
        System.out.println("Masukkan alamat pembeli : ");
        String almt_pmbeli = br.readLine();
        System.out.println("Masukkan no telp : ");
        int no_tlp = parseInt (br.readLine());
        brg.setkode(kode_buku);
        pb.setnamaPelanggan(nama_pembeli);
        pb.setalamat(almt_pmbeli);
        pb.setnoTelp(no_tlp);
        tr.setTotal(jml_buku,brg.hargaBuku);
        
         //output
        System.out.println("======================================");
        System.out.println("DATA TRANSAKSI ANDA");
        System.out.println("======================================");
        System.out.println("Nama Kasir = Sabilla Arum");
        System.out.println("Tanggal    = 31/08/2018");
        System.out.println("--------------------------------------");
        System.out.println("ID Buku        = "+brg.getkode());
        System.out.println("Judul          = "+brg.getnamaBuku());
        System.out.println("Harga          = "+brg.hargaBuku);
        System.out.println("Nama pembeli   = "+pb.getnamaPelanggan());
        System.out.println("Alamat         = "+pb.getalamat());
        System.out.println("No Telp        = "+pb.getnoTelp());
        System.out.println("Total Harga    = "+ tr.Totalharga());
        
        
        
    }
}
