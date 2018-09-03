/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sekar Arum
 */
public class Barang 
{
    public int kodeBuku;
    public String namaBuku;
    public int hargaBuku;
    
    protected void setkode(int kodeBuku)
    {
        //if(null != kodeBuku)
        switch (kodeBuku) 
        {
            case 001:
                this.kodeBuku = 001;
                this.hargaBuku = 100000;
                this.namaBuku = "C++";
                break;
            case 010:
                this.kodeBuku = 010;
                this.hargaBuku = 120000;
                this.namaBuku = "C#";
                break;
            case 100:
                this.kodeBuku = 100;
                this.hargaBuku = 150000;
                this.namaBuku = "Java";
                break;
            default:
                break;
        }
    }    
    public int getkode()
    {
        return this.kodeBuku;
    }
    public String getnamaBuku()
    {
        return this.namaBuku;
    }
    public int gethargaBuku()
    {
        return this.hargaBuku;
    }
}
