package com.nnk.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnk.springboot.domain.CurvePoint;
import com.nnk.springboot.repositories.CurvePointRepository;

@Service
public class CurveService {
    @Autowired
    private CurvePointRepository curveRepository;

    public List<CurvePoint> findAll() {
        return curveRepository.findAll();
    }

    public CurvePoint save(CurvePoint curve) {
       return curveRepository.save(curve);
    }

    public CurvePoint findById(Integer id) {
        return curveRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid curve Id:" + id));
    }

    public void delete(Integer id) {
        curveRepository.deleteById(id);
    }
}
