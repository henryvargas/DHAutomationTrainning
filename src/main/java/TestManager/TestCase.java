package TestManager;

import java.util.Map;

public class TestCase {
    /*
     *Title
Priority (valor por defecto 1)
 Description
 Owner  (puede ser null)
 Steps
 Expected Results
 Status

     */
    private String title;
    private String priority;
    private String description;
    private Owner owner;
    private Map<Integer, String> steps;
    private String expectedResult;
    private String status;


    public String getTitle() {
        return title;
    }

    public String getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public Owner getOwner() {
        return owner;
    }

    public Map<Integer, String> getSteps() {
        return steps;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public String getStatus() {
        return status;
    }

    private TestCase(TestCaseBuilder testcaseBuilder) {
        this.title = testcaseBuilder.title;
        this.priority = testcaseBuilder.priority;
        this.description = testcaseBuilder.description;
        this.owner = testcaseBuilder.owner;
        this.steps = testcaseBuilder.steps;
        this.expectedResult = testcaseBuilder.expectedResult;
        this.status = testcaseBuilder.status;


    }

    public static class TestCaseBuilder {
        private String title;
        private String priority;
        private String description;
        private Owner owner;
        private Map<Integer, String> steps;
        private String expectedResult;
        private String status;

        public TestCaseBuilder(String title) {
            this.title = title;
            setPriority("Priority 1");
        }


        public TestCaseBuilder setPriority(String priority) {
            this.priority = priority;
            return this;
        }

        public TestCaseBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public TestCaseBuilder setOwner(Owner owner) {
            this.owner = owner;
            return this;
        }

        public TestCaseBuilder setSteps(Map<Integer, String> steps) {
            this.steps = steps;
            return this;
        }

        public TestCaseBuilder setExpectedResult(String expectedResult) {
            this.expectedResult = expectedResult;
            return this;
        }

        public TestCaseBuilder setStatus(String status) {
            this.status = status;
            return this;
        }

        public TestCase build() {
            TestCase test = new TestCase(this);
            validateData(test);
            return test;

        }

        private void validateData(TestCase test) {
            test.description = test.description == null ? "The description is empty" : test.description;
            test.expectedResult = test.expectedResult == null ? "The expected Result is empty" : test.expectedResult;
            test.status = test.status == null ? "The status is empty" : test.status;
        }

    }
}
