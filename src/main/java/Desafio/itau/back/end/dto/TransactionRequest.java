package Desafio.itau.back.end.dto;
import java.time.OffsetDateTime;

import jakarta.validation.constraints.NotNull;

public class TransactionRequest {
    
    @NotNull
    private double valor;
    
    @NotNull
    private OffsetDateTime dataHora;

    public double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
