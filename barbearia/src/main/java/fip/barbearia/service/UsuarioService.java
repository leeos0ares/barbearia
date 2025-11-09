package fip.barbearia.service;

import fip.barbearia.entity.Usuario;
import fip.barbearia.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository ur){
        repository=ur;
    }

    public List<Usuario> listarUsuarios(){
        return repository.findAll();
    }

    public Optional
}
