package com.wildcodeschool.recipesProject.repository;

import com.wildcodeschool.recipesProject.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {
}
