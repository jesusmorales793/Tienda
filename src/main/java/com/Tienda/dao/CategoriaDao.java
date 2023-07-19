
package com.Tienda.dao;

import com.Tienda.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria,Long >{  //Se hace en una interfaz el JpaRepository porque asi es como se activa
    //Mas adelante vamos a tener metodos ampliados
    
    //DAO: Data Access Object
    
    List<Categoria> findByDescripcion (String descripcion);
    
}
