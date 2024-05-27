package com.hlh.hlhmodule4thuno.Repository;

import com.hlh.hlhmodule4thuno.Module.Debt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDebtRepository extends JpaRepository<Debt,Long> {
    List<Debt> findByDebtor_Id(Long id);

}
