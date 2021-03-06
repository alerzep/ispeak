package com.ispeak.ispeak.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Question {

    @Id
    @GeneratedValue
    private long id;


    private String content;

    @OneToMany
    private Set<Answer> answers;

    private int points;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
