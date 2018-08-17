package com.softserveinc.qmo.core

import org.springframework.test.context.testng.AbstractTestNGSpringContextTests
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass

class BaseTest extends AbstractTestNGSpringContextTests{

    @BeforeClass
    void init(){

    }
    @AfterClass
    void cleanUp(){

    }
}
