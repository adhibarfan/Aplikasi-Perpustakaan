package com.adhib.arfan.aplikasi.perpustakaan.controller;

import com.adhib.arfan.aplikasi.perpustakaan.domain.Peminjaman;
import com.adhib.arfan.aplikasi.perpustakaan.service.PeminjamanService;
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
 * @Time 10:34:11 PM
 * @Encoding UTF-8
 * @Project Aplikasi-Perpustakaan
 * @Package com.adhib.arfan.aplikasi.perpustakaan.controller
 *
 */
@RestController
@RequestMapping(value = "/api")
public class PeminjamanController {
    @Autowired
    private PeminjamanService peminjamanService;

    @CrossOrigin(origins = "*", methods = RequestMethod.GET, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @GetMapping(value = "/peminjaman")
    public Page<Peminjaman> getPeminjamans(Pageable pageable) {
        return peminjamanService.getPeminjamans(pageable);
    }

    @CrossOrigin(origins = "*", methods = RequestMethod.POST, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @PostMapping(value = "/peminjaman")
    public Map<String, Object> savePeminjaman(@RequestBody Peminjaman peminjaman) {
        peminjamanService.save(peminjaman);

        Map<String, Object> map = new HashMap<>();
        map.put("success", Boolean.TRUE);
        map.put("info", "data peminjaman berhasil di simpan ");
        return map;
    }

    @CrossOrigin(origins = "*", methods = RequestMethod.PUT, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @PutMapping(value = "/peminjaman")
    public Map<String, Object> updatePeminjaman(@RequestBody Peminjaman peminjaman) {
        peminjamanService.update(peminjaman);

        Map<String, Object> map = new HashMap<>();
        map.put("success", Boolean.TRUE);
        map.put("info", "data peminjaman berhasil di update ");
        return map;
    }

    @CrossOrigin(origins = "*", methods = RequestMethod.DELETE, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @DeleteMapping(value = "/peminjaman/{idPeminjaman}")
    public Map<String, Object> deletePeminjaman(@PathVariable("idPeminjaman") String idPeminjaman) {
        peminjamanService.delete(idPeminjaman);

        Map<String, Object> map = new HashMap<>();
        map.put("success", Boolean.TRUE);
        map.put("info", "data peminjaman berhasil di hapus ");
        return map;
    }

    @CrossOrigin(origins = "*", methods = RequestMethod.GET, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @GetMapping(value = "/peminjaman/{idPeminjaman}")
    public Peminjaman getPeminjaman(@PathVariable("idPeminjaman") String idPeminjaman) {
        return peminjamanService.getPeminjaman(idPeminjaman);
    }
}
