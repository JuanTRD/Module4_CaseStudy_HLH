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
    private Integer age;
    private String phone;
    private String address;
    private String image;
    private String cccd;
    private String status = "ACTIVE";

    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user;


}
