package dev.lucas.produdoro.tarefa.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "Tarefa")
public class Tarefa {
    @Id
    private UUID idTarefa;

    @Indexed
    private UUID idUsuario;

    @Indexed
    private UUID idArea;

    private String nome;
    private String descricao;
    private StatusTarefa status = StatusTarefa.A_fAZER;
}
