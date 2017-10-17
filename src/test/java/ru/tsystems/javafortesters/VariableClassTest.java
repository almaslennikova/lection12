package ru.tsystems.javafortesters;

import org.junit.Test;

/**
 * Test for <code>VariableClass</code>.
 */
public class VariableClassTest {

    @Test
    public void scopeTest() {
        VariblesClass variblesClass = new VariblesClass();
        variblesClass.testScope();
    }

    @Test
    public void charTest() {
        System.out.println("-------Char test-------");
        VariblesClass.CharVariables charVariables = new VariblesClass().new CharVariables();
        charVariables.test();
        System.out.println("");
    }

    @Test
    public void integerTest() {
        System.out.println("-------Integer test-------");
        VariblesClass.IntegerVariables integerVariables = new VariblesClass().new IntegerVariables();
        integerVariables.test();
        System.out.println("");
    }

    @Test
    public void floatTest() {
        System.out.println("-------Float test-------");
        VariblesClass.FloatVariables floatVariables = new VariblesClass().new FloatVariables();
        floatVariables.test();
        System.out.println("");
    }

}
