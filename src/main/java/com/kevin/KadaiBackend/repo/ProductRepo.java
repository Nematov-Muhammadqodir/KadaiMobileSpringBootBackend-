package com.kevin.KadaiBackend.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.kevin.KadaiBackend.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    @Query("""
                SELECT p FROM Product p
                WHERE
                    LOWER(p.productName) LIKE LOWER(CONCAT('%', :keyword, '%'))
                    OR LOWER(p.productDescription) LIKE LOWER(CONCAT('%', :keyword, '%'))
                    OR LOWER(p.productCategory) LIKE LOWER(CONCAT('%', :keyword, '%'))
                    OR LOWER(p.imageName) LIKE LOWER(CONCAT('%', :keyword, '%'))
                    OR LOWER(p.imageType) LIKE LOWER(CONCAT('%', :keyword, '%'))
            """)
    List<Product> searchByKeyword(@Param("keyword") String keyword);
}
