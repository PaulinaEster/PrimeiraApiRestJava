package br.com.paulina.myapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.paulina.myapi.domain.Usuario;
import br.com.paulina.myapi.repositories.UsuarioRepository;
import br.com.paulina.myapi.services.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public Usuario findById(Integer id) {
		Optional<Usuario> obj = usuarioRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado "+ id + ", Tipo: " + Usuario.class.getName()));
	}


	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	public Usuario update(Integer id, Usuario obj) {
		Usuario newObj = findById(id);
		newObj.setNome(obj.getNome());
		newObj.setLogin(obj.getLogin());
		newObj.setSenha(obj.getSenha());
		return usuarioRepository.save(newObj);
	}


	public Usuario delete(Integer id) {
		Usuario obj = findById(id);
		usuarioRepository.deleteById(id);
		return obj;
	}


	public Usuario post(Usuario newUser) {
		newUser.setId(null);
		return usuarioRepository.save(newUser);
	}
	
}
