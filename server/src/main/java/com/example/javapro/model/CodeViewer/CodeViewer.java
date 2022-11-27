package com.example.javapro.model.CodeViewer;

import javax.persistence.*;

@Entity
@Table(name = "code_view")
public class CodeViewer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="file")
    private String file;

    @Column(name = "code", length = 2000000)
    private String code;

    @ManyToOne
    @JoinColumn(name="code_title")
    private CodeTitle codeTitle;

    public CodeViewer() {

    }

    public CodeViewer(CodeTitle codeTitle, String file,String code) {
        super();
        this.file = file;
        this.code = code;
        this.codeTitle = codeTitle;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getFile() { return file; }
    public void setFile(String file) { this.file = file; }
}
