/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ACER
 */
public class Mobil {
     long kapasistas;
    List<Hewan> muatan;

    public Mobil(long kapasistas, List<Hewan> muatan) {
        this.kapasistas = kapasistas;
        this.muatan = muatan;
    }

    public boolean tambahMuatan(Hewan hewan) {
        long sumMuatan = muatan.stream().mapToLong(Hewan::getWeight).sum() + hewan.weight;
        if (sumMuatan <= kapasistas) {
            muatan.add(hewan);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Hewan hewan = new Hewan(50);
        Mobil mobil = new Mobil(120, new ArrayList<Hewan>(){
            {
                add(new Hewan(30));
                add(new Hewan(40));
            }
        });

        System.out.println(mobil.tambahMuatan(hewan) ? "Berhasil ditambahkan" : "Gagal Ditambahkan");
    }
}