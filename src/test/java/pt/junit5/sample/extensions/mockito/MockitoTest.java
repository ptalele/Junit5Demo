package pt.junit5.sample.extensions.mockito;


import pt.junit5.sample.spring.Bean1;
import pt.junit5.sample.spring.Bean2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MockitoTest {

    @Mock
    private Bean1 bean1;

    @Test
    void test() {
        Bean2 bean2 = new Bean2(bean1);
        bean2.doStuffUsingBean1("Param");
        Mockito.verify(bean1).doStuff("Param");
    }
}

