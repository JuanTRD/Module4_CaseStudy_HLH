package com.hlh.hlhmodule4thuno.Module;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Debtor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String status = "ACTIVE";

}
