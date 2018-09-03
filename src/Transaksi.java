/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sekar Arum
 */
public class Transaksi extends Pembeli
{
   public int jumlahBuku;
   public int total;
   private int TotalSemua;
   
   public void setjumlahBuku(int jumlahBuku)
    {
        this.jumlahBuku = jumlahBuku;
    }
    public void setTipe(int total)
    {
        this.total=total;
    }
    
    public int getjumlahBuku ()
    {
        return jumlahBuku;
    }
    public void setTotal(int jmlBuku, int hargaBuku)
    {
        this.TotalSemua = jmlBuku * hargaBuku;
    }
    
    public int Totalharga()
    {
        return this.TotalSemua;
    }
}
