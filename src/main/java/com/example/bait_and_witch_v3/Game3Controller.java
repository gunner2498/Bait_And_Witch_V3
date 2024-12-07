package com.example.bait_and_witch_v3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;


public class Game3Controller {
    @FXML
    private ImageView NextButton;

    @FXML
    private ImageView CastButton;

    @FXML
    private Label EndStatement;

    @FXML
    private Label DialogueBox;

    @FXML
    private ImageView SS1;

    @FXML
    private ImageView SS10;

    @FXML
    private ImageView SS11;

    @FXML
    private ImageView SS12;

    @FXML
    private ImageView SS13;

    @FXML
    private ImageView SS14;

    @FXML
    private ImageView SS15;

    @FXML
    private ImageView SS16;

    @FXML
    private ImageView SS2;

    @FXML
    private ImageView SS3;

    @FXML
    private ImageView SS4;

    @FXML
    private ImageView SS5;

    @FXML
    private ImageView SS6;

    @FXML
    private ImageView SS7;

    @FXML
    private ImageView SS8;

    @FXML
    private ImageView SS9;

    @FXML
    private ImageView StageG3;

    int FailCount = 0;
    int cont = 0;


    @FXML
    void CastClick(MouseEvent event) {
        if ((SS1.getAccessibleText().equals("1") && SS2.getAccessibleText().equals("2") && SS3.getAccessibleText().equals("3") && SS4.getAccessibleText().equals("4") && SS5.getAccessibleText().equals("5") && SS6.getAccessibleText().equals("6") && SS7.getAccessibleText().equals("7") && SS8.getAccessibleText().equals("8") && SS9.getAccessibleText().equals("9") && SS10.getAccessibleText().equals("10") && SS11.getAccessibleText().equals("11") && SS12.getAccessibleText().equals("12") && SS13.getAccessibleText().equals("13") && SS14.getAccessibleText().equals("14") && SS15.getAccessibleText().equals("15")&& SS16.getAccessibleText().equals("0"))){
            StageG3.setVisible(true);
            DialogueBox.setVisible(true);
            StageG3.setMouseTransparent(true);
            DialogueBox.setMouseTransparent(true);
            StageG3.setImage(new Image(getClass().getResource("/assets/Set45.png").toString()));
            DialogueBox.setText("“Hmm…Not moon water, more like…star water. Interesting. I’ll allow it.”");
            EndStatement.setText("Success");

            cont = 1;
        }
        else {
            StageG3.setVisible(true);
            DialogueBox.setVisible(true);
            FailCount++;
            Fail();
        }
    }

    void Fail(){
        if(FailCount == 1){
            StageG3.setImage(new Image(getClass().getResource("/assets/G3F1.png").toString()));
            DialogueBox.setText("“Concentrate harder, Ms. Morgana. It is not that difficult.”");

        }
        else if(FailCount == 2){
            StageG3.setImage(new Image(getClass().getResource("/assets/G3F2.png").toString()));
            DialogueBox.setText("“Everyone else has been able to do it. Why can’t you?”");

        }
        else if(FailCount == 3){


            StageG3.setImage(new Image(getClass().getResource("/assets/G3F3.png").toString()));
            DialogueBox.setText("“How disappointing.”");
            cont = 2;
        }
        else{
            cont = 2;
            CastButton.setDisable(true);
            EndStatement.setText("Failure");




        }
    }

