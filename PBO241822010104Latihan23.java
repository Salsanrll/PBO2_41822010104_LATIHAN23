/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2.pkg41822010104.latihan23;
import java.util.Scanner;
/**
 *
 * @author SALSA NURUL LAELI
 * Nama : Salsa Nurul Laeli
 * NIM  : 41822010104
 */
public class PBO241822010104Latihan23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Format Tugas PBO");
        Scanner input = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        
        System.out.print("Masukan Nama Petugas : ");
        String namaPetugas = input.nextLine();
        
        System.out.print("Masukan Banyaknya Nilai mahasiswa : ");
        int banyakMahasiswa = input.nextInt();
        
        int[] nilaiMahasiswa = new int[banyakMahasiswa];

        for (int i = 0; i < banyakMahasiswa; i++) {
            System.out.print("Masukan Nilai Mahasiswa Ke-" + (i + 1) + " = ");
            nilaiMahasiswa[i] = input.nextInt();
        }

        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < banyakMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " =" + nilaiMahasiswa[i]);
        }

        int nilaiTerbesar = nilaiMahasiswa[0];
        int nilaiTerkecil = nilaiMahasiswa[0];

        for (int i = 1; i < banyakMahasiswa; i++) {
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }

        System.out.println("\nNilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);

        System.out.println("\nPetugas : " + namaPetugas);
        System.out.println("\nDeveloped by: Salsa Nurul Laeli");
    }
        }
    