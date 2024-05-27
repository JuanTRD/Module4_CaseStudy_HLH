package com.hlh.hlhmodule4thuno.Controller;

import com.hlh.hlhmodule4thuno.Module.Debt;
import com.hlh.hlhmodule4thuno.Module.Debtor;
import com.hlh.hlhmodule4thuno.Repository.IDebtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("/debtors")
public class DebtorController {
    @Autowired
    private IDebtorRepository debtorRepository;

    @GetMapping("")
    public ResponseEntity<List<Debtor>> getAll(){
List<Debtor> list = debtorRepository.findAll();
return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<String> addDebtor(@RequestBody Debtor debtor){
        debtorRepository.save(debtor);
        String message = "Added";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
