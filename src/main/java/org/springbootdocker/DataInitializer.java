package org.springbootdocker;

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

    Usuario usuario = new Usuario("taller-kubernetes");

    repository.save(usuario);
  }
}
