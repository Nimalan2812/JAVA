class Employee {
        String name;
        int id;
        Department department;
    
     // Inner class Department
       class Department {
            String departmentName;
            String location;
        }
    
       // Method to set employee details
       void setEmployeeDetails(String empName, int empId, String deptName, String deptLocation) {
           name = empName;
           id = empId;
           department = new Department();
           department.departmentName = deptName;
           department.location = deptLocation;
       }
    
        // Method to get employee details
         String getEmployeeDetails() {
             return "Employee Name: " + name + ", ID: " + id + ", Department: " + department.departmentName + ", Location: " + department.location;
        }
    
       public static void main(String[] args) {
           // Test Case 1
          Employee employee1 = new Employee();
          employee1.setEmployeeDetails("Alice", 101, "HR", "New York");
          System.out.println(employee1.getEmployeeDetails());
    
           // Test Case 2
           Employee employee2 = new Employee();
           employee2.setEmployeeDetails("Bob", 102, "IT", "San Francisco");
           System.out.println(employee2.getEmployeeDetails());
    
            // Test Case 3
            Employee employee3 = new Employee();
           employee3.setEmployeeDetails("Charlie", 103, "Finance", "Chicago");
           System.out.println(employee3.getEmployeeDetails());
        }
    
}
    