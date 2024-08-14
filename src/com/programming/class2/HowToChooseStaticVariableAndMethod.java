package com.programming.class2;

public class HowToChooseStaticVariableAndMethod {

    // These two should be non-static.
    int empId;
    String empName;

//    Since, this variable should be same  for all the objects. It ia made static
    static String orgName;  // declaration of static variable. can also initialize here by ` = "ABC";`

    static {
        // Static initializer block
        // to initiate project level
        // run even before main method.
        orgName = "ABC";
    }
    HowToChooseStaticVariableAndMethod(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    // non-static function can access both static and non-static variable.
    void show() {
        System.out.println("Employee ID: "+ empId+ "\nEmployee Name: "+empName+ "\nOrganization name: "+orgName+ "\n");
    }

    // static method cannot access the non-static variable since it is called upon class.
    static void changeOrgName() {
        orgName = "ABCD";
    }

    public static void main(String[] args) {
        HowToChooseStaticVariableAndMethod obj1 = new HowToChooseStaticVariableAndMethod(1, "Arun");
        obj1.show();

        HowToChooseStaticVariableAndMethod obj2 = new HowToChooseStaticVariableAndMethod(2, "Bala");
        obj2.show();

        HowToChooseStaticVariableAndMethod.changeOrgName();
        System.out.println(".....Changing organization name.....\n");

        HowToChooseStaticVariableAndMethod obj3 = new HowToChooseStaticVariableAndMethod(3, "Chandhru");
        obj3.show();

    }
}
// all objects of the class access the same orgName.
