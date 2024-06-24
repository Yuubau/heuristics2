import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAssiettePetitDessertNormalSansCafe() {
        App app = new App();
        int result = app.Compute(new Order("assiette", "name", "boisson", "petit", "dessert", "normal", false));
        assertEquals(19, result);
    }

    @Test
    public void testAssietteMoyenDessertNormalAvecCafe() {
        App app = new App();
        int result = app.Compute(new Order("assiette", "name", "boisson", "moyen", "dessert", "normal", true));
        assertEquals(18, result);  
    }

    @Test
    public void testAssietteGrandDessertSpecialSansCafe() {
        App app = new App();
        int result = app.Compute(new Order("assiette", "name", "boisson", "grand", "dessert", "special", false));
        assertEquals(21, result);  
    }

    @Test
    public void testSandwichPetitDessertNormalSansCafe() {
        App app = new App();
        int result = app.Compute(new Order("sandwich", "name", "boisson", "petit", "dessert", "normal", false));
        assertEquals(14, result);
    }

    @Test
    public void testSandwichMoyenDessertNormalSansCafe() {
        App app = new App();
        int result = app.Compute(new Order("sandwich", "name", "boisson", "moyen", "dessert", "normal", false));
        assertEquals(13, result);  
    }

    @Test
    public void testSandwichGrandDessertSpecialSansCafe() {
        App app = new App();
        int result = app.Compute(new Order("sandwich", "name", "boisson", "grand", "dessert", "special", false));
        assertEquals(16, result);  
    }

    @Test
    public void testInvalidInput() {
        App app = new App();
        int result = app.Compute(new Order("", "", "boisson", "petit", "dessert", "normal", false));
        assertEquals(-1, result);
    }

    @Test
    public void testAssietteGrandDessertNormalSansCafe() {
        App app = new App();
        int result = app.Compute(new Order("assiette", "name", "boisson", "grand", "dessert", "normal", false));
        assertEquals(21, result);
    }

    @Test
    public void testAssiettePetitDessertNormalAvecCafe() {
        App app = new App();
        int result = app.Compute(new Order("assiette", "name", "boisson", "petit", "dessert", "normal", true));
        assertEquals(20, result);
    }

    @Test
    public void testAssietteGrandDessertNormalAvecCafe() {
        App app = new App();
        int result = app.Compute(new Order("assiette", "name", "boisson", "grand", "dessert", "normal", true));
        assertEquals(22, result);
    }

    @Test
    public void testSandwichPetitDessertSpecialAvecCafe() {
        App app = new App();
        int result = app.Compute(new Order("sandwich", "name", "boisson", "petit", "dessert", "special", true));
        assertEquals(17, result);
    }

    @Test
    public void testSandwichGrandDessertNormalAvecCafe() {
        App app = new App();
        int result = app.Compute(new Order("sandwich", "name", "boisson", "grand", "dessert", "normal", true));
        assertEquals(17, result); 
    }

    @Test
    public void testAssietteMoyenDessertSpecialAvecCafe() {
        App app = new App();
        int result = app.Compute(new Order("assiette", "name", "boisson", "moyen", "dessert", "special", true));
        assertEquals(23, result); 
    }

    @Test
    public void testSandwichMoyenDessertSpecialAvecCafe() {
        App app = new App();
        int result = app.Compute(new Order("sandwich", "name", "boisson", "moyen", "dessert", "special", true));
        assertEquals(18, result); 
    }

    @Test
    public void testSandwichGrandDessertSpecialAvecCafe() {
        App app = new App();
        int result = app.Compute(new Order("sandwich", "name", "boisson", "grand", "dessert", "special", true));
        assertEquals(17, result); 
    }

    @Test
    public void testAssiettePetitDessertSpecialAvecCafe() {
        App app = new App();
        int result = app.Compute(new Order("assiette", "name", "boisson", "petit", "dessert", "special", true));
        assertEquals(22, result); 
    }


}