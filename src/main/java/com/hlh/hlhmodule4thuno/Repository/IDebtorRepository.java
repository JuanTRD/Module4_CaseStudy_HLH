package com.hlh.hlhmodule4thuno.Repository;

import com.hlh.hlhmodule4thuno.Model.Debtor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDebtorRepository extends JpaRepository<Debtor,Long> {
    List<Debtor> findByNameContaining(String name);
    List<Debtor> findByStatus(String status);
    List<Debtor> findByUserId(Long id);
}
