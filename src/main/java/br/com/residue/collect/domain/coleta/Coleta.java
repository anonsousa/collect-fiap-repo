package br.com.residue.collect.domain.coleta;

import br.com.residue.collect.domain.caminhao.Caminhao;
import br.com.residue.collect.domain.caminhao.TiposResiduos;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "tbl_coleta")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Coleta {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idColeta;
    @Column(name = "bairro_coleta")
    private String bairroColeta;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipos_residuo")
    private TiposResiduos tipoResiduo;

    @Column(name = "volume_peso")
    private BigDecimal volumePeso;

    @Column(name = "id_caminhao")
    private UUID idCaminhao;

    @Enumerated(EnumType.STRING)
    private TiposStatus status;

    @Column(name = "informacoes_adicionais")
    private String informacoesAdicionais;


    public UUID getIdColeta() {
        return idColeta;
    }

    public void setIdColeta(UUID idColeta) {
        this.idColeta = idColeta;
    }

    public String getBairroColeta() {
        return bairroColeta;
    }

    public void setBairroColeta(String bairroColeta) {
        this.bairroColeta = bairroColeta;
    }

    public TiposResiduos getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo(TiposResiduos tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    public BigDecimal getVolumePeso() {
        return volumePeso;
    }

    public void setVolumePeso(BigDecimal volumePeso) {
        this.volumePeso = volumePeso;
    }

    public UUID getIdCaminhao() {
        return idCaminhao;
    }

    public void setIdCaminhao(UUID idCaminhao) {
        this.idCaminhao = idCaminhao;
    }

    public TiposStatus getStatus() {
        return status;
    }

    public void setStatus(TiposStatus status) {
        this.status = status;
    }

    public String getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

    public void setInformacoesAdicionais(String informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }
}
