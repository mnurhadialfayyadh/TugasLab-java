package edu.university.main;

import edu.university.model.Mahasiswa;

public class MainApp {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa("001", "Andi", 3.7);
        Mahasiswa m2 = new Mahasiswa("002", "Budi", 3.2);
        Mahasiswa m3 = new Mahasiswa("003", "Citra", 2.4);

        Mahasiswa[] daftar = { m1, m2, m3 };

        for (Mahasiswa m : daftar) {
            System.out.println("NIM   : " + m.getNim());
            System.out.println("Nama  : " + m.getNama());
            System.out.println("IPK   : " + m.getIpk());
            System.out.println("Kategori : " + m.getKategoriIPK());
            System.out.println("----------------------");
        }
    }
}