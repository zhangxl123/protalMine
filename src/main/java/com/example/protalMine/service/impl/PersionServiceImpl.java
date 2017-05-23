package com.example.protalMine.service.impl;

import com.example.protalMine.Repository.PerssionRepository;
import com.example.protalMine.entity.Persion;
import com.example.protalMine.service.Persionservice;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by somebody on 2017/5/19.
 */
@Service
public class PersionServiceImpl implements Persionservice {

    @Resource
    PerssionRepository persionRepository;


    @Override
    public void save(Persion p) {
        persionRepository.save(p);
    }

    @Override
    public Persion getPersion(Integer id) {
        return persionRepository.findOne(id);
    }
}
