package lab;

public class Client {
    private String name;
    private String email;
    private Client_Role client_role;
    private String number;
    private Long cardCredentials;

    public Client(String name, Client_Role client_role, String number, Long cardCredentials) {
        this.name = name;
        this.client_role = client_role;
        this.number = number;
        this.cardCredentials = cardCredentials;
    }

    public Client(String name, String email, Client_Role client_role, String number, Long cardCredentials) {
        this.name = name;
        this.email = email;
        this.client_role = client_role;
        this.number = number;
        this.cardCredentials = cardCredentials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Client_Role getClient_role() {
        return client_role;
    }

    public void setClient_role(Client_Role client_role) {
        this.client_role = client_role;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getCardCredentials() {
        return cardCredentials;
    }

    public void setCardCredentials(Long cardCredentials) {
        this.cardCredentials = cardCredentials;
    }
}
