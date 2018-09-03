/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sekar Arum
 */
public class Pembeli extends Barang
{
    public String namaPelanggan, alamat;
    public int noTelp;
        
    public void setnamaPelanggan(String namaPelanggan)
    {
        this.namaPelanggan=namaPelanggan;
    }
    public void setalamat(String alamat)
    {
        this.alamat=alamat;
    }
    public void setnoTelp(int noTelp)
    {
        this.noTelp=noTelp;   
    }
    
    public String getnamaPelanggan ()
    {
        return namaPelanggan;
    }
    public String getalamat ()
    {
        return alamat;
    }
    public int getnoTelp ()
    {
        return noTelp;
    }   
}
