package dev.lucas.produdoro.pomodoro.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Builder
// o mongo vai injetar o que precisa pra esse cara
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "ConfiguracaoPadraoPomodoro")
@Getter
public class ConfiguracaoPadrao {
    private static final String CODIGO_DEFAULT = "DEFAULT";

    @Builder.Default
    @MongoId(targetType = FieldType.STRING)
    private String codigo = CODIGO_DEFAULT;

    private Integer tempoMinutosFoco;
    private Integer tempoMinutosPausaCurta;
    private Integer tempoMinutosPausaLonga;
    private Integer repeticoesParaPausaLonga;
}
