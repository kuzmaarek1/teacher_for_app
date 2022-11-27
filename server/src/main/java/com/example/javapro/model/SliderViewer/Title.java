package com.example.javapro.model.SliderViewer;

import com.example.javapro.model.CodeViewer.Language;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "title")
public class Title {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "category")
    private String category;

    @ManyToOne
    @JoinColumn(name="subject")
    private Subject subject;

    @OneToMany(mappedBy = "id")
    private List<SliderViewer> sliderViewers;

    public Title() {
    }

    public Title(String category, Subject subject) {
        this.category = category;
        this.subject = subject;
    }

    public long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
