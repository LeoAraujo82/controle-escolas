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
    private Integer id;
    private String nome;
    private double matricula;
    @OneToMany(mappdBy = "aluno", cascade = CascadeType.ALL)
    private List<CasdatroAlunos> cadastro = new ArrayList<>();

    public List<CadastroAlunos> getCadastro() {
        return cadastro;
    }

        public Alunos(Integer id, String nome, double matricula) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;


    }



}
