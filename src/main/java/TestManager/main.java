package TestManager;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Henry");
        Owner owner2 = new Owner("Ronald");
        /**
         * 1. Crear 2 Test Suites
         */
        List<SuiteCase> listSuite=new ArrayList<>();
        listSuite.add( new SuiteCase("Suite Login"));
        listSuite.add( new SuiteCase("Suite Profile"));
      /**
       * 2. Crear 5 Test Cases para cada test suite con su respectivo Owner y mostrar toda la Informacion por consola
       */
        // Suite 1
        AddedTesttoSuite.addedTestcases(listSuite.get(0),"TL001: Ingresar a la pagina con un usuario registrado",owner1,"Priority 2");
        AddedTesttoSuite.addedTestcases(listSuite.get(0),"TL002: Ingresar a la pagina con un usuario de gmail",owner1);
        AddedTesttoSuite.addedTestcases(listSuite.get(0),"TL003: Ingresar a la pagina con un usuario de facebook",owner1);
        AddedTesttoSuite.addedTestcases(listSuite.get(0),"TL004: Ingresar a la pagina con un usuarion de tiwter",owner1,"Priority 2");
        AddedTesttoSuite.addedTestcases(listSuite.get(0),"TL005: Un usuarion no registrado no puede entrar a la paguina",owner1);
        //Suite 2
        AddedTesttoSuite.addedTestcases(listSuite.get(1),"TP001: El usurio de btener un profile cuando se crea el usuario",owner2);
        AddedTesttoSuite.addedTestcases(listSuite.get(1),"TP002: El susarion puede crear un nuevo profile",owner2,"Priority 2");
        AddedTesttoSuite.addedTestcases(listSuite.get(1),"TP003: El usuario debe poder ver todos sus profile",owner2);
        AddedTesttoSuite.addedTestcases(listSuite.get(1),"TP004: El usuario puede administratar su profile",owner2);
        AddedTesttoSuite.addedTestcases(listSuite.get(1),"TP005: El usuario puede ver sus roles in Profile setting",owner2,"Priority 2");
        Filter.printAll(listSuite);

        /**
         * 3. Mostrar solo los test cases que pertenescan aun solo owner
         */
        Filter.filterByOwner(listSuite,"Henry");

        /**
         * 4.Mostrar solo los test cases que sean de un tipo de prioridad
         */
         Filter.filterByPriority(listSuite,"Priority 2");
    }



}
