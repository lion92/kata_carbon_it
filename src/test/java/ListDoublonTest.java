import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListDoublonTest {

    @Test
    public void should_return_empty_array_when_no_data_are_setting() {
        //Given
        ArrayList listNumbers= new ArrayList<>();
        //when
        int result = new CalculatorDoublon().calculDoublon(listNumbers);
        //Then
        assertEquals(0, result);

    }


}
