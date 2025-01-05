package com.beatsell.beat_sell.domain.Email;

import com.beatsell.beat_sell.domain.Endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "Email")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Email {

    @Id
    @GeneratedValue

    private UUID id;

    @Column(name = "EnderecoEmail", nullable = false, unique = true)
    private String enderecoEmail;
}
