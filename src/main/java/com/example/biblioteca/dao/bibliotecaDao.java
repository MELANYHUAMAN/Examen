/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.biblioteca.dao;

import com.example.biblioteca.model.Biblioteca;
import java.util.List;

/**
 *
 * @author KAREN
 */
public interface bibliotecaDao {
    int create(Biblioteca blb);
    int update(Biblioteca blb);
    int delete(int id);
    Biblioteca read(int id);
    List<Biblioteca> readAll();
}
