/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;   //Se usa para sacar el set and get de forma implicita(se ve con el "navigator")>> Se necesita la dependendia en el POM de lombok

@Data //Se usa para sacar el set and get de forma implicita(se ve con el "navigator")>> Se necesita la dependendia en el POM de lombok
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    
    //Version de serializacion. Para que siempre use la misma version y no pueda leer de otra version.
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="id_categoria") //sirve para saber de que tabla se habla en sql aunque el nombre del PK se ponga diferente en Java
    private Long idCategoria; // Hibernate transforma en id_categoria
    private String descripcion ;
    private String rutaImagen;
    private boolean activo;

public Categoria(){}

public Categoria(String descripcion, String rutaImagen, boolean activo) {
    this.descripcion = descripcion;
    this.rutaImagen = rutaImagen;
    this.activo =activo;
}



}