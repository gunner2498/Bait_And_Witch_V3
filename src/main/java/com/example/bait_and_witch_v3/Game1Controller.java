package com.example.bait_and_witch_v3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Game1Controller {



    @FXML
    private ImageView ActiveSlot;

    @FXML
    private Label DialogueBox;

    @FXML
    private ImageView CastButton;

    @FXML
    private Label EndStatement;

    @FXML
    private ImageView StageG1;

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
    private ImageView Slot5;

    @FXML
    private ImageView Slot6;

    @FXML
    private ImageView Slot7;

    @FXML
    private ImageView Slot8;

    @FXML
    private ImageView Slot9;

    int FailCount = 0;
    int cont = 0;

    @FXML
    void CastClick(MouseEvent event) {
        if ((Slot1.getAccessibleText().equals("1") && Slot2.getAccessibleText().equals("2") && Slot3.getAccessibleText().equals("3") &&
                Slot4.getAccessibleText().equals("4") && Slot5.getAccessibleText().equals("5") && Slot6.getAccessibleText().equals("6") &&
                Slot7.getAccessibleText().equals("7") && Slot8.getAccessibleText().equals("8") && Slot9.getAccessibleText().equals("9"))) {
            StageG1.setVisible(true);
            DialogueBox.setVisible(true);
            StageG1.setImage(new Image(getClass().getResource("/assets/G1S.png").toString()));
            DialogueBox.setText("“Your form needs work, but your execution is acceptable. Well done.”");
            EndStatement.setText("Success");

            cont = 1;
        } else {
            StageG1.setVisible(true);
            DialogueBox.setVisible(true);
            FailCount++;
            Fail();
        }
    }

    void Fail() {
        if (FailCount == 1) {
            StageG1.setImage(new Image(getClass().getResource("/assets/G1F12.png").toString()));
            DialogueBox.setText("“Hmm…Try again.”");
        } else if (FailCount == 2) {
            StageG1.setImage(new Image(getClass().getResource("/assets/G1F12.png").toString()));
            DialogueBox.setText("“Remember to concentrate.”");
        } else if (FailCount == 3) {



            StageG1.setImage(new Image(getClass().getResource("/assets/G1F3.png").toString()));
            DialogueBox.setText("“We…are going to leave it there for today. Well done to…most of you.”");
            cont = 2;
        }
        else{
            cont = 2;
            CastButton.setDisable(true);
            EndStatement.setText("Failure");


        }
    }

    void returnToStage(boolean success) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Stage.fxml"));
            Stage stage = (Stage) StageG1.getScene().getWindow();


            Scene stageScene = new Scene(loader.load());
            stage.setScene(stageScene);


            StageController stageController = loader.getController();
            if (stageController != null) {
                stageController.updateGameResult(success);
            }
        } catch (IOException e) {
            e.printStackTrace();
            DialogueBox.setText("Error returning to the main stage.");
        }
    }


    @FXML
    void NextClick(MouseEvent event) {
        if (((FailCount == 3) && cont == 0) || ((FailCount == 0 && EndStatement.equals("Success")) )) {
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
        if(cont == 1) {
            returnToStage(true);
        }
        else if(cont == 2) {
            returnToStage(false);
        }
        else {
            StageG1.setVisible(false);
            DialogueBox.setVisible(false);
        }
    }

    @FXML
    void P1Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP1-1.png").toString()));
        ActiveSlot.setAccessibleText("1");

    }

    @FXML
    void P2Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP1-2.png").toString()));
        ActiveSlot.setAccessibleText("2");

    }

    @FXML
    void P3Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP1-3.png").toString()));
        ActiveSlot.setAccessibleText("3");

    }

    @FXML
    void P4Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP1-4.png").toString()));
        ActiveSlot.setAccessibleText("4");

    }

    @FXML
    void P5Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP1-5.png").toString()));
        ActiveSlot.setAccessibleText("5");

    }

    @FXML
    void P6Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP1-6.png").toString()));
        ActiveSlot.setAccessibleText("6");

    }

    @FXML
    void P7Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP1-7.png").toString()));
        ActiveSlot.setAccessibleText("7");

    }

    @FXML
    void P8Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP1-8.png").toString()));
        ActiveSlot.setAccessibleText("8");

    }

    @FXML
    void P9Click(MouseEvent event) {
        ActiveSlot.setImage(new Image(getClass().getResource("/assets/PP1-9.png").toString()));
        ActiveSlot.setAccessibleText("9");

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
    void S5Click(MouseEvent event) {
        Image activeImage = ActiveSlot.getImage();
        Slot5.setImage(activeImage);
        Slot5.setAccessibleText(ActiveSlot.getAccessibleText());
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

    @FXML
    void S9Click(MouseEvent event) {
        Image activeImage = ActiveSlot.getImage();
        Slot9.setImage(activeImage);
        Slot9.setAccessibleText(ActiveSlot.getAccessibleText());
    }


}
