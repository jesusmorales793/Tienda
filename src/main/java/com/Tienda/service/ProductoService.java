/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda.service;

import com.Tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductoService {

    //Metodo que retorna la lista de productos
    public List<Producto> getProductos(boolean activos); // se tiene que poner en plural el nombre del "Get" porque es una lista 
    //A esto se le conoce como "firma del metodo" es como el contrato diciendo que eso se va a ofrecer

    // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);  //Aqui se pone en SINGULAR, porque solo devuelve solo 1 uno
    //BAJA PUNTOS EN EXAMEN SI NO ESTAN EN PLURAL O EN SINGULAR, RESPECTIVAMENTE

    // SI id del producto != VACIO, entonces CREAR un registro
    // SI id del producto  = VACIO, entonces ACTUALIZA el registro
    public void save(Producto producto);

    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);

    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    //Ejemplo de método utilizando Consultas con JPQL
    @Query(value = "SELECT a FROM Producto a where a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.descripcion ASC")
    public List<Producto> metodoJPQL(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);

    //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);

}
