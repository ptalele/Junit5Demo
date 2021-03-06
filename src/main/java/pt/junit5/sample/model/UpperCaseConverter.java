package pt.junit5.sample.model;


import org.springframework.stereotype.Component;

@Component
public class UpperCaseConverter{
    public String convert(String str) {
        if(str == null){
            throw new IllegalArgumentException("str should not be null");
        }
        return str.toUpperCase();
    }
}