    @FXML
    void NextClick(MouseEvent event) {
        if(((FailCount == 3) && cont == 0) || ((FailCount == 0 && EndStatement.equals("Success")) )) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Stage.fxml"));
                Scene StageScene = new Scene(loader.load());
                Stage currentStage = (Stage) NextButton.getScene().getWindow();
                currentStage.close();
                Stage newStage = new Stage();
                newStage.setScene(StageScene);
                newStage.show();
            } catch (IOException e) {
                e.printStackTrace();
                EndStatement.setText("Error loading Stage scene.");
            }
        }
        else if(cont == 1) {
            returnToStage3(true);
        }
        else if(cont == 2) {
            returnToStage3(false);
        }
        else {
            StageG3.setVisible(false);
            DialogueBox.setVisible(false);

        }
    }

    void returnToStage3(boolean success3) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Stage.fxml"));
            Stage stage = (Stage) StageG3.getScene().getWindow(); // Get current stage

            // Load the Stage scene
            Scene stageScene = new Scene(loader.load());
            stage.setScene(stageScene);

            // Access StageController and update the result
            StageController stageController = loader.getController();
            if (stageController != null) {
                stageController.updateGameResult3(success3);
            }
        } catch (IOException e) {
            e.printStackTrace();
            DialogueBox.setText("Error returning to the main stage.");
        }
    }

    @FXML
    void S1Click(MouseEvent event) {
        Image SS1Image = ((ImageView) SS1).getImage();
        String SS1AccessibleText = SS1.getAccessibleText();
        if (SS2.getAccessibleText().equals("0")){

            ((ImageView) SS2).setImage(SS1Image);
            SS2.setAccessibleText(SS1AccessibleText);

            SS1.setAccessibleText("0");
            ((ImageView) SS1).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS5.getAccessibleText().equals("0")){

            ((ImageView) SS5).setImage(SS1Image);
            SS5.setAccessibleText(SS1AccessibleText);

            SS1.setAccessibleText("0");
            ((ImageView) SS1).setImage(new Image("file: P3-Backdrop.png"));

        }
        else{
            EndStatement.setText("Incorrect input");
        }

    }

    @FXML
    void S2Click(MouseEvent event) {
        Image SS2Image = ((ImageView) SS2).getImage();
        String SS2AccessibleText = SS2.getAccessibleText();

        if (SS1.getAccessibleText().equals("0")){

            ((ImageView) SS1).setImage(SS2Image);
            SS1.setAccessibleText(SS2AccessibleText);

            SS2.setAccessibleText("0");
            ((ImageView) SS2).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS3.getAccessibleText().equals("0")){

            ((ImageView) SS3).setImage(SS2Image);
            SS3.setAccessibleText(SS2AccessibleText);

            SS2.setAccessibleText("0");
            ((ImageView) SS2).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS6.getAccessibleText().equals("0")){

            ((ImageView) SS6).setImage(SS2Image);
            SS6.setAccessibleText(SS2AccessibleText);

            SS2.setAccessibleText("0");
            ((ImageView) SS2).setImage(new Image("file: P3-Backdrop.png"));

        }
        else{
            EndStatement.setText("Incorrect input");
        }

    }

    @FXML
    void S3Click(MouseEvent event) {
        Image SS3Image = ((ImageView) SS3).getImage();
        String SS3AccessibleText = SS3.getAccessibleText();
        if (SS2.getAccessibleText().equals("0")){

            ((ImageView) SS2).setImage(SS3Image);
            SS2.setAccessibleText(SS3AccessibleText);

            SS3.setAccessibleText("0");
            ((ImageView) SS3).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS4.getAccessibleText().equals("0")){

            ((ImageView) SS4).setImage(SS3Image);
            SS4.setAccessibleText(SS3AccessibleText);

            SS3.setAccessibleText("0");
            ((ImageView) SS3).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS7.getAccessibleText().equals("0")){

            ((ImageView) SS7).setImage(SS3Image);
            SS7.setAccessibleText(SS3AccessibleText);

            SS3.setAccessibleText("0");
            ((ImageView) SS3).setImage(new Image("file: P3-Backdrop.png"));

        }
        else{
            EndStatement.setText("Incorrect input");
        }

    }

    @FXML
    void S4Click(MouseEvent event) {
        Image SS4Image = ((ImageView) SS4).getImage();
        String SS4AccessibleText = SS4.getAccessibleText();

        if (SS3.getAccessibleText().equals("0")){

            ((ImageView) SS3).setImage(SS4Image);
            SS3.setAccessibleText(SS4AccessibleText);

            SS4.setAccessibleText("0");
            ((ImageView) SS4).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS8.getAccessibleText().equals("0")){

            ((ImageView) SS8).setImage(SS4Image);
            SS8.setAccessibleText(SS4AccessibleText);

            SS4.setAccessibleText("0");
            ((ImageView) SS4).setImage(new Image("file: P3-Backdrop.png"));

        }
        else{
            EndStatement.setText("Incorrect input");
        }

    }

    @FXML
    void S5Click(MouseEvent event) {
        Image SS5Image = ((ImageView) SS5).getImage();
        String SS5AccessibleText = SS5.getAccessibleText();

        if (SS1.getAccessibleText().equals("0")){

            ((ImageView) SS1).setImage(SS5Image);
            SS1.setAccessibleText(SS5AccessibleText);

            SS5.setAccessibleText("0");
            ((ImageView) SS5).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS6.getAccessibleText().equals("0")){

            ((ImageView) SS6).setImage(SS5Image);
            SS6.setAccessibleText(SS5AccessibleText);

            SS5.setAccessibleText("0");
            ((ImageView) SS5).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS9.getAccessibleText().equals("0")){

            ((ImageView) SS9).setImage(SS5Image);
            SS9.setAccessibleText(SS5AccessibleText);

            SS5.setAccessibleText("0");
            ((ImageView) SS5).setImage(new Image("file: P3-Backdrop.png"));

        }
        else{
            EndStatement.setText("Incorrect input");
        }

    }

    @FXML
    void S6Click(MouseEvent event) {
        Image SS6Image = ((ImageView) SS6).getImage();
        String SS6AccessibleText = SS6.getAccessibleText();

        if (SS2.getAccessibleText().equals("0")){

            ((ImageView) SS2).setImage(SS6Image);
            SS2.setAccessibleText(SS6AccessibleText);

            SS6.setAccessibleText("0");
            ((ImageView) SS6).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS5.getAccessibleText().equals("0")){

            ((ImageView) SS5).setImage(SS6Image);
            SS5.setAccessibleText(SS6AccessibleText);

            SS6.setAccessibleText("0");
            ((ImageView) SS6).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS7.getAccessibleText().equals("0")){

            ((ImageView) SS7).setImage(SS6Image);
            SS7.setAccessibleText(SS6AccessibleText);

            SS6.setAccessibleText("0");
            ((ImageView) SS6).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS10.getAccessibleText().equals("0")){

            ((ImageView) SS10).setImage(SS6Image);
            SS10.setAccessibleText(SS6AccessibleText);

            SS6.setAccessibleText("0");
            ((ImageView) SS6).setImage(new Image("file: P3-Backdrop.png"));

        }
        else{
            EndStatement.setText("Incorrect input");
        }

    }

    @FXML
    void S7Click(MouseEvent event) {
        Image SS7Image = ((ImageView) SS7).getImage();
        String SS7AccessibleText = SS7.getAccessibleText();

        if (SS3.getAccessibleText().equals("0")){

            ((ImageView) SS3).setImage(SS7Image);
            SS3.setAccessibleText(SS7AccessibleText);

            SS7.setAccessibleText("0");
            ((ImageView) SS7).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS6.getAccessibleText().equals("0")){

            ((ImageView) SS6).setImage(SS7Image);
            SS6.setAccessibleText(SS7AccessibleText);

            SS7.setAccessibleText("0");
            ((ImageView) SS7).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS8.getAccessibleText().equals("0")){

            ((ImageView) SS8).setImage(SS7Image);
            SS8.setAccessibleText(SS7AccessibleText);

            SS7.setAccessibleText("0");
            ((ImageView) SS7).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS11.getAccessibleText().equals("0")){

            ((ImageView) SS11).setImage(SS7Image);
            SS11.setAccessibleText(SS7AccessibleText);

            SS7.setAccessibleText("0");
            ((ImageView) SS7).setImage(new Image("file: P3-Backdrop.png"));

        }
        else{
            EndStatement.setText("Incorrect input");
        }

    }

    @FXML
    void S8Click(MouseEvent event) {
        Image SS8Image = ((ImageView) SS8).getImage();
        String SS8AccessibleText = SS8.getAccessibleText();

        if (SS4.getAccessibleText().equals("0")){

            ((ImageView) SS4).setImage(SS8Image);
            SS4.setAccessibleText(SS8AccessibleText);

            SS8.setAccessibleText("0");
            ((ImageView) SS8).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS7.getAccessibleText().equals("0")){

            ((ImageView) SS7).setImage(SS8Image);
            SS7.setAccessibleText(SS8AccessibleText);

            SS8.setAccessibleText("0");
            ((ImageView) SS8).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS12.getAccessibleText().equals("0")){

            ((ImageView) SS12).setImage(SS8Image);
            SS12.setAccessibleText(SS8AccessibleText);

            SS8.setAccessibleText("0");
            ((ImageView) SS8).setImage(new Image("file: P3-Backdrop.png"));

        }
        else{
            EndStatement.setText("Incorrect input");
        }

    }

    @FXML
    void S9Click(MouseEvent event) {
        Image SS9Image = ((ImageView) SS9).getImage();
        String SS9AccessibleText = SS9.getAccessibleText();

        if (SS5.getAccessibleText().equals("0")){

            ((ImageView) SS5).setImage(SS9Image);
            SS5.setAccessibleText(SS9AccessibleText);

            SS9.setAccessibleText("0");
            ((ImageView) SS9).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS10.getAccessibleText().equals("0")){

            ((ImageView) SS10).setImage(SS9Image);
            SS10.setAccessibleText(SS9AccessibleText);

            SS9.setAccessibleText("0");
            ((ImageView) SS9).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS13.getAccessibleText().equals("0")){

            ((ImageView) SS13).setImage(SS9Image);
            SS13.setAccessibleText(SS9AccessibleText);

            SS9.setAccessibleText("0");
            ((ImageView) SS9).setImage(new Image("file: P3-Backdrop.png"));

        }
        else{
            EndStatement.setText("Incorrect input");
        }

    }
    @FXML
    void S10Click(MouseEvent event) {
        Image SS10Image = ((ImageView) SS10).getImage();
        String SS10AccessibleText = SS10.getAccessibleText();

        if (SS6.getAccessibleText().equals("0")){

            ((ImageView) SS6).setImage(SS10Image);
            SS6.setAccessibleText(SS10AccessibleText);

            SS10.setAccessibleText("0");
            ((ImageView) SS10).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS9.getAccessibleText().equals("0")){

            ((ImageView) SS9).setImage(SS10Image);
            SS9.setAccessibleText(SS10AccessibleText);

            SS10.setAccessibleText("0");
            ((ImageView) SS10).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS11.getAccessibleText().equals("0")){

            ((ImageView) SS11).setImage(SS10Image);
            SS11.setAccessibleText(SS10AccessibleText);

            SS10.setAccessibleText("0");
            ((ImageView) SS10).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS14.getAccessibleText().equals("0")){

            ((ImageView) SS14).setImage(SS10Image);
            SS14.setAccessibleText(SS10AccessibleText);

            SS10.setAccessibleText("0");
            ((ImageView) SS10).setImage(new Image("file: P3-Backdrop.png"));

        }
        else{
            EndStatement.setText("Incorrect input");
        }

    }

    @FXML
    void S11Click(MouseEvent event) {
        Image SS11Image = ((ImageView) SS11).getImage();
        String SS11AccessibleText = SS11.getAccessibleText();

        if (SS7.getAccessibleText().equals("0")){

            ((ImageView) SS7).setImage(SS11Image);
            SS7.setAccessibleText(SS11AccessibleText);

            SS11.setAccessibleText("0");
            ((ImageView) SS11).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS10.getAccessibleText().equals("0")){

            ((ImageView) SS10).setImage(SS11Image);
            SS10.setAccessibleText(SS11AccessibleText);

            SS11.setAccessibleText("0");
            ((ImageView) SS11).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS12.getAccessibleText().equals("0")){

            ((ImageView) SS12).setImage(SS11Image);
            SS12.setAccessibleText(SS11AccessibleText);

            SS11.setAccessibleText("0");
            ((ImageView) SS11).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS15.getAccessibleText().equals("0")){

            ((ImageView) SS15).setImage(SS11Image);
            SS15.setAccessibleText(SS11AccessibleText);

            SS11.setAccessibleText("0");
            ((ImageView) SS11).setImage(new Image("file: P3-Backdrop.png"));

        }
        else{
            EndStatement.setText("Incorrect input");
        }

    }

    @FXML
    void S12Click(MouseEvent event) {
        Image SS12Image = ((ImageView) SS12).getImage();
        String SS12AccessibleText = SS12.getAccessibleText();

        if (SS8.getAccessibleText().equals("0")){

            ((ImageView) SS8).setImage(SS12Image);
            SS8.setAccessibleText(SS12AccessibleText);

            SS12.setAccessibleText("0");
            ((ImageView) SS12).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS11.getAccessibleText().equals("0")){

            ((ImageView) SS11).setImage(SS12Image);
            SS11.setAccessibleText(SS12AccessibleText);

            SS12.setAccessibleText("0");
            ((ImageView) SS12).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS16.getAccessibleText().equals("0")){

            ((ImageView) SS16).setImage(SS12Image);
            SS16.setAccessibleText(SS12AccessibleText);

            SS12.setAccessibleText("0");
            ((ImageView) SS12).setImage(new Image("file: P3-Backdrop.png"));

        }
        else{
            EndStatement.setText("Incorrect input");
        }

    }

    @FXML
    void S13Click(MouseEvent event) {
        Image SS13Image = ((ImageView) SS13).getImage();
        String SS13AccessibleText = SS13.getAccessibleText();

        if (SS9.getAccessibleText().equals("0")){

            ((ImageView) SS9).setImage(SS13Image);
            SS9.setAccessibleText(SS13AccessibleText);

            SS13.setAccessibleText("0");
            ((ImageView) SS13).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS14.getAccessibleText().equals("0")){

            ((ImageView) SS14).setImage(SS13Image);
            SS14.setAccessibleText(SS13AccessibleText);

            SS13.setAccessibleText("0");
            ((ImageView) SS13).setImage(new Image("file: P3-Backdrop.png"));

        }
        else{
            EndStatement.setText("Incorrect input");
        }

    }

    @FXML
    void S14Click(MouseEvent event) {
        Image SS14Image = ((ImageView) SS14).getImage();
        String SS14AccessibleText = SS14.getAccessibleText();

        if (SS10.getAccessibleText().equals("0")){

            ((ImageView) SS10).setImage(SS14Image);
            SS10.setAccessibleText(SS14AccessibleText);

            SS14.setAccessibleText("0");
            ((ImageView) SS14).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS13.getAccessibleText().equals("0")){

            ((ImageView) SS13).setImage(SS14Image);
            SS13.setAccessibleText(SS14AccessibleText);

            SS14.setAccessibleText("0");
            ((ImageView) SS14).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS15.getAccessibleText().equals("0")){

            ((ImageView) SS15).setImage(SS14Image);
            SS15.setAccessibleText(SS14AccessibleText);

            SS14.setAccessibleText("0");
            ((ImageView) SS14).setImage(new Image("file: P3-Backdrop.png"));

        }
        else{
            EndStatement.setText("Incorrect input");
        }

    }

    @FXML
    void S15Click(MouseEvent event) {
        Image SS15Image = ((ImageView) SS15).getImage();
        String SS15AccessibleText = SS15.getAccessibleText();

        if (SS11.getAccessibleText().equals("0")){

            ((ImageView) SS11).setImage(SS15Image);
            SS11.setAccessibleText(SS15AccessibleText);

            SS15.setAccessibleText("0");
            ((ImageView) SS15).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS14.getAccessibleText().equals("0")){

            ((ImageView) SS14).setImage(SS15Image);
            SS14.setAccessibleText(SS15AccessibleText);

            SS15.setAccessibleText("0");
            ((ImageView) SS15).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS16.getAccessibleText().equals("0")){

            ((ImageView) SS16).setImage(SS15Image);
            SS16.setAccessibleText(SS15AccessibleText);

            SS15.setAccessibleText("0");
            ((ImageView) SS15).setImage(new Image("file: P3-Backdrop.png"));

        }
        else{
            EndStatement.setText("Incorrect input");
        }

    }

    @FXML
    void S16Click(MouseEvent event) {
        Image SS16Image = ((ImageView) SS16).getImage();
        String SS16AccessibleText = SS16.getAccessibleText();

        if (SS12.getAccessibleText().equals("0")){

            ((ImageView) SS12).setImage(SS16Image);
            SS12.setAccessibleText(SS16AccessibleText);

            SS16.setAccessibleText("0");
            ((ImageView) SS16).setImage(new Image("file: P3-Backdrop.png"));

        }
        else if (SS15.getAccessibleText().equals("0")){

            ((ImageView) SS15).setImage(SS16Image);
            SS15.setAccessibleText(SS16AccessibleText);

            SS16.setAccessibleText("0");
            ((ImageView) SS16).setImage(new Image("file: P3-Backdrop.png"));

        }
        else{
            EndStatement.setText("Incorrect input");
        }

    }

}


