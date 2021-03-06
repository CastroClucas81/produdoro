package dev.lucas.produdoro.usuario.domain;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class UsuarioController implements UsuarioAPI {
    @Override
    public UsuarioCriadoResponse postNovoUsuario(UsuarioNovoRequest usuarioNovo) {
        log.info("[start] UsuarioControler - postNovoUsuario");
        return null;
    }
}
