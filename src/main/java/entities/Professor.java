package entities;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Professor {

    @id
    @GeneratedValue((strategy = GeneretionType.IDENTITY))
    private Integer id;
    private String nome;
    private String disciplina;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.IDENTITY)
    private List<CadastroAluno> cadastroAlunos = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public

}
