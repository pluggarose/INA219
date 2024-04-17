package com.INA219.INA219.models;

import jakarta.persistence.*;

@Entity
@Table(name = "data")
public class LossModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "send")
    private Double send;

    @Column(name = "receive")
    private Double receive;

    @Column(name = "answer")
    private Double answer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSend() {
        return send;
    }

    public void setSend(Double send) {
        this.send = send;
    }

    public Double getReceive() {
        return receive;
    }

    public void setReceive(Double receive) {
        this.receive = receive;
    }

    public Double getAnswer() {
        return answer;
    }

    public void setAnswer(Double answer) {
        this.answer = answer;
    }

    public LossModel(Long id, Double send, Double receive, Double answer) {
        this.id = id;
        this.send = send;
        this.receive = receive;
        this.answer = answer;
    }

    public LossModel() {
    }
}
