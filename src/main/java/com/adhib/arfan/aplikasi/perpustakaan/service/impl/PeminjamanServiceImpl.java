package com.adhib.arfan.aplikasi.perpustakaan.service.impl;

import com.adhib.arfan.aplikasi.perpustakaan.domain.Peminjaman;
import com.adhib.arfan.aplikasi.perpustakaan.repository.PeminjamanRepository;
import com.adhib.arfan.aplikasi.perpustakaan.service.PeminjamanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @Author Adhib Arfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Nov 16, 2016
 * @Time 10:08:26 PM
 * @Encoding UTF-8
 * @Project Aplikasi-Perpustakaan
 * @Package com.adhib.arfan.aplikasi.perpustakaan.service.impl
 *
 */
@Service
@Transactional(readOnly = true)
public class PeminjamanServiceImpl implements PeminjamanService {

    @Autowired
    private PeminjamanRepository peminjamanRepository;

    @Override
    public void save(Peminjaman peminjaman) {
        peminjamanRepository.save(peminjaman);
    }

    @Override
    public void update(Peminjaman peminjaman) {
        peminjamanRepository.save(peminjaman);
    }

    @Override
    public void delete(String idPeminjaman) {
        peminjamanRepository.delete(idPeminjaman);
    }

    @Override
    public Peminjaman getPeminjaman(String idPeminjaman) {
        return peminjamanRepository.findOne(idPeminjaman);
    }

    @Override
    public Page<Peminjaman> getPeminjamans(Pageable pageable) {
        return peminjamanRepository.findAll(pageable);
    }

}
