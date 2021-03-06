package com.ispeak.ispeak.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Subject {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String content;

    @OneToMany
    private Set<Question> questions;

    private boolean condition;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }
}
