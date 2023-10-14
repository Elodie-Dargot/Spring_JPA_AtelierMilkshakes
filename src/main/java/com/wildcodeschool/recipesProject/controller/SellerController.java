package com.wildcodeschool.recipesProject.controller;

import com.wildcodeschool.recipesProject.entity.Seller;
import com.wildcodeschool.recipesProject.repository.SellerRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SellerController {
    private final SellerRepository sellerRepository;
    public SellerController(SellerRepository sellerRepositoryInjected){
        this.sellerRepository = sellerRepositoryInjected;
    }

    @GetMapping(path = "/sellers")
    public String getAll(Model model) {
        model.addAttribute("seller", sellerRepository.findAll());
        return "sellers";
    }

    @GetMapping("/seller")
    public String getSeller(Model model,
                            @RequestParam(required = false) Long id) {

        Seller seller = new Seller();
        if (id != null) {
            Optional<Seller> optionalSeller = sellerRepository.findById(id);
            if (optionalSeller.isPresent()) {
                seller = optionalSeller.get();
            }
        }
        model.addAttribute("seller", seller);

        return "seller";
    }

    @PostMapping("/seller")
    public String postSeller(@ModelAttribute Seller seller) {

        sellerRepository.save(seller);
        return "redirect:/sellers";
    }

    @GetMapping("/seller/delete")
    public String deleteSeller(@RequestParam Long id) {

        sellerRepository.deleteById(id);

        return "redirect:/sellers";
    }
}
