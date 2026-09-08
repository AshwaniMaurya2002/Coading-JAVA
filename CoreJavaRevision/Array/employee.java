
public class employee {

    String email;
    String password;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("employee{");
        sb.append("email=").append(email);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }



}
