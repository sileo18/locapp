package com.beatsell.beat_sell.domain.CartaoCredito;

import com.beatsell.beat_sell.domain.Endereco.Endereco;
import com.beatsell.beat_sell.domain.Usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "CartaoCredito")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CartaoCredito {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "Numero", nullable = false, length = 16)
    private String numero;

    @Column(name = "CVV", nullable = false, length = 3)
    private String cvv;

    @Column(name = "Senha", nullable = false, length = 6)
    private String senha;

    @ManyToOne
    @JoinColumn(name = "Usuario_Id", nullable = false)
    private Usuario usuario;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
