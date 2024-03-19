public class Employee {
    
    int employee_id_default;
    String employee_name_default;
    String employee_department_default;

    
    public int employee_id_public;
    public String employee_name_public;
    public String employee_department_public;

    
    private int employee_id_private;
    private String employee_name_private;
    private String employee_department_private;

    
    protected int employee_id_protected;
    protected String employee_name_protected;
    protected String employee_department_protected;

    

    
    public void setDefaultData(int employee_id, String employee_name, String employee_department) {
        this.employee_id_default = employee_id;
        this.employee_name_default = employee_name;
        this.employee_department_default = employee_department;
    }

    
    public void setPublicData(int employee_id, String employee_name, String employee_department) {
        this.employee_id_public = employee_id;
        this.employee_name_public = employee_name;
        this.employee_department_public = employee_department;
    }

    
    private void setPrivateData(int employee_id, String employee_name, String employee_department) {
        this.employee_id_private = employee_id;
        this.employee_name_private = employee_name;
        this.employee_department_private = employee_department;
    }

    
    protected void setProtectedData(int employee_id, String employee_name, String employee_department) {
        this.employee_id_protected = employee_id;
        this.employee_name_protected = employee_name;
        this.employee_department_protected = employee_department;
    }

    
    
    public String getDefaultData() {
        return "Employee ID: " + this.employee_id_default +
               ", Employee Name: " + this.employee_name_default +
               ", Employee Department: " + this.employee_department_default;
    }

   
    public String getPublicData() {
        return "Employee ID: " + this.employee_id_public +
               ", Employee Name: " + this.employee_name_public +
               ", Employee Department: " + this.employee_department_public;
    }

   
    private String getPrivateData() {
        return "Employee ID: " + this.employee_id_private +
               ", Employee Name: " + this.employee_name_private +
               ", Employee Department: " + this.employee_department_private;
    }

    
    protected String getProtectedData() {
        return "Employee ID: " + this.employee_id_protected +
               ", Employee Name: " + this.employee_name_protected +
               ", Employee Department: " + this.employee_department_protected;
    }
}
