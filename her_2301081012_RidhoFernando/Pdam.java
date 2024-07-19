/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package her_2301081012_RidhoFernando;

/**
 *
 * @author ACER
 */

// NAMA : RIDHO FERNANDO
// NIM  : 2301081012
// KELAS: TK1B

import java.util.Scanner;

public class Pdam {
    private String kodePembayaran;
    private String namaPelanggan;
    private String jenisPelanggan;
    private String tanggal;
    private int meterBulanIni;
    private int meterBulanLalu;
    private double totalBayar;

    // konstruktor
    public Pdam(String kodePembayaran, String namaPelanggan, String jenisPelanggan, String tanggal, int meterBulanIni, int meterBulanLalu) {
        this.kodePembayaran = kodePembayaran;
        this.namaPelanggan = namaPelanggan;
        this.jenisPelanggan = jenisPelanggan;
        this.tanggal = tanggal;
        this.meterBulanIni = meterBulanIni;
        this.meterBulanLalu = meterBulanLalu;
        hitungTotalBayar();
    }

    // getter dan setter
    public String getKodePembayaran() {
        return kodePembayaran;
    }

    public void setKodePembayaran(String kodePembayaran) {
        this.kodePembayaran = kodePembayaran;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getJenisPelanggan() {
        return jenisPelanggan;
    }

    public void setJenisPelanggan(String jenisPelanggan) {
        this.jenisPelanggan = jenisPelanggan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getMeterBulanIni() {
        return meterBulanIni;
    }

    public void setMeterBulanIni(int meterBulanIni) {
        this.meterBulanIni = meterBulanIni;
    }

    public int getMeterBulanLalu() {
        return meterBulanLalu;
    }

    public void setMeterBulanLalu(int meterBulanLalu) {
        this.meterBulanLalu = meterBulanLalu;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    // hitung total bayar
    private void hitungTotalBayar() {
        int meterPakai = meterBulanLalu - meterBulanIni;
        double biayaPerMeter = 0;

       switch (jenisPelanggan) {
            case "GOLD":
                if (meterPakai <= 10) {
                    biayaPerMeter = 5000;
                } else if (meterPakai <= 20) {
                    biayaPerMeter = 10000;
                } else {
                    biayaPerMeter = 20000;
                }
                break;
            case "SILVER":
                if (meterPakai <= 10) {
                    biayaPerMeter = 4000;
                } else if (meterPakai <= 20) {
                    biayaPerMeter = 8000;
                } else {
                    biayaPerMeter = 10000;
                }
                break;
            case "UMUM":
                if (meterPakai <= 10) {
                    biayaPerMeter = 2000;
                } else if (meterPakai <= 20) {
                    biayaPerMeter = 3000;
                } else {
                    biayaPerMeter = 5000;
                }
                break;
            default:
                System.out.println("Jenis pelanggan tidak valid");
        }

        totalBayar = meterPakai * biayaPerMeter;
    }

    // ini main 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Kode Pembayaran:");
        String kodePembayaran = scanner.nextLine();

        System.out.println("Masukkan Nama Pelanggan:");
        String namaPelanggan = scanner.nextLine();

        System.out.println("Masukkan Jenis Pelanggan (GOLD/SILVER/UMUM):");
        String jenisPelanggan = scanner.nextLine();

        System.out.println("Masukkan Tanggal:");
        String tanggal = scanner.nextLine();

        System.out.println("Masukkan Meteran Bulan Ini:");
        int meterBulanIni = scanner.nextInt();

        System.out.println("Masukkan Meteran Bulan Lalu:");
        int meterBulanLalu = scanner.nextInt();

        Pdam pdam = new Pdam(kodePembayaran, namaPelanggan, jenisPelanggan, tanggal, meterBulanIni, meterBulanLalu);

        System.out.println("\nDetail Pembayaran:");
        System.out.println("Kode Pembayaran: " + pdam.getKodePembayaran());
        System.out.println("Nama Pelanggan: " + pdam.getNamaPelanggan());
        System.out.println("Jenis Pelanggan: " + pdam.getJenisPelanggan());
        System.out.println("Tanggal: " + pdam.getTanggal());
        System.out.println("Meteran Bulan Ini: " + pdam.getMeterBulanIni());
        System.out.println("Meteran Bulan Lalu: " + pdam.getMeterBulanLalu());
        System.out.println("Total Bayar: Rp " + pdam.getTotalBayar());
    }
}