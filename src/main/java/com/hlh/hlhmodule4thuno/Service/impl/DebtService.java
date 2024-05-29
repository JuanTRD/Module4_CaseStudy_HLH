package com.hlh.hlhmodule4thuno.Service.impl;

import com.hlh.hlhmodule4thuno.Model.Debt;
import com.hlh.hlhmodule4thuno.Repository.IDebtRepository;
import com.hlh.hlhmodule4thuno.Service.IDebtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DebtService implements IDebtService {
    @Autowired
    private IDebtRepository debtRepository;
    @Override
    public List<Debt> findAll() {
        return debtRepository.findAll();
    }

    @Override
    public Debt findById(Long id) {
        return debtRepository.findById(id).get();
    }

    @Override
    public void save(Debt debt) {
        debtRepository.save(debt);
    }

    @Override
    public void remove(Long id) {
        Debt newDebt = debtRepository.findById(id).get();
        newDebt.setStatus("ĐÃ THANH TOÁN");
        debtRepository.save(newDebt);
    }

    @Override
    public List<Debt> findByDebtor_Id(Long id) {
        List<Debt> list = debtRepository.findByDebtor_Id(id);
        return list;
    }
}
