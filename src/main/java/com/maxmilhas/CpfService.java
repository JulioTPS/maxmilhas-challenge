package com.maxmilhas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CpfService {
    private final CpfRepository cpfRepository;

    @Autowired
    public CpfService(CpfRepository cpfRepository) {
        this.cpfRepository = cpfRepository;
    }

    List<Cpf> findAll(){
        return cpfRepository.findAll();
    };

    List<Cpf> findByCpfNumber(Integer cpfNumber){
        return cpfRepository.findByCpfNumber(cpfNumber);
    };

    // Cpf saveOrUpdateCpf(Cpf Cpf);

    Cpf save(Cpf cpf){

        return cpf;
    };
    
    // void deleteCpfById(String id);

}