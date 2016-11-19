package com.adhib.arfan.aplikasi.perpustakaan.service.impl;

import com.adhib.arfan.aplikasi.perpustakaan.domain.Mahasiswa;
import com.adhib.arfan.aplikasi.perpustakaan.repository.MahasiswaRepository;
import com.adhib.arfan.aplikasi.perpustakaan.service.MahasiswaService;
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
 * @Time 10:08:12 PM
 * @Encoding UTF-8
 * @Project Aplikasi-Perpustakaan
 * @Package com.adhib.arfan.aplikasi.perpustakaan.service.impl
 *
 */
@Service
@Transactional(readOnly = true)
public class MahasiswaServiceImpl implements MahasiswaService {

    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    @Transactional
    @Override
    public void save(Mahasiswa mahasiswa) {
        mahasiswaRepository.save(mahasiswa);
    }

    @Transactional
    @Override
    public void update(Mahasiswa mahasiswa) {
        mahasiswaRepository.save(mahasiswa);
    }

    @Transactional
    @Override
    public void delete(String npm) {
        mahasiswaRepository.delete(npm);
    }

    @Override
    public Mahasiswa getMahasiswa(String npm) {
        return mahasiswaRepository.findOne(npm);
    }

    @Override
    public Page<Mahasiswa> getMahasiswas(Pageable pageable) {
        return mahasiswaRepository.findAll(pageable);
    }

}
