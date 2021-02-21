package TestManager;

import java.util.List;

public class Filter {


    public static void printAll(List<SuiteCase> listSuite) {
        for (SuiteCase suite : listSuite) {
            for (int i = 0; i < suite.getTestcases().size(); i++) {
                Printer.print(suite.getSuiteName(),
                        suite.getTestcases().get(i).getTitle(),
                        suite.getTestcases().get(i).getOwner().getFirstName(),
                        suite.getTestcases().get(i).getPriority());

            }
        }
    }

    public static void filterByOwner(List<SuiteCase> listSuite, String name) {
        for (SuiteCase suite : listSuite) {
            for (int i = 0; i < suite.getTestcases().size(); i++) {
                if (suite.getTestcases().get(i).getOwner().getFirstName() == name) {
                    Printer.print(suite.getSuiteName(),
                            suite.getTestcases().get(i).getTitle(),
                            suite.getTestcases().get(i).getOwner().getFirstName(),
                            suite.getTestcases().get(i).getPriority());
                }
            }
        }
    }

    public static void filterByPriority(List<SuiteCase> listSuite, String priority) {

        for (SuiteCase suite : listSuite) {
            int i = 0;
            while (i < suite.getTestcases().size()) {

                if (suite.getTestcases().get(i).getPriority() == priority) {
                    Printer.print(suite.getSuiteName(),
                            suite.getTestcases().get(i).getTitle(),
                            suite.getTestcases().get(i).getOwner().getFirstName(),
                            suite.getTestcases().get(i).getPriority());
                }
                i++;
            }
        }

    }
}
