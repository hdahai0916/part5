package dto;

public class QueryRequest {
    private String trackingNumber;
    private String phone;

    public QueryRequest(String trNum,String ph){
        this.trackingNumber=trNum;
        this.phone=ph;
    }

    public String getPhone() {
        return phone;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber){
        this.trackingNumber=trackingNumber;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
