package guru.springframework.domain;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CategoryTest {
    
    Category category;

    @BeforeEach
    public void setUp(){
        category = new Category();
    }

    @Test
    void testGetDescription() {

    }

    @Test
    void getId() throws Exception{
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    void testGetRecipes() {

    }
}
