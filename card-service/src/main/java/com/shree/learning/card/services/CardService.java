package com.shree.learning.card.services;

import com.shree.learning.card.model.Card;
import org.springframework.stereotype.Service;

@Service
public interface CardService {

    public Card fetchCustomer(String phoneNumber);

    public void createCustomer(Card customer);

    public void updateCustomer(Card customer);

    public void deleteCustomer(String phoneNumber);

}
