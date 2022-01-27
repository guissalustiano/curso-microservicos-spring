package br.usp.ime.verao.backend;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "meme")
public class Meme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "keyword", nullable = false)
    private String keywords;

    @Column(name = "media", nullable = false)
    private String media;
}