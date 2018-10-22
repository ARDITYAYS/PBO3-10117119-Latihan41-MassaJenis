/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan41massajenis;

import java.util.Scanner;

/**
 *
 * @author Yogaputra
 * Nama : Arditya Yogaputra S
 * NIM : 10117119
 * Kelas : PBO 3
 * Deskripsi Program : Program ini dapat menghitung volume dan massa jenis
 */
public class PBO310117119Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sca = new Scanner(System.in);
        Kubus kbs = new Kubus();

        System.out.println("========Massa Jenis Kubus========");
        System.out.print("Sisi : ");
        kbs.setSisi(sca.nextInt());
        System.out.print("Massa : ");
        kbs.setMassa(sca.nextInt());

        System.out.println("\n" + "========Hasil Perhitungan========");
        System.out.println("Volume : " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : "
                + kbs.hitungMassaJenis(kbs.getMassa(),
                        kbs.hitungVolume(kbs.getSisi())));
    }

}
