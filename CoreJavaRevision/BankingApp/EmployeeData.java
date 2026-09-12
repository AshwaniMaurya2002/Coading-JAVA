
public class EmployeeData {

    
    private String email;
    private String password;
    private int amout;

    public String getEmail() {
                return email;
    }
    public void setEmail(String email) {
                this.email = email;
    }
    public String getPassword() {
                return password;
    }
    public void setPassword(String password) {
                this.password = password;
    }
    public int getAmout() {
                return amout;
    }
    public void setAmout(int amout) {
                this.amout = amout;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmployeeData{");
        sb.append("email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", amout=").append(amout);
        sb.append('}');
        return sb.toString();
    }



    
}
