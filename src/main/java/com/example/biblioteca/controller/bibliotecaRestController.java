/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioteca.controller;

import com.example.biblioteca.model.Biblioteca;
import com.example.biblioteca.service.bibliotecaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author KAREN
 */
@RestController
@RequestMapping("/biblioteca")
public class bibliotecaRestController {
        @Autowired
    private bibliotecaService BibliotecaService;

    @GetMapping("/all")
    public List<Biblioteca> getBiblioteca() {
        return BibliotecaService.readAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Biblioteca> getBiblioteca(@PathVariable int id) {
        Biblioteca biblioteca= BibliotecaService.read(id);
        return ResponseEntity.ok(biblioteca);
    }

    @DeleteMapping("/{id}")
    public int deleteBiblioteca(@PathVariable int id) {        
        return BibliotecaService.delete(id);
    }
    @PostMapping("/add")
    public int addBiblioteca(@RequestBody Biblioteca biblioteca) {  
        System.out.println(biblioteca.getTitulo());
        return BibliotecaService.create(biblioteca);
    }
    @PutMapping("/edit")
    public int editBiblioteca(@RequestBody Biblioteca biblioteca) {  
        Biblioteca bib = new Biblioteca (biblioteca.getIdbiblioteca(), biblioteca.getNombre());
        System.out.println(biblioteca.getIdbiblioteca()+" , "+biblioteca.getTitulo());
        return BibliotecaService.update(biblioteca);
    }
}
    

