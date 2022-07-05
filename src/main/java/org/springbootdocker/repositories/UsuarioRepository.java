package org.springbootdocker.repositories;

import java.util.Optional;

import org.springbootdocker.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

  Optional<Usuario> findById(@Param("id") Long id);
}
