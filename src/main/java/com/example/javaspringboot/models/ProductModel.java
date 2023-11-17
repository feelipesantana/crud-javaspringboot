package com.example.javaspringboot.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_PRODUCTS")

public class ProductModel implements Serializable{
  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO )
  private UUID idProduct;
  private String name;
  private BigDecimal value;

  public void getIdProduct(UUID idProduct){
    this.idProduct = idProduct;
  }
  public void setIdProduct(UUID idProduct){
    this.idProduct = idProduct;
  }
  
  public String getName(){
    return name ;
  }
  public void setName(String name){
    this.name = name;
  }

  public BigDecimal getValue(){
    return value ;
  }
  public void setValue(BigDecimal value){
    this.value = value;
  }

 

  
}