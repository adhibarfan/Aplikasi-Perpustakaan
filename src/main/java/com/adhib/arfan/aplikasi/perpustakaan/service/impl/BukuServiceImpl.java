package com.adhib.arfan.aplikasi.perpustakaan.service.impl;

import com.adhib.arfan.aplikasi.perpustakaan.domain.Buku;
import com.adhib.arfan.aplikasi.perpustakaan.repository.BukuRepository;
import com.adhib.arfan.aplikasi.perpustakaan.service.BukuService;
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
 * @Time 10:07:53 PM
 * @Encoding UTF-8
 * @Project Aplikasi-Perpustakaan
 * @Package com.adhib.arfan.aplikasi.perpustakaan.service.impl
 *
 */
@Service
@Transactional(readOnly = true)
public class BukuServiceImpl implements BukuService {

    @Autowired
    private BukuRepository bukuRepository;

    @Transactional
    @Override
    public void save(Buku buku) {
        bukuRepository.save(buku);
    }

    @Transactional
    @Override
    public void update(Buku buku) {
        bukuRepository.save(buku);
    }

    @Transactional
    @Override
    public void delete(String idBuku) {
        bukuRepository.delete(idBuku);
    }

    @Override
    public Buku getBuku(String idBuku) {
        return bukuRepository.findOne(idBuku);
    }

    @Override
    public Page<Buku> getBukus(Pageable pageable) {
        return bukuRepository.findAll(pageable);
    }

}
