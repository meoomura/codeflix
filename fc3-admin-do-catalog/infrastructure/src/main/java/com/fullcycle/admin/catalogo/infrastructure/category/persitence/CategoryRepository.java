package com.fullcycle.admin.catalogo.infrastructure.category.persitence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryJpaEntity, String> {

}
