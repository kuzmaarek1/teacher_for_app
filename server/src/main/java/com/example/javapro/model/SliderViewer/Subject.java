package com.example.javapro.model.SliderViewer;

import com.example.javapro.model.CodeViewer.CodeTitle;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "category")
    private String category;

    @OneToMany(mappedBy = "id")
    private List<Title> title;

    public Subject() {
    }

    public Subject(String category) {
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
