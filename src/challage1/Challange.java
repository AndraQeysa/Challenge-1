package challage1;
import java.util.Scanner;
public class Challange {
    public static void main (String[] args){
        Scanner noir = new Scanner (System.in);
        double skortugas;
        double skorlaporan;
        double skorujian;
        
        System.out.println("---------------------Nilai & Rank---------------------");
        System.out.println("0  -  40   =  F");
        System.out.println("41 -  55   =  E");
        System.out.println("56 -  74   =  D");
        System.out.println("75 -  85   =  C");
        System.out.println("76 -  92   =  B");
        System.out.println("93 -  100  =  A");
                       
        System.out.println("------------------Masukan Nilai Tugas------------------");
        skortugas = noir.nextDouble();
        double nilaitugas = 30 * skortugas / 100;
        
        System.out.println("-----------------Masukan Nilai Laporan-----------------");
        skorlaporan = noir.nextDouble();
        double nilailaporan = 20 * skorlaporan / 100;
        
        System.out.println("------------------Masukan Nilai Ujian------------------");
        skorujian = noir.nextDouble();
        double nilaiujian = 50 * skorujian / 100;
        
        double nilai = nilaitugas + nilailaporan + nilaiujian;
        System.out.println("Nilai = " + nilai);
        
        if (nilai >= 0 && nilai <= 40){
            System.out.println ("Ranking Anda F");
            System.out.println ("Kamu Tidak Lulus, Tingkatkan Belajarmu");
        }else if (nilai >= 41 && nilai <= 55){
            System.out.println ("Ranking Anda E");
            System.out.println ("Kamu Tidak Lulus, Tingkatkan Belajarmu");
        }else if (nilai >= 56 && nilai <= 74){
            System.out.println ("Ranking Anda D");
            System.out.println ("Kamu Tidak Lulus, Tingkatkan Belajarmu");
        }else if (nilai >= 75 && nilai <= 85){
            System.out.println ("Ranking Anda C");
            System.out.println ("Kamu Lulus Dengan Nilai Cukup, Tingkatkan Prestasimu");
        }else if (nilai >= 86 && nilai <= 92){
            System.out.println ("Ranking Anda B");
            System.out.println ("Kamu Lulus Dengan Nilai Baik, Tingkatkan Prestasimu");
        }else if (nilai >= 93 && nilai <= 100){
            System.out.println ("Ranking Anda A");
            System.out.println ("Kamu Lulus Dengan Nilai Excellent, Pertahankan Prestasimu");
    }    
}
