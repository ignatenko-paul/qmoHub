package com.softserveinc.qmo.test

import com.softserveinc.qmo.core.BaseTest
import com.softserveinc.qmo.test.teststepscontext.AddressAbstractContext
import com.softserveinc.qmo.test.teststepscontext.PatientAbstractContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.testng.annotations.BeforeClass
import org.testng.annotations.Test

@ContextConfiguration('classpath:/com/softserveinc/qmo/test/demoHubTest.xml')
class demoHubTest extends BaseTest {
    @Autowired
    PatientAbstractContext patientContext
    @Autowired
    AddressAbstractContext addressContext

    @BeforeClass
    void beforeTestStart() {

    }

    @Test
    void testCreatePatient() {
        patientContext
        .navigateToPatientContext()
        .clickCreatePatient()
        .enterLastName()
        .enterFirstName
        .select

    }
}
