package interfaceApp;

public class Button {

    private String text = "";
    private CallBack callBack;

    public Button(String text) {
        this.text = text;
    }

    public void setCallBack(CallBack callBack) {
        this.callBack = callBack;
    }

    // user clicked
    private void clicked() {
        // update system
        if (callBack !=  null) {
            callBack.onClick();
        }
    }


}
