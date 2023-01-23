package com.sparta.ec.stringmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MoreStringLabTests {
    @ParameterizedTest
    @CsvSource({"  Cathy, 10, CATHY0123456789",
            " ,4 , 0123",
            " Piano  , 12, PIANO01234567891011"
    })
    public void GivenAString_ManipulateString_ReturnsATransformedString(String original, int num, String expected)
    {
        var result = MoreStringsLab.manipulateString(original, num);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"5, Main Street, Stone, ST6 2RQ, 5 Main Street Stone ST6 2RQ.",
            "27, Town Road, Hull, H12 8AA, 27 Town Road Hull H12 8AA."})
    public void Address_GivenItsComponents_ReturnsAFormattedAddressString
            (int number, String street, String city, String postcode, String expAddress)
    {
        var result = MoreStringsLab.address(number, street, city, postcode);
        Assertions.assertEquals(expAddress, result);
    }

    @ParameterizedTest
    @CsvSource({"33, 40, You got 33 out of 40: 82.5%",
            "18, 65, You got 18 out of 65: 27.7%"
    })
    public void GivenATestScore_Scorer_ReturnsAFormattedString(int score, int outOf, String expString)
    {
        var result = MoreStringsLab.scorer(score, outOf);
        Assertions.assertEquals(expString, result);
    }
}

