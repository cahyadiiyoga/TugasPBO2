package com.inheritance.pembayaran.gaji;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n========================================================");
        System.out.print("\n                 PERHITUNGAN GAJI GURU                  ");
        System.out.print("\n========================================================");
        System.out.print("\n Masukkan Pilihan (1 = PNS / 2 = Kontrak) : ");
        int jenis = input.nextInt();

        if (jenis == 1) {
            System.out.print(" Masukkan Nama : ");
            String nama = input.next();
            System.out.print(" Masukkan Golongan : ");
            int gol = input.nextInt();
            System.out.print(" Masukkan Lama Waktu Mengabdi (Tahun) : ");
            int th = input.nextInt();
            System.out.print("\n--------------------------------------------------------");
            System.out.print("\n Masukkan Pilihan (1 = Gaji Pokok / 2 = Gaji Keseluruhan) : ");
            System.out.print("\n Masukkan Pilihan : ");
            int pilihan = input.nextInt();
            System.out.print("\n--------------------------------------------------------");

            PNS p2 = new PNS();
            p2.isi(jenis, nama, gol, th);
            if (pilihan==1){
                p2.printGuru();
            }else if (pilihan==2){
                p2.printGuru("\n Berikut Gaji Guru PNS : ");
            }else {
                System.out.print("\n Pilihan salah, silakan mengulang menginputkan data");
                Main.menu();
            }

        } else if (jenis == 2) {
            System.out.print(" Masukkan Nama : ");
            String nama = input.next();
            System.out.print(" Masukkan Golongan : ");
            int gol = input.nextInt();
            System.out.print(" Masukkan Lama Waktu Mengabdi (Tahun) : ");
            int th = input.nextInt();

            System.out.print("\n--------------------------------------------------------");
            System.out.print("\n Masukkan Pilihan (1 = Gaji Pokok / 2 = Gaji Keseluruhan) : ");
            System.out.print("\n Masukkan Pilihan: ");
            int pilihan = input.nextInt();
            System.out.print("\n--------------------------------------------------------");

            Kontrak p1 = new Kontrak();
            p1.isi(jenis, nama, gol, th);
            if (pilihan==1){
                p1.printGuru();
            }else if (pilihan==2){
                p1.printGuru("\n Berikut Gaji Guru Kontrak : ");
            }else {
                System.out.print("\n Pilihan salah, silakan mengulang menginputkan data");
                Main.menu();
            }

        } else {
            Main.menu();
        }

        System.out.print("\n--------------------------------------------------------");
        System.out.print("\n Masukkan Pilihan (1 = Mengulangi Program / 2 = Keluar Program) : ");
        System.out.print("\n Masukkan Pilihan: ");
        int pil = input.nextInt();

        if (pil==1){
            Main.menu();
        }else {
            System.exit(0);
        }
    }
}