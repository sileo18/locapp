package com.beatsell.beat_sell.instrumental;

import com.beatsell.beat_sell.domain.produtor.Produtor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "Instrumental")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Instrumental {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private int BPM;
    private int preco;

    @ManyToOne
    @JoinColumn(name = "Id_Produtor")
    private Produtor produtor;
}
