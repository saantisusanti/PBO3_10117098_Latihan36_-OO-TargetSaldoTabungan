/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan36_.oo.targetsaldotabungan;

/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk menampilkan perhitungan
 *                     lama tabungan sampai mencapai saldo target dengan 
 *                     menggunakan konsep OOP
 */
public class Tabungan {
    public int saldo;
    public int bunga;

    public double hitungBunga(int parSaldo, int parBunga){
        return parSaldo*parBunga/100;
    }

    public void hitungLamaSaldoTarget(int parSaldo, int parSaldoTarget){
        int i = 1;
        while (parSaldo <= parSaldoTarget) {
            hitungBunga(parSaldo,bunga);
            parSaldo += hitungBunga(parSaldo, bunga);

            String mataUang = String.format("Rp.%,3d", parSaldo)
                    .replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
            i++;
        }
    }
}
