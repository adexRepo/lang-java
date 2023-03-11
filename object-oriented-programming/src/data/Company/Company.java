package data.Company;

public class Company {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee{
        private String name;

        public String getName() {
            String nameFromCompany = Company.this.getName();
            String nameFromEmployee = this.name; 


            return "Company : "+nameFromCompany +" - Employee : "+ nameFromEmployee;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    }


    // * cara buat object nya lihat di Inner_Class_30
}
