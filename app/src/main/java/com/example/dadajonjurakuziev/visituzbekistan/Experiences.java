package com.example.dadajonjurakuziev.visituzbekistan;

public class Experiences {
    private int exp_id;
    private String exp_title, exp_desc, exp_full_desc, details;
    private int exp_image;

    public Experiences(int exp_id, String exp_title, String exp_desc, int exp_image, String exp_full_desc, String details) {
        this.exp_id = exp_id;
        this.exp_title = exp_title;
        this.exp_desc = exp_desc;
        this.exp_image = exp_image;
        this.exp_full_desc = exp_full_desc;
        this.details = details;
    }

    public int getExp_id() { return exp_id; }

    public String getExp_title() { return exp_title; }

    public String getExp_desc() { return exp_desc; }

    public int getExp_image() { return exp_image; }

    public String getExp_full_desc() { return exp_full_desc; }

    public String getDetails() { return details; }
}
