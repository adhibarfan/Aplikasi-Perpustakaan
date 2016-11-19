package com.adhib.arfan.aplikasi.perpustakaan.repository;

import com.adhib.arfan.aplikasi.perpustakaan.domain.Peminjaman;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @Author Adhib Arfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Nov 16, 2016
 * @Time 10:00:30 PM
 * @Encoding UTF-8
 * @Project Aplikasi-Perpustakaan
 * @Package com.adhib.arfan.aplikasi.perpustakaan.repository
 *
 */
public interface PeminjamanRepository extends PagingAndSortingRepository<Peminjaman, String> {

}
