import org.bootcamp.Rectangle;
import org.bootcamp.RectangleException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTests {
    @Test
    public void shouldCalculateAreaSuccessfullyWithValidInputs() throws RectangleException{
        final double length = 5;
        final double breadth = 2;

        Rectangle rectangle = new Rectangle(length, breadth);

        double area = rectangle.area();

        Assertions.assertEquals(10.0, area);
    }


    @Test
    public void shouldThrowExceptionIfLengthIsNegative() {
        final double length = -1;
        final double breadth = 2;

        Exception exception = Assertions.assertThrows(RectangleException.class, ()-> new Rectangle(length, breadth));
        Assertions.assertEquals("Rectangle parameter should not be negative",exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionIfBreadthIsNegative() {
        final double length = 1;
        final double breadth = -2;

        Exception exception = Assertions.assertThrows(RectangleException.class, ()-> new Rectangle(length, breadth));
        Assertions.assertEquals("Rectangle parameter should not be negative",exception.getMessage());
    }

    @Test
    public void shouldReturnPerimeterOfRectangle() throws RectangleException {
        final double length = 5;
        final double breadth = 5;
        final double expectedPerimeter = 20;
        Rectangle rectangle = new Rectangle(length, breadth);

        double perimeter = rectangle.perimeter();

        Assertions.assertEquals(expectedPerimeter, perimeter);
    }

}
