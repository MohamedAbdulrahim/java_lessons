
package lec15;

import java.io.Serializable;
// if i have class and i need to save serialization technique make implement serializable interface
public class Employee implements Serializable{
    
    private int empno;
    private String name;
    private transient String password; // if i store object with serilization technique ,, so password not store 
                                        // password = null ,, so not storing password in file
                                        // so i store password in another place
    
    
    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
