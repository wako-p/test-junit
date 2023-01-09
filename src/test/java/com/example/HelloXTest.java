package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class HelloXTest {

    @RunWith(Theories.class)
    public static class ToString {

        public static class Param {
            String language;
            String expected;
    
            public Param(String language, String expected) {
                this.language = language;
                this.expected = expected;
            }
        }
    
        @DataPoints
        public static Param[] params = {
            new Param("JS", "Hello JS"),
            new Param("TS", "Hello TS"),
            new Param("C#", "Hello C#"),
        };

        @Theory
        public void Helloの後ろにコンストラクタで指定した言語のフォーマットの文字列に変換できる(Param param) {
            // given:
            HelloX helloX = new HelloX(param.language);
    
            // when:
            String actual = helloX.toString();
    
            // then:
            assertEquals(param.expected, actual);
        }
    }
}
