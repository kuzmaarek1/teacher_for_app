package com.example.javapro.model.CodeViewer;

import org.hibernate.mapping.Set;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "language_category")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "category")
    private String category;

    @OneToMany(mappedBy = "id")
    private List<CodeTitle> codeTitle;

    public Language() {
    }

    public Language(String category) {
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
