package com.INA219.INA219.models;

import jakarta.persistence.*;

@Entity
@Table(name = "data")
public class DataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "amperage")
    private Double amperage;
    @Column(name = "voltage")
    private Double voltage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmperage() {
        return amperage;
    }

    public void setAmperage(Double amperage) {
        this.amperage = amperage;
    }

    public Double getVoltage() {
        return voltage;
    }

    public void setVoltage(Double voltage) {
        this.voltage = voltage;
    }

    public DataModel(Long id, Double amperage, Double voltage) {
        this.id = id;
        this.amperage = amperage;
        this.voltage = voltage;
    }

    public DataModel() {
    }
}
