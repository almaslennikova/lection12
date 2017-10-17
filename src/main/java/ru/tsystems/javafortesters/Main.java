package ru.tsystems.javafortesters;

public class Main {

    public static void main(String[] args) {
        /*
        it is multi line comment
        yes, here I am still valid
        */
        if (args != null && args.length > 0) {
            int argNum = 0;
            for (; argNum < args.length; ) {
                System.out.printf("Argument #%s is %s\n", argNum + 1, args[argNum++]);
            }
        }
    }

    public void testVarNames() {
        System.out.println("Java is cool");

        String var1__$$08D = "never call variables like this";
        System.out.println(var1__$$08D);

        //String default = "default"; // default is reserved word, see other here https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
    }

}

//it is one line comment and you can place me where you want
