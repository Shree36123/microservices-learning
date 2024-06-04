package com.shree.learning.card.controller;

import com.shree.learning.card.dto.CardDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class CardController {
    @GetMapping("/fetch/card")
    public CardDto fetchCard(@PathVariable String phoneNumber) {
        return null;
    }

    @PostMapping("/create/card")
    public String createCard(@RequestBody CardDto customerDto) {
        return "Successfully added";
    }

    @PutMapping("/update/card")
    public String updateCard(@RequestBody CardDto customerDto) {
        return "Successfully updated";
    }

    @DeleteMapping
    public void deleteCard(String phoneNumber) {

    }


}
