package com.hlh.hlhmodule4thuno.Controller;

import com.hlh.hlhmodule4thuno.Model.Debt;
import com.hlh.hlhmodule4thuno.Service.IDebtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("/debts")
public class AdminDebtController {
    @Autowired
    private IDebtService debtService;

    @GetMapping("")//lay toan bo khoan no
    public ResponseEntity<List<Debt>> getAllDebts() {
        List<Debt> list = debtService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping("")//them khoan no moi
    public ResponseEntity<String> addDebt(@RequestBody Debt debt){
        debtService.save(debt);
        String message = "Added";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @PutMapping("/{id}")//chinh sua thong tin khoan no
    public ResponseEntity<String> editDebt(@PathVariable Long id, @RequestBody Debt debt){
        debt.setId(id);
        debtService.save(debt);
        String message = "Edited";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @DeleteMapping("{id}")//cap nhat con khoan no da thanh toan
    public ResponseEntity<String> deleteDebt(@PathVariable Long id){
        debtService.remove(id);
        String message = "Deleted";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @GetMapping("/debtors/{id}")//lay ra khoan no cua con no theo id
    public ResponseEntity<List<Debt>> getDebtByDebtor(@PathVariable Long id){
        List<Debt> list = debtService.findByDebtor_Id(id);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

}
