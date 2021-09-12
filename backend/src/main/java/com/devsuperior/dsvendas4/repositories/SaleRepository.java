package com.devsuperior.dsvendas4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas4.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

//	@Query("SELECT new com.devsuperior.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
//			+ " FROM Sale As obj GROUP BY obj.seller")
//	List<SaleSumDTO> amountGroupedBySeller();
//
//	@Query("SELECT new com.devsuperior.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"
//			+ " FROM Sale As obj GROUP BY obj.seller")
//	List<SaleSuccessDTO> successGroupedBySeller();

}
