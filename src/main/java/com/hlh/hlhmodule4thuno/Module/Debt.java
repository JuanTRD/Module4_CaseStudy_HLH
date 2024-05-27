package com.hlh.hlhmodule4thuno.Module;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Debt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private String status = "NỢ ĐẦM ĐÌA";
    @ManyToOne
    @JoinColumn(name ="debtor_id")
    private Debtor debtor;
}
