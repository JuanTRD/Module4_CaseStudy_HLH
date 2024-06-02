package com.hlh.hlhmodule4thuno.Service;

import com.hlh.hlhmodule4thuno.Model.Debtor;

import java.util.List;

public interface IDebtorService extends IGenerateService<Debtor> {
    List<Debtor> findByNameContaining(String name);
    List<Debtor> findByStatus(String status);
    List<Debtor> findByUserId(Long id);
}
