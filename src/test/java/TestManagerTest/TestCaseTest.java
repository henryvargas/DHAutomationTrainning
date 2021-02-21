package TestManagerTest;


import TestManager.Owner;
import TestManager.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestCaseTest {
    @Test
    public void verifyThatTheUserCanTestCasesWithItsMandatoryField() {
        String title = "Test case Number 1";
        TestCase test1 = new TestCase.TestCaseBuilder(title).build();
        Assert.assertEquals(test1.getTitle(), title);
        Assert.assertEquals(test1.getPriority(), "Priority 1");
        Assert.assertEquals(test1.getOwner(), null);
        Assert.assertEquals(test1.getDescription(), "The description is empty");
        Assert.assertEquals(test1.getSteps(), null);
        Assert.assertEquals(test1.getStatus(), "The status is empty");

    }

    @Test
    public void verifyThatTheUserCanTestCasesSetPriority() {
        String title = "Test case Number 2";
        String priority = "Priority 3";
        TestCase test1 = new TestCase.TestCaseBuilder(title)
                .setPriority(priority)
                .build();
        Assert.assertEquals(test1.getPriority(), priority);
    }

    @Test
    public void verifyThatTheUserCanTestCasesSetOwner() {
        String title = "Test case Number 2";
        Owner owner = new Owner("Henry");
        owner.setLastName("Vargas");
        owner.setRole("Lead");
        TestCase test1 = new TestCase.TestCaseBuilder(title)
                .setOwner(owner)
                .build();

        Assert.assertEquals(test1.getOwner().getFirstName(), "Henry");
        Assert.assertEquals(test1.getOwner().getLastName(), "Vargas");
        Assert.assertEquals(test1.getOwner().getRole(), "Lead");

    }

    @Test
    public void verifyThatTheUserCanTestCasesSetDescription() {
        String title = "Test case Number 2";
        String description = "This a testing for testing";
        TestCase test1 = new TestCase.TestCaseBuilder(title)
                .setDescription(description)
                .build();
        Assert.assertEquals(test1.getDescription(), description);
    }

    @Test
    public void verifyThatTheUserCanTestCasesSetSteps() {
        String title = "Test case Number 2";
        Map<Integer,String> steps= new HashMap<Integer, String>();
        steps.put(1,"Step 001");
        steps.put(2,"Step 002");
        steps.put(3,"Step 003");

        TestCase test1 = new TestCase.TestCaseBuilder(title)
                .setSteps(steps)
                .build();

        Assert.assertEquals(test1.getSteps().get(1), "Step 001");
        Assert.assertEquals(test1.getSteps().get(2), "Step 002");
        Assert.assertEquals(test1.getSteps().get(3), "Step 003");

    }

    @Test
    public void verifyThatTheUserCanTestCasesSetExpectedResult() {
        String title = "Test case Number 2";
        String expectedResult= "Verify the test";
        TestCase test1 = new TestCase.TestCaseBuilder(title)
                .setExpectedResult(expectedResult)
                .build();
        Assert.assertEquals(test1.getExpectedResult(), expectedResult);
    }

    @Test
    public void verifyThatTheUserCanTestCasesSetStatus() {
        String title = "Test case Number 2";
        String status= "In-Progress";
        TestCase test1 = new TestCase.TestCaseBuilder(title)
                .setStatus(status)
                .build();
        Assert.assertEquals(test1.getStatus(), status);
    }
}
