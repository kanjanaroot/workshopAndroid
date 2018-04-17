package workshop.testing;

import org.junit.Test;

import java.io.InputStream;

import workshop.testing.data.model.Recipe;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class RecipeTest {
    @Test
    public void water(){
        //Arrange
        InputStream stream
                =RecipeTest.class.getResourceAsStream("/recipes/water.txt");

        //Act
        Recipe recipe = Recipe.readFromStream(stream);

        //Assert
        assertNotNull(recipe);
        assertEquals("water",recipe.id);
        assertEquals("Water",recipe.title);
        assertEquals("Put glass under tap. Open tap. Close tap. Drink.",recipe.description);
    }
}
