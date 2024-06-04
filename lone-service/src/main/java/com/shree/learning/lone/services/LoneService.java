package com.shree.learning.lone.services;

import com.shree.learning.lone.model.Lone;
import org.springframework.stereotype.Service;

@Service
public interface LoneService {

    public Lone fetchLone(String phoneNumber);

    public void createLone(Lone Lone);

    public void updateLone(Lone Lone);

    public void deleteLone(String phoneNumber);

}
