package com.usermicroservice.userms.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import lombok.AllArgsConstructor;  
import lombok.Getter;  
import lombok.NoArgsConstructor;  
import lombok.Setter;  
import lombok.ToString;  

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class User {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  
  private long user_id;
  

  private  String firstName;
  private  String lastName;
  private  String email;
  private  String street;
  private  String street2;
  private  String city;
  private  String state;
  private  int zip;
  private  String phone;
  private  String dob;
  private  String gender;
  private  int social;

}
