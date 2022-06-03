package com.exercise.trollmarket.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table
public class TesRemoteModel {

    @Id
    private String name;
    private String description;
    private String price;
    private String image;

}

