package com.example.webapi.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class StudentModel {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String Username;
    @Column
    private String FullName;
    @Column
    private String Password;



}
