
package com.Tienda.dao;

import com.Tienda.domain.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    
    Usuario findByUsername(String username);   /*Se va a usar mas adelante para poder traer el usuario con todo y sus ROLES */
    
    
}
