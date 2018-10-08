
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nama : Firman Ardhiansyah 
 *         Kelas : IF-2 (PB02)
 *         NIM : 10117056
 * Deskripsi Program : Menentukan nilai terbesar dan terkecil dari nilai-nilai
 * mahasiswa yang jumlah dan nilainya diinputkan oleh petugas dengan konsep OOP
 */
public class petugas {

    public String namaPetugas;
    DaftarNilai dafNilai = new DaftarNilai();
    Scanner scn = new Scanner(System.in);

    public void inputPetugas() {
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scn.next();
    }
    /*public void inputNilai() {
        int i = 0;
        for (int i=0; i<dafNilai.jumlahMhs; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" = ");
            dafNilai.nilaiMhs[i] = scn.nextInt();
        }
    }*/
}

