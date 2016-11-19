package com.adhib.arfan.aplikasi.perpustakaan.service;

import com.adhib.arfan.aplikasi.perpustakaan.domain.Peminjaman;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @Author Adhib Arfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Nov 16, 2016
 * @Time 10:07:17 PM
 * @Encoding UTF-8
 * @Project Aplikasi-Perpustakaan
 * @Package com.adhib.arfan.aplikasi.perpustakaan.service
 *
 */
public interface PeminjamanService {
    
    
    public void save(Peminjaman peminjaman);

    public void update(Peminjaman peminjaman);

    public void delete(String idPeminjaman);

    public Peminjaman getPeminjaman(String idPeminjaman);

    public Page<Peminjaman> getPeminjamans(Pageable pageable);

}
