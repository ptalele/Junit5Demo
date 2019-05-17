package pt.junit5.sample.extensions.spring;


import pt.junit5.sample.model.UpperCaseConverter;
import pt.junit5.sample.spring.Bean1;
import pt.junit5.sample.spring.Bean2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class SpringTest {

    @Autowired
    private Bean1 fieldInjectedBean;
    private Bean2 constructorInjectedBean;

    public SpringTest(@Autowired Bean2 bean2) {
        this.constructorInjectedBean = bean2;
    }

    @Test
    void methodLevelInjectedBeanShouldExist(@Autowired UpperCaseConverter methodLevelInjectedBean) {
        assertNotNull(methodLevelInjectedBean);
    }

    @Test
    void fieldLevelInjectedBeanShouldExist(){
        assertNotNull(fieldInjectedBean);
    }

    @Test
    void constructLevelInjectedBeanShouldExist(){
        assertNotNull(constructorInjectedBean);
    }

}

