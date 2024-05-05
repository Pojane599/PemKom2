/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mf291
 */
import java.util.ArrayList;

// Interface untuk operasi dasar (tambah, hapus, tampilkan)
interface OperasiDasar<T> {
    void tambah(T item);
    void hapus(T item);
    void tampilkan();
}

// Kelas generik untuk menyimpan daftar barang
class DaftarBarang<T> implements OperasiDasar<T> {
    private ArrayList<T> daftar = new ArrayList<>();

    @Override
    public void tambah(T item) {
        daftar.add(item);
    }

    @Override
    public void hapus(T item) {
        daftar.remove(item);
    }

    @Override
    public void tampilkan() {
        for (T item : daftar) {
            System.out.println(item);
        }
    }
}
