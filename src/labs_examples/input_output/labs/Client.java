package labs_examples.input_output.labs;

public class Client {

    private int clientNumber;
    private String lastName;
    private String firstName;
    private String type;
    private int accountAge;

    public Client() {
    }

    public Client (int cn, String last, String first, String type, int yr) {
        this.clientNumber = cn;
        this.lastName = last;
        this.firstName =first;
        this.type = type;
        this.accountAge = yr;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAccountAge() {
        return accountAge;
    }

    public void setAccountAge(int accountAge) {
        this.accountAge = accountAge;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientNumber=" + clientNumber +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", type='" + type + '\'' +
                ", accountAge=" + accountAge +
                '}';
    }
}
