import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListDoublonTest {

    @Test
    public void should_return_0_when_no_data_are_setting() {
        //Given
        ArrayList listNumbers= new ArrayList<>();
        //when
        int result = new CalculatorDoublon().calculDoublon(listNumbers);
        //Then
        assertEquals(0, result);
    }

    @Test
    public void should_return_1_when_the_list_contaoins_only_1() {
        //Given
        ArrayList listNumbers= new ArrayList<>();
        listNumbers.add(1);
        //when
        int result = new CalculatorDoublon().calculDoublon(listNumbers);
        //Then
        assertEquals(1, result);
    }


}
