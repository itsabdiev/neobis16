package lab;

public enum Client_Role {
    REGISTERED_CLIENT(0.2F),
    NEW_CLIENT(0.1F),
    VIP(0.3F);
    private float discount;
    Client_Role(float discount) {
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }

}
