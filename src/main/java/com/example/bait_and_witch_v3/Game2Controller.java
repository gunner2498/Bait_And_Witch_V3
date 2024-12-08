package com.example.bait_and_witch_v3;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Game2Controller {

    @FXML
    private ImageView ActiveSlot;

    @FXML
    private ImageView CastButton;

    @FXML
    private Label DialogueBox;

    @FXML
    private Label EndStatement;

    @FXML
    private ImageView NextButton;

    @FXML
    private ImageView Slot1;

    @FXML
    private ImageView Slot2;

    @FXML
    private ImageView Slot3;

    @FXML
    private ImageView Slot4;

    @FXML
    private ImageView Slot6;

    @FXML
    private ImageView Slot7;

    @FXML
    private ImageView Slot8;

    @FXML
    private ImageView Slot9;

    @FXML
    private ImageView StageG2;

    int FailCount = 0;
    int cont = 0;



    @FXML
    void CastClick(MouseEvent event) { // enter button to see if puzzle is correct
        if ((Slot1.getAccessibleText().equals("4") && Slot2.getAccessibleText().equals("4") && Slot3.getAccessibleText().equals("4") && Slot4.getAccessibleText().equals("4") && Slot9.getAccessibleText().equals("4") && Slot6.getAccessibleText().equals("4") && Slot7.getAccessibleText().equals("4") && Slot8.getAccessibleText().equals("4") && Slot9.getAccessibleText().equals("4"))){
            StageG2.setVisible(true);
            DialogueBox.setVisible(true);
            StageG2.setMouseTransparent(true);
            DialogueBox.setMouseTransparent(true);
            StageG2.setImage(new Image(getClass().getResource("/assets/G2S1.png").toString()));
            DialogueBox.setText("“Unorthodox methods…but congratulations.”");
            EndStatement.setText("Success");
            cont = 1;

        }
        else {
            StageG2.setVisible(true);
            DialogueBox.setVisible(true);
            FailCount++;
            Fail();
        }
    }

    void Fail(){ // fail handling for the three seperate fails allowed and then logic to send back to main stage
        if(FailCount == 1){
            StageG2.setImage(new Image(getClass().getResource("/assets/G2F1.png").toString()));
            DialogueBox.setText("“Concentrate harder, Ms. Morgana.”");

        }
        else if(FailCount == 2){
            StageG2.setImage(new Image(getClass().getResource("/assets/G2F2.png").toString()));
            DialogueBox.setText("“Are you even trying?”");

        }
        else if(FailCount == 3){

            StageG2.setImage(new Image(getClass().getResource("/assets/G2F3.png").toString()));
            DialogueBox.setText("“...It would be beneficial to actually study instead of being lazy. That will be all for today.”");
            cont = 2;
        }
        else{
            cont = 2;
            CastButton.setDisable(true);
            EndStatement.setText("Failure");



        }
    }

    @FXML
    void NextClick(MouseEvent event) {  // next button to get through cutscenes, send success/fail conditions through
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
            returnToStage2(true);
        }
        else if(cont == 2) {
            returnToStage2(false);
        }
        else {
            StageG2.setVisible(false);
            DialogueBox.setVisible(false);

        }
    }

    void returnToStage2(boolean success2) {//return to stage logic{
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Stage.fxml"));
            Stage stage = (Stage) StageG2.getScene().getWindow(); // Get current stage

            // Load the Stage scene
            Scene stageScene = new Scene(loader.load());
            stage.setScene(stageScene);

            // Access StageController and update the result
            StageController stageController = loader.getController();
            if (stageController != null) {
                stageController.updateGameResult2(success2);
            }
        } catch (IOException e) {
            e.printStackTrace();
            DialogueBox.setText("Error returning to the main stage.");
        }
    }
//Puzzle 2 logic/handling
    @FXML
    void G1Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP2-Gem1.png").toString()));
        ActiveSlot.setAccessibleText("1");

    }

    @FXML
    void G2Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP2-Gem2.png").toString()));
        ActiveSlot.setAccessibleText("1");

    }

    @FXML
    void G3Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP2-Gem3.png").toString()));
        ActiveSlot.setAccessibleText("1");

    }

    @FXML
    void G4Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP2-Gem4.png").toString()));
        ActiveSlot.setAccessibleText("1");

    }

    @FXML
    void G5Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP2-Gem5.png").toString()));
        ActiveSlot.setAccessibleText("1");

    }

    @FXML
    void G6Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP2-Gem6.png").toString()));
        ActiveSlot.setAccessibleText("1");

    }

    @FXML
    void G7Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP2-Gem7.png").toString()));
        ActiveSlot.setAccessibleText("1");

    }

    @FXML
    void G8Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP2-Gem8.png").toString()));
        ActiveSlot.setAccessibleText("1");

    }

    @FXML
    void O1Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP2-Odd1.png").toString()));
        ActiveSlot.setAccessibleText("4");

    }

    @FXML
    void O2Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP2-Odd2.png").toString()));
        ActiveSlot.setAccessibleText("4");

    }

    @FXML
    void O3Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP2-Odd3.png").toString()));
        ActiveSlot.setAccessibleText("4");

    }

    @FXML
    void O4Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP2-Odd4.png").toString()));
        ActiveSlot.setAccessibleText("4");

    }

    @FXML
    void O5Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP2-Odd5.png").toString()));
        ActiveSlot.setAccessibleText("4");

    }

    @FXML
    void O6Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP2-Odd6.png").toString()));
        ActiveSlot.setAccessibleText("4");

    }

    @FXML
    void O7Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP2-Odd7.png").toString()));
        ActiveSlot.setAccessibleText("4");

    }

    @FXML
    void O8Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP2-Odd8.png").toString()));
        ActiveSlot.setAccessibleText("4");

    }

    @FXML
    void S1Click(MouseEvent event) {
        Image activeImage = ActiveSlot.getImage();
        Slot1.setImage(activeImage);
        Slot1.setAccessibleText(ActiveSlot.getAccessibleText());
    }

    @FXML
    void S2Click(MouseEvent event) {
        Image activeImage = ActiveSlot.getImage();
        Slot2.setImage(activeImage);
        Slot2.setAccessibleText(ActiveSlot.getAccessibleText());

    }

    @FXML
    void S3Click(MouseEvent event) {
        Image activeImage = ActiveSlot.getImage();
        Slot3.setImage(activeImage);
        Slot3.setAccessibleText(ActiveSlot.getAccessibleText());
    }

    @FXML
    void S4Click(MouseEvent event) {
        Image activeImage = ActiveSlot.getImage();
        Slot4.setImage(activeImage);
        Slot4.setAccessibleText(ActiveSlot.getAccessibleText());
    }

    @FXML
    void S9Click(MouseEvent event) {
        Image activeImage = ActiveSlot.getImage();
        Slot9.setImage(activeImage);
        Slot9.setAccessibleText(ActiveSlot.getAccessibleText());
    }

    @FXML
    void S6Click(MouseEvent event) {
        Image activeImage = ActiveSlot.getImage();
        Slot6.setImage(activeImage);
        Slot6.setAccessibleText(ActiveSlot.getAccessibleText());
    }

    @FXML
    void S7Click(MouseEvent event) {
        Image activeImage = ActiveSlot.getImage();
        Slot7.setImage(activeImage);
        Slot7.setAccessibleText(ActiveSlot.getAccessibleText());
    }

    @FXML
    void S8Click(MouseEvent event) {
        Image activeImage = ActiveSlot.getImage();
        Slot8.setImage(activeImage);
        Slot8.setAccessibleText(ActiveSlot.getAccessibleText());
    }



}
