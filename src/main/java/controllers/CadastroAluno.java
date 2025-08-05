package controllers;

import
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cadastro_aluno")
public class CadastroAluno {

    private final CadastroAlunoRepository cadastroAlunoRepository;
    private final ProfessorRepository professorRepository;
    private final AlunoRepository  alunoRepository;

}

@PostMapping
public CadastroAlunoResponseDTO adicionar(
        @RequestBody CadastroRequest DTOrequest
)
