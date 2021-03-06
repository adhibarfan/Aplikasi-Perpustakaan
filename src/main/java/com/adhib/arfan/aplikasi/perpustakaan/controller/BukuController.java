package com.adhib.arfan.aplikasi.perpustakaan.controller;

import com.adhib.arfan.aplikasi.perpustakaan.domain.Buku;
import com.adhib.arfan.aplikasi.perpustakaan.service.BukuService;
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
 * @Time 10:33:50 PM
 * @Encoding UTF-8
 * @Project Aplikasi-Perpustakaan
 * @Package com.adhib.arfan.aplikasi.perpustakaan.controller
 *
 */
@RestController
@RequestMapping(value = "/api")
public class BukuController {

    @Autowired
    private BukuService bukuService;

    @CrossOrigin(origins = "*", methods = RequestMethod.GET, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @GetMapping(value = "/buku")
    public Page<Buku> getBukus(Pageable pageable) {
        return bukuService.getBukus(pageable);
    }

    @CrossOrigin(origins = "*", methods = RequestMethod.POST, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @PostMapping(value = "/buku")
    public Map<String, Object> saveBuku(@RequestBody Buku buku) {
        bukuService.save(buku);

        Map<String, Object> map = new HashMap<>();
        map.put("success", Boolean.TRUE);
        map.put("info", "data buku berhasil di simpan ");
        return map;
    }

    @CrossOrigin(origins = "*", methods = RequestMethod.PUT, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @PutMapping(value = "/buku")
    public Map<String, Object> updateBuku(@RequestBody Buku buku) {
        bukuService.update(buku);

        Map<String, Object> map = new HashMap<>();
        map.put("success", Boolean.TRUE);
        map.put("info", "data buku berhasil di update ");
        return map;
    }

    @CrossOrigin(origins = "*", methods = RequestMethod.DELETE, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @DeleteMapping(value = "/buku/{idBuku}")
    public Map<String, Object> deleteBuku(@PathVariable("idBuku") String idBuku) {
        bukuService.delete(idBuku);

        Map<String, Object> map = new HashMap<>();
        map.put("success", Boolean.TRUE);
        map.put("info", "data buku berhasil di hapus ");
        return map;
    }

    @CrossOrigin(origins = "*", methods = RequestMethod.GET, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @GetMapping(value = "/buku/{idBuku}")
    public Buku getBuku(@PathVariable("idBuku") String idBuku) {
        return bukuService.getBuku(idBuku);
    }

}
