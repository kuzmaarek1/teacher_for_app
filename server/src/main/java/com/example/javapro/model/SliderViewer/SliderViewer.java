package com.example.javapro.model.SliderViewer;

import javax.persistence.*;

@Entity
@Table(name = "slider_view")
public class SliderViewer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "slider")
    private byte[] slider;

    @ManyToOne
    @JoinColumn(name="title")
    private Title title;

    public SliderViewer() {

    }

    public SliderViewer( Title title,byte[] slider) {
        super();
        this.slider = slider;
        this.title=title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte[] getSlider() {
        return slider;
    }

    public void setSlider(byte[] slide) {
        this.slider = slide;
    }
}