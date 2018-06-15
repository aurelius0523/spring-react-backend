package com.aurelius.react.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(JspController.class)
public class JspControllerTest extends BaseControllerTest {

    @MockBean
    private JspController controller;

    @Test
    public void testSomething() {
    }
}
