package TestManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SuiteCase {
    private String suiteName;
    private List<TestCase> testcases;

    public SuiteCase(String suiteName) {
        this.suiteName = suiteName;
        testcases=new ArrayList<>();
    }

    public String getSuiteName() {
        return suiteName;
    }

    public void setSuiteName(String suiteName) {
        this.suiteName = suiteName;
    }

    public List<TestCase> getTestcases() {
        return testcases;
    }

    public void setTestcases(TestCase testcase) {
        testcases.add(testcase);
    }
}
