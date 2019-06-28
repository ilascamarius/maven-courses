package ro.itschool.curs6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTDDTest {

    @Test
    @DisplayName("WHEN adding two zeros THEN zero is returned")
    void addingZeroReturnsZero() {

        //SETUP
        CalculatorTDD calculator = new CalculatorTDD();

        //RUN
        int result = calculator.add(0, 0);

        //ASSERT
        assertTrue(result == 0);
    }


    @Test
    @DisplayName("WHEN adding two positive numbers THEN their sum is returned")
    void addingTwoPositiveReturnsSum() {
        //SETUP
        CalculatorTDD calculator = new CalculatorTDD();

        //RUN
        int result = calculator.add(4, 5);

        //ASSERT
        assertEquals(9,result);
    }

    @Test
    @DisplayName("WHEN dividing two positive numbers THEN divide is returned")

    void dividingTwoPositiveReturns(){
        //SETUP
        CalculatorTDD calculator=new CalculatorTDD();

        //RUN
        int result = calculator.div(6, 3);

        //ASSERT
        assertEquals(2, result);
    }

    @Test
    @DisplayName("WHEN dividing with 0 THEN return 0")

    void divisionByZero(){
        //SETUP

        CalculatorTDD calculator=new CalculatorTDD();

        //RUN
        int result =calculator.div(5,0);

        //ASSERT
        assertEquals(0, result);
    }


}


