/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {

    //Metodo que retorna la lista de categorias
    public List<Categoria> getCategorias(boolean activos); // se tiene que poner en plural el nombre del "Get" porque es una lista 
    //A esto se le conoce como "firma del metodo" es como el contrato diciendo que eso se va a ofrecer

    // Se obtiene un Categoria, a partir del id de un categoria
    public Categoria getCategoria(Categoria categoria);  //Aqui se pone en SINGULAR, porque solo devuelve solo 1 uno
    //BAJA PUNTOS EN EXAMEN SI NO ESTAN EN PLURAL O EN SINGULAR, RESPECTIVAMENTE

    // SI id del categoria != VACIO, entonces CREAR un registro
    // SI id del categoria  = VACIO, entonces ACTUALIZA el registro
    public void save(Categoria categoria);

    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);

    //Metodo Ampliado
    public List<Categoria> getPorDescripicion (String descripcion);
    
}
