package com.hlh.hlhmodule4thuno.Service;

import com.hlh.hlhmodule4thuno.Module.Debt;

import java.util.List;

public interface IDebtService extends IGenerateService<Debt> {
    List<Debt> findByDebtor_Id(Long id);
}
