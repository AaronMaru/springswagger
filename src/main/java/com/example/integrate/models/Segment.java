package com.example.integrate.models;


import com.fasterxml.jackson.annotation.JsonInclude;

public class Segment {

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean stepOver;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String abc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getStepOver() {
        return stepOver;
    }

    public void setStepOver(Boolean stepOver) {
        this.stepOver = stepOver;
    }

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }
}
