
package studentprofilemanagementsys;


public class Student 
{
    private String name;
    private String matricno;
    private String department;

    public Student(String name, String matricno, String department) {
        this.name = name;
        this.matricno = matricno;
        this.department = department;
    }
    
    public Student(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatricno() {
        return matricno;
    }

    public void setMatricno(String matricno) {
        this.matricno = matricno;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    
    
}
