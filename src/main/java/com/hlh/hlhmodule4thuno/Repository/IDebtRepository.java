package com.hlh.hlhmodule4thuno.Repository;

import com.hlh.hlhmodule4thuno.Model.Debt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IDebtRepository extends JpaRepository<Debt,Long> {
    List<Debt> findByDebtor_Id(Long id);

}
