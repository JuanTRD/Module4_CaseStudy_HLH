package com.hlh.hlhmodule4thuno.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Debt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private String comment;
    private String status = "NỢ ĐẦM ĐÌA";
    private Date date;
    @ManyToOne
    @JoinColumn(name ="debtor_id")
    private Debtor debtor;
}
