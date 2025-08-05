package entities;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.ArrayList;
import java.util.List;

@Entity


public class Alunos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    public Alunos(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }



}
