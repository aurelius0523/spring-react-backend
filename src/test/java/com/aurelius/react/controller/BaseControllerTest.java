package com.aurelius.react.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class BaseControllerTest {
    @Autowired
    protected MockMvc mockMvc;
}
