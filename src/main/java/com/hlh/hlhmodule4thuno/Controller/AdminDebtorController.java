package com.hlh.hlhmodule4thuno.Controller;

import com.hlh.hlhmodule4thuno.Model.Debtor;
import com.hlh.hlhmodule4thuno.Repository.IDebtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("debtors")
public class AdminDebtorController {
    @Autowired
    private IDebtorRepository debtorRepository;

    @GetMapping("")//lay ra thong tin toan bo con no
    public ResponseEntity<List<Debtor>> getAll(){
List<Debtor> list = debtorRepository.findAll();
return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping("")//chinh sua thong tin con no
    public ResponseEntity<String> addDebtor(@RequestBody Debtor debtor){
        debtorRepository.save(debtor);
        String message = "Added";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @GetMapping("main")//lay ra cac con no dang active
    public ResponseEntity<List<Debtor>> getAllByStatus(){
        String status = "ACTIVE";
        List<Debtor> list = debtorRepository.findByStatus(status);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<Debtor> getDebtorById(@PathVariable Long id){
        Debtor debtor = debtorRepository.findById(id).get();
        return new ResponseEntity<>(debtor, HttpStatus.OK);
    }
}
