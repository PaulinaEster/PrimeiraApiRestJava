package br.com.paulina.myapi;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.paulina.myapi.domain.Usuario;
import br.com.paulina.myapi.repositories.UsuarioRepository;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Paula", "paula", "1234");
		Usuario u2 = new Usuario(null, "Paulina", "paulina", "1234");
		
		usuarioRepository.saveAll(List.of(u1, u2));
	}

}
