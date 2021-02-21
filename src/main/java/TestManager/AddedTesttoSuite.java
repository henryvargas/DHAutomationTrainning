package TestManager;

public class AddedTesttoSuite {

    public static void addedTestcases(SuiteCase suite, String title, Owner owner1) {
        TestCase test1 = new TestCase.TestCaseBuilder(title)
                .setOwner(owner1)
                .build();
        suite.setTestcases(test1);
    }
    public static void addedTestcases(SuiteCase suite, String title, Owner owner1,String priority) {
        TestCase test1 = new TestCase.TestCaseBuilder(title)
                .setOwner(owner1)
                .setPriority(priority)
                .build();
        suite.setTestcases(test1);
    }

}
