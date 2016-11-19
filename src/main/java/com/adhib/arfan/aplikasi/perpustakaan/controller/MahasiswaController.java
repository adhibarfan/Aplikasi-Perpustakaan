package com.adhib.arfan.aplikasi.perpustakaan.controller;

import com.adhib.arfan.aplikasi.perpustakaan.domain.Mahasiswa;
import com.adhib.arfan.aplikasi.perpustakaan.service.MahasiswaService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @Author Adhib Arfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Nov 16, 2016
 * @Time 10:34:00 PM
 * @Encoding UTF-8
 * @Project Aplikasi-Perpustakaan
 * @Package com.adhib.arfan.aplikasi.perpustakaan.controller
 *
 */
@RestController
@RequestMapping(value = "/api")
public class MahasiswaController {

    @Autowired
    private MahasiswaService mahasiswaService;

    @CrossOrigin(origins = "*", methods = RequestMethod.GET, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @GetMapping(value = "/mahasiswa")
    public Page<Mahasiswa> getMahasiswas(Pageable pageable) {
        return mahasiswaService.getMahasiswas(pageable);
    }

    @CrossOrigin(origins = "*", methods = RequestMethod.POST, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @PostMapping(value = "/mahasiswa")
    public Map<String, Object> saveMahasiswa(@RequestBody Mahasiswa mahasiswa) {
        mahasiswaService.save(mahasiswa);

        Map<String, Object> map = new HashMap<>();
        map.put("success", Boolean.TRUE);
        map.put("info", "data mahasiswa berhasil di simpan ");
        return map;
    }

    @CrossOrigin(origins = "*", methods = RequestMethod.PUT, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @PutMapping(value = "/mahasiswa")
    public Map<String, Object> updateMahasiswa(@RequestBody Mahasiswa mahasiswa) {
        mahasiswaService.update(mahasiswa);

        Map<String, Object> map = new HashMap<>();
        map.put("success", Boolean.TRUE);
        map.put("info", "data mahasiswa berhasil di update ");
        return map;
    }

    @CrossOrigin(origins = "*", methods = RequestMethod.DELETE, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @DeleteMapping(value = "/mahasiswa/{npm}")
    public Map<String, Object> deleteMahasiswa(@PathVariable("npm") String idMahasiswa) {
        mahasiswaService.delete(idMahasiswa);

        Map<String, Object> map = new HashMap<>();
        map.put("success", Boolean.TRUE);
        map.put("info", "data mahasiswa berhasil di hapus ");
        return map;
    }

    @CrossOrigin(origins = "*", methods = RequestMethod.GET, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @GetMapping(value = "/mahasiswa/{npm}")
    public Mahasiswa getMahasiswa(@PathVariable("npm") String idMahasiswa) {
        return mahasiswaService.getMahasiswa(idMahasiswa);
    }
}
