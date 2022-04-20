package com.inheritance.pembayaran.gaji;

public class Guru {
        int jenis;
        String nama;
        int gol;
        int tahun;

        public void isi (int jenis, String nama, int gol, int thn) {
            this.jenis = jenis;
            this.nama = nama;
            this.gol = gol;
            this.tahun = thn;
        }

        int hitungGajiPokok(){
            int gajiPokok;
            if (this.gol == 1) {
                gajiPokok = 1500000;
            } else if (this.gol == 2) {
                gajiPokok = 2000000;
            } else if (this.gol == 3) {
                gajiPokok = 2500000;
            }else {
                gajiPokok = 3000000;
            }
            return gajiPokok;
        }

        public void printGuru(){
            System.out.println("\n Nama Pegawai : " + this.nama);
            System.out.println(" Golongan       : " + this.gol);
            System.out.println(" Gaji Pokok     : Rp " + this.hitungGajiPokok());
        }
    }