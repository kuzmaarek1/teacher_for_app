package com.example.javapro.model.CodeViewer;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "code_title")
public class CodeTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "category")
    private String category;

    @ManyToOne
    @JoinColumn(name="language_category")
    private Language language;

    @OneToMany(mappedBy = "id")
    private List<CodeViewer> codeviewer;

    public CodeTitle() {
    }

    public CodeTitle(String category, Language language) {
        this.category = category;
        this.language = language;
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

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}

