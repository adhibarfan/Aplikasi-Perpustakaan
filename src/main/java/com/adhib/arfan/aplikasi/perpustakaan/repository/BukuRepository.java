package com.adhib.arfan.aplikasi.perpustakaan.repository;

import com.adhib.arfan.aplikasi.perpustakaan.domain.Buku;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @Author Adhib Arfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Nov 16, 2016
 * @Time 9:59:59 PM
 * @Encoding UTF-8
 * @Project Aplikasi-Perpustakaan
 * @Package com.adhib.arfan.aplikasi.perpustakaan.repository
 *
 */
public interface BukuRepository extends PagingAndSortingRepository<Buku, String> {

}
