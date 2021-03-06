package dev.lucas.produdoro.credencial.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Builder
// o mongo vai injetar o que precisa pra esse cara
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "Credencial")
public class Credencial {

    @MongoId(targetType = FieldType.STRING)
    @Getter
    private String usuario;

    private String senha;

    public Credencial(String usuario, String senha) {
        this.usuario = usuario;
        // por defaul a senha vai vir encripata
        this.senha = new BCryptPasswordEncoder().encode(senha);
    }

    public String getPassword() {
        return senha;
    }
}
