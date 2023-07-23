public class FieldNamingDemo {
    // Legal field names
    private int legalField1;
    private String legalField2;
    private boolean legalField3;

    // Illegal field names
    private int 123IllegalField; // Starting with a digit is illegal
    private String illegal-field; // Using a hyphen is illegal
    private boolean class; // Using a reserved keyword is illegal

    public static void main(String[] args) {
        FieldNamingDemo demo = new FieldNamingDemo();

        // Trying to print uninitialized fields
        System.out.println("Uninitialized fields:");
        System.out.println("legalField1: " + demo.legalField1);
        System.out.println("legalField2: " + demo.legalField2);
        System.out.println("legalField3: " + demo.legalField3);
        System.out.println("123IllegalField: " + demo.123IllegalField);
        System.out.println("illegal-field: " + demo.illegal-field); // This will produce a compiler error
        System.out.println("class: " + demo.class); // This will produce a compiler error

        // Trying to print uninitialized local variables
        System.out.println("\nUninitialized local variables:");
        int localVar1;
        String localVar2;
        boolean localVar3;

        System.out.println("localVar1: " + localVar1); // This will produce a compiler error
        System.out.println("localVar2: " + localVar2); // This will produce a compiler error
        System.out.println("localVar3: " + localVar3); // This will produce a compiler error