package com.epam.rd.autotasks.max;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        OptionalInt result;
        if (values == null || values.length == 0) {
            result = OptionalInt.empty();
        } else {
            int max = Arrays.stream(values).max().getAsInt();
            result = OptionalInt.of(max);
        }
        return result;
        }
}
