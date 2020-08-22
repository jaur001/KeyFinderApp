package Implementation.View.UIJavaFX;

import java.net.URL;
import java.util.ResourceBundle;

import Control.Control;
import Model.Account;
import View.Persistence.AccountListWriter;
import Implementation.View.Persistence.FileAccountListWriter;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import static java.lang.Integer.parseInt;


public class ScrapperHour {

    private Account account;
    private Control control;

    public ScrapperHour(Account account, Control control) {
        this.account = account;
        this.control = control;
    }


    @FXML
    private TextField hourTextField;

    @FXML
    private URL location;


    @FXML
    void setScrapperHour(MouseEvent event) {
        account.setScraphour(parseInt(hourTextField.getText()));
        AccountListWriter writer = new FileAccountListWriter("data/accounts/accounts.txt");
        writer.editHour(account);
        control.setScrapHour(parseInt(hourTextField.getText()));
        Stage stageToClose = (Stage) hourTextField.getScene().getWindow();
        stageToClose.close();
    }

    @FXML
    void initialize() {
        hourTextField.setText(Integer.toString(account.getScraphour()));

    }

}
