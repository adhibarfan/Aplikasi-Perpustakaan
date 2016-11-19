package com.adhib.arfan.aplikasi.perpustakaan.service;

import com.adhib.arfan.aplikasi.perpustakaan.domain.Mahasiswa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @Author Adhib Arfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Nov 16, 2016
 * @Time 10:07:06 PM
 * @Encoding UTF-8
 * @Project Aplikasi-Perpustakaan
 * @Package com.adhib.arfan.aplikasi.perpustakaan.service
 *
 */
public interface MahasiswaService {

    public void save(Mahasiswa mahasiswa);

    public void update(Mahasiswa mahasiswa);

    public void delete(String npm);

    public Mahasiswa getMahasiswa(String npm);

    public Page<Mahasiswa> getMahasiswas(Pageable pageable);

}
