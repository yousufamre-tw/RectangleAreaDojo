import org.example.RectangleException;
import org.example.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {
    @Test
    public void shouldReturnAreaOfSquare() throws RectangleException {
        final double side = 5;

        Square square = new Square(side);

        double area = square.area();

        Assertions.assertEquals(25.0, area);
    }
    @Test
    public void shouldReturnPerimeterOfSquare() throws RectangleException {
        final double side = 5;
        final double expectedPerimeter = 20;

        Square square = new Square(side);

        double perimeter = square.perimeter();

        Assertions.assertEquals(expectedPerimeter, perimeter);
    }

    @Test
    public void shouldThrowExceptionIfSideIsNegative() {
        final double side = -2;

        Exception exception = Assertions.assertThrows(RectangleException.class, ()-> new Square(side));
        Assertions.assertEquals("Rectangle parameter should not be negative",exception.getMessage());
    }
}
