package com.hlh.hlhmodule4thuno.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Debtor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cccd;
    private Integer age;
    private String phone;
    private String address;
    private String image;
    private String cccd;
    private String status = "ACTIVE";

    @OneToOne
    private User user;


}
