  // Interface give default implementation is default method.
interface CollegeRule{
    default void idCard(){
        System.out.println("COLLEGE ID CARD");
    }
    default void uniform(){
        System.out.println("COLLEGE UNIFORM");
    }
}
interface DepartmentRule{
    default void uniform(){
        System.out.println("DEPARTMENT UNIFORM");
    }
}
class CollegeStudents implements CollegeRule,DepartmentRule{
    public void collegeStudent(){
        idCard();
        uniform();
        CollegeStudents collegeStudents=new CollegeStudents();
        collegeStudents.idCard();
        collegeStudents.uniform();
        CollegeRule collegeRule=new CollegeRule(){};
        collegeRule.idCard();
        collegeRule.uniform();
        DepartmentRule departmentRule=new DepartmentRule() {
        };
        departmentRule.uniform();
    }
    @Override                             // if delete this override compiler error come
    public void uniform() {
        CollegeRule.super.uniform();
    }
}
public class InterfaceExample {
    public static void main(String[] args){
        InterfaceExample interfaceExample=new InterfaceExample();
        interfaceExample.methodCall();
    }
    public void methodCall(){
        CollegeStudents collegeStudents=new CollegeStudents();
        collegeStudents.collegeStudent();
    }
}
