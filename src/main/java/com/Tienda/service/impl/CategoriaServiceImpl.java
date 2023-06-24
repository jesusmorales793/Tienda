/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.service.impl;

import com.Tienda.dao.CategoriaDao;
import com.Tienda.domain.Categoria;
import com.Tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//Esta es la parte de la implementacion (Es la parte logica de la solicitud de lo que busca el cx desde la BD)
@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired    //crea la cantidad de objetos que necesite sin tener que usar el =new CategoriaDao...
    private CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {
        List<Categoria> lista = categoriaDao.findAll();

        if (activos) {
            //Se usa para ELIMINAR las CATEGORIAS que sean ACTIVO=FALSE
            lista.removeIf(x -> !x.isActivo());
        }

        return lista;
    }

    //PASA MUCHO EN EL EXAMEN: Para que se pueda comunicar con la interface de "CategoriaService" se necesita el @Service 
    //SI NO VA A BAJAR PunToS
    @Override
    @Transactional(readOnly = true)
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);
    }

}
