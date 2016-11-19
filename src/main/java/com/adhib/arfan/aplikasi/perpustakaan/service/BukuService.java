package com.adhib.arfan.aplikasi.perpustakaan.service;

import com.adhib.arfan.aplikasi.perpustakaan.domain.Buku;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @Author Adhib Arfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Nov 16, 2016
 * @Time 10:06:54 PM
 * @Encoding UTF-8
 * @Project Aplikasi-Perpustakaan
 * @Package com.adhib.arfan.aplikasi.perpustakaan.service
 *
 */
public interface BukuService {

    public void save(Buku buku);

    public void update(Buku buku);

    public void delete(String idBuku);

    public Buku getBuku(String idBuku);

    public Page<Buku> getBukus(Pageable pageable);

}
