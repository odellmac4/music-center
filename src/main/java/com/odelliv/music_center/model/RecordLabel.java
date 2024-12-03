package com.odelliv.music_center.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class RecordLabel {

  @Id
  @GeneratedValue
  private Long id;

  private String name;
  private String genre;
  private String founded_year;
  private String headquarters;
  
  public Long getId() {
    return id;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getGenre() {
    return genre;
  }
  public void setGenre(String genre) {
    this.genre = genre;
  }
  public String getFounded_year() {
    return founded_year;
  }
  public void setFounded_year(String founded_year) {
    this.founded_year = founded_year;
  }
  public String getHeadquarters() {
    return headquarters;
  }
  public void setHeadquarters(String headquarters) {
    this.headquarters = headquarters;
  }

  
}
