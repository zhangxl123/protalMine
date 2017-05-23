package com.example.protalMine.service;

import com.example.protalMine.Repository.PerssionRepository;
import com.example.protalMine.entity.Persion;
import org.springframework.stereotype.Repository;

/**
 * Created by somebody on 2017/5/19.
 */
public interface Persionservice {
    void save(Persion p);
    Persion getPersion(Integer id);
}
