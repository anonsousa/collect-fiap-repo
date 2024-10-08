package br.com.residue.collect.domain.caminhao;

import br.com.residue.collect.domain.motorista.Motorista;

import java.math.BigDecimal;
import java.util.UUID;

public record CaminhaoMostrarDto(

        UUID idCaminhao,
        Motorista motorista,
        String placa,
        String modelo,
        String renavam,
        BigDecimal capacidade

) {
    public CaminhaoMostrarDto(Caminhao caminhao){
        this(
                caminhao.getIdCaminhao(),
                caminhao.getMotorista(),
                caminhao.getPlaca(),
                caminhao.getModelo(),
                caminhao.getRenavam(),
                caminhao.getCapacidade()
        );
    }
}
