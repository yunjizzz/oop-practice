package com.oop.practice.course;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class CourseTest {

    @DisplayName("과목(코스)를 생성한다.")
    @Test
    void courseTest() {
        assertThatCode(() -> new Course("OOP",3,"A+"))
                .doesNotThrowAnyException();
    }
}
