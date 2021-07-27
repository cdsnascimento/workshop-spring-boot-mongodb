package com.cdsnascimento.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable{
  
  private static final long serialVersionUID = 1L;

  private String tet;
  private Date date;

  private AuthorDTO author;

  public CommentDTO(){
  }

  public CommentDTO(String tet, Date date, AuthorDTO author) {
    this.tet = tet;
    this.date = date;
    this.author = author;
  }

  public String getTet() {
    return tet;
  }

  public void setTet(String tet) {
    this.tet = tet;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public AuthorDTO getAuthor() {
    return author;
  }

  public void setAuthor(AuthorDTO author) {
    this.author = author;
  }

  
}
