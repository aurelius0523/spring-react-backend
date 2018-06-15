package com.aurelius.react;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.aurelius.react.facade.IAccountFacade;
import com.aurelius.react.facade.impl.AccountFacadeImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SmokeTest {

    @Autowired
    private IAccountFacade accountFacadeImpl;

    @Test
    public void givenFacadeAreRequired_whenApplicationStarts_thenItShouldNotBeNull() {
	assertThat(accountFacadeImpl).isNotNull();
	assertThat(accountFacadeImpl.getClass()).isIn(AccountFacadeImpl.class);
    }
}
