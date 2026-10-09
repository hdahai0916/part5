package dto;

public class QueryResponse {
    private String pick_code;
    private String msg;

    public QueryResponse(String pick,String message){
        this.pick_code=pick;
        this.msg=message;
    }

    public void print(){
        if(pick_code!=null)
            System.out.println("取件码："+pick_code);
        else System.out.println(msg);
    }

    public String getMsg() {
        return msg;
    }

    public String getPick_code() {
        return pick_code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setPick_code(String pick_code) {
        this.pick_code = pick_code;
    }
}
