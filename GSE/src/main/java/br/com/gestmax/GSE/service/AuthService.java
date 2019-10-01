package br.com.gestmax.GSE.service;

import br.com.gestmax.GSE.domain.Usuario;
import br.com.gestmax.GSE.exception.ObjectNotFoundException;
import br.com.gestmax.GSE.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AuthService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder pe;

    private Random rand = new Random();

    public void sendNewPassword(String email) {

        Usuario usuario = usuarioRepository.findDistinctByDsEmail(email);
        if (usuario == null) {
            throw new ObjectNotFoundException("Email não encontrado");
        }

        String newPass = newPassword();
        usuario.setSnUsuario(pe.encode(newPass));

        usuarioRepository.save(usuario);
        //emailService.sendNewPasswordEmail(usuario, newPass);
    }

    private String newPassword() {
        char[] vet = new char[10];
        for (int i = 0; i < 10; i++) {
            vet[i] = randomChar();
        }
        return new String(vet);
    }

    private char randomChar() {
        int opt = rand.nextInt(3);
        if (opt == 0) { // gera um digito
            return (char) (rand.nextInt(10) + 48);
        } else if (opt == 1) { // gera letra maiuscula
            return (char) (rand.nextInt(26) + 65);
        } else { // gera letra minuscula
            return (char) (rand.nextInt(26) + 97);
        }
    }
}
