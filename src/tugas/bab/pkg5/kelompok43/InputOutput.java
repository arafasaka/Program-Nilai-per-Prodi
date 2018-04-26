/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.bab.pkg5.kelompok43;

import java.util.Scanner;

public class InputOutput {
    fungsi objek = new fungsi();
        public void jurusan(){
            int nilai1, nilai2, nilai3, nilai4, nilai5,i=0,j=20;
            double hasil;
            String nama;
    
            Scanner DataIn = new Scanner(System.in);        
            System.out.print("Masukkan Namamu : ");
            String mahasiswa = DataIn.next();
                        
            System.out.print ("Masukkan angka 1 - 3 prodi anda = ");
            int angka = DataIn.nextInt();
            System.out.println();
                switch(angka){
                    case(1):
                    System.out.println("Prodi Teknik Komputer");
                    System.out.print("Nilai Ujian Kalkulus       : ");
                    nilai1 = DataIn.nextInt();
             
                    System.out.print("Nilai Ujian Fisika         : ");
                    nilai2 = DataIn.nextInt();
             
                    System.out.print("Nilai Ujian Elektronika    : ");
                    nilai3 = DataIn.nextInt();
              
                    System.out.print("Nilai Ujian Sistem DIgital : ");
                    nilai4 = DataIn.nextInt();
              
                    System.out.print("Nilai Ujian Struktur Data  : ");
                    nilai5 = DataIn.nextInt();
             
                    hasil = (nilai1+nilai2+nilai3+nilai4+nilai5)/5;
                    objek.pembatasa();
                    System.out.println("Nilai Rata-Rata Ujian kaka "+mahasiswa+" " +hasil);break;
                    case(2):
                    System.out.println("Prodi Teknik Perkapalan");
                      

                    System.out.print("Nilai Ujian Teori Bangunan Kapal  : ");
                    nilai1 = DataIn.nextInt();
             
                    System.out.print("Nilai Ujian Termodinamika         : ");
                    nilai2 = DataIn.nextInt();
             
                    System.out.print("Nilai Ujian Konstruksi Kapal      : ");
                    nilai3 = DataIn.nextInt();
              
                    System.out.print("Nilai Ujian Mekanika Teknik       : ");
                    nilai4 = DataIn.nextInt();
              
                    System.out.print("Nilai Ujian Matematika Rekayasa   : ");
                    nilai5 = DataIn.nextInt();
             
                    hasil = (nilai1+nilai2+nilai3+nilai4+nilai5)/5;
                    objek.pembatasa();
                    System.out.println("Nilai Rata-Rata Ujian kaka "+mahasiswa+" " +hasil);break;
                    
                    case(3):
                    System.out.println("Teknik Perkapalan");
                      

                    System.out.print("Nilai Ujian Pumbking                       : ");
                    nilai1 = DataIn.nextInt();
             
                    System.out.print("Nilai Ujian Manajemen Persampahan          : ");
                    nilai2 = DataIn.nextInt();
             
                    System.out.print("Nilai Ujian Pengolahan Pencemaran Udara    : ");
                    nilai3 = DataIn.nextInt();
              
                    System.out.print("Nilai Ujian Ekonomi Lingkungan             : ");
                    nilai4 = DataIn.nextInt();
              
                    System.out.print("Nilai Ujian Spam                           : ");
                    nilai5 = DataIn.nextInt();
            
                    hasil = (nilai1+nilai2+nilai3+nilai4+nilai5)/5;
                    objek.pembatasa();
                    System.out.println("Nilai Rata-Rata Ujian kaka "+mahasiswa+" " +hasil);break;
                    default:System.out.println("angka tak bernilai 1 - 3");break;
        }   
             
       }
}
