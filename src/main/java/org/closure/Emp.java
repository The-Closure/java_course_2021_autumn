package org.closure;

public class Emp extends User{
    private Roles role;
    public Emp(String name, String password, int id,Roles role) {
        super(name, password, id);
        this.role = role;

    
    }


    public Roles getRole() {
        return this.role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "{" +
            " role='" + getRole() + "'" +
            "}";
    }


    // @Override
    // public final void testFinal(){}
    
}
