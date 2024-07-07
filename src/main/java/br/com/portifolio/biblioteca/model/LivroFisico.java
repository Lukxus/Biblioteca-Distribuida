package br.com.portifolio.biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class LivroFisico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExemplar;
    private String status;

    @ManyToOne
    @JoinColumn(name = "idLivro")
    private Livro livro;

    @ManyToOne
    @JoinColumn(name = "idBiblioteca")
    private Biblioteca biblioteca;

    @OneToMany(mappedBy = "livroFisico")
    private List<Emprestimo> emprestimos;
}
