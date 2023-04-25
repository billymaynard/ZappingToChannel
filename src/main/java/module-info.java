module com.zapping.zappingtochannel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zapping.zappingtochannel to javafx.fxml;
    exports com.zapping.zappingtochannel;
}