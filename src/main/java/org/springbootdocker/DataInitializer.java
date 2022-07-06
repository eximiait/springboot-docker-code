package org.springbootdocker;

import java.util.Optional;

import org.springbootdocker.domain.Usuario;
import org.springbootdocker.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

  @Autowired private UsuarioRepository repository;

  @Override
  public void run(String... args) throws Exception {

    Optional<Usuario> user = repository.findById(1l);
    if (user.isEmpty()) {
      Usuario usuario = new Usuario("taller-kubernetes");
      repository.save(usuario);
    }
  }
}
