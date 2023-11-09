package com.fullcycle.admin.catalogo.infrastructure.category;

import com.fullcycle.admin.catalogo.infrastructure.category.persitence.CategoryRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.FilterType;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@DataJpaTest
@ComponentScan(includeFilters = {
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*[MySQLGateway]")
})
public class CategoryMySqlGatewayTest {
    @Autowired
    private CategoryMySqlGateway categoryGateway;
    @Autowired
    private CategoryRepository categoryRepository;
    @Test
    public void testInjectedDependencies(){
        Assertions.assertNotNull(categoryGateway);
        Assertions.assertNotNull(categoryRepository);
    }

}
