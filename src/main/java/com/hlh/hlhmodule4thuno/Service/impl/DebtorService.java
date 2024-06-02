package com.hlh.hlhmodule4thuno.Service.impl;

import com.hlh.hlhmodule4thuno.Model.Debtor;
import com.hlh.hlhmodule4thuno.Repository.IDebtorRepository;
import com.hlh.hlhmodule4thuno.Service.IDebtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DebtorService implements IDebtorService {
    @Autowired
    private IDebtorRepository debtorRepository;
    @Override
    public List<Debtor> findAll() {
        return debtorRepository.findAll();
    }

    @Override
    public Debtor findById(Long id) {
        return debtorRepository.findById(id).get();
    }

    @Override
    public void save(Debtor debtor) {
        debtorRepository.save(debtor);
    }

    @Override
    public void remove(Long id) {
        debtorRepository.deleteById(id);
    }

    @Override
    public List<Debtor> findByNameContaining(String name) {
        return debtorRepository.findByNameContaining(name);
    }

    @Override
    public List<Debtor> findByStatus(String status) {
        return debtorRepository.findByStatus(status);
    }

    @Override
    public List<Debtor> findByUserId(Long id) {
        return debtorRepository.findByUserId(id);
    }
}
