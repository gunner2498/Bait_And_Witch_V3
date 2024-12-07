package com.example.bait_and_witch_v3;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.text.Text;

import javax.swing.*;
import java.io.IOException;


public class StageController {



    int ScriptPlace = 0;
    int currentGame;

    @FXML
    private ImageView CenterStage;

    @FXML
    private Label DialogueBox;

    @FXML
    private ImageView NextBTN;

    @FXML
    void ScriptClick(MouseEvent event) {
        ScriptPlace++;
        Script();
    }

    void Script(){


        switch (ScriptPlace) {
            case 1:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set15.png").toString()));
                DialogueBox.setText("Adipompen, Academy of the Arcane School for the magically gifted");
                break;
            case 2:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set32.png").toString()));
                DialogueBox.setText("Where many of the world’s greatest witches and warlocks develop their talent");
                break;
            case 3:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set16.png").toString()));
                DialogueBox.setText("And grow their power");
                break;
            case 4:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set17.png").toString()));
                DialogueBox.setText("“That’s the one I was talking about”");
                return;
            case 5:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set18.png").toString()));
                DialogueBox.setText("“She’s a sweet girl, she’s just…not very talented.”");
                break;
            case 6:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set18.png").toString()));
                DialogueBox.setText("“I don’t know if she’s lazy or just not very bright…”");
                break;
            case 7:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set17.png").toString()));
                DialogueBox.setText("“I have her this term. I’ll get her into shape in no time.”");
                break;
            case 8:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set13.png").toString()));
                DialogueBox.setText(" ");
                break;
            case 9:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set33.png").toString()));
                DialogueBox.setText("This time will be different.");
                break;
            case 10:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set19.png").toString()));
                DialogueBox.setText("I can do this.");
                break;
            case 11:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set4.png").toString()));
                DialogueBox.setText("“Attention students. Welcome to another term at Adipompen, Academy of the Arcane.”");
                break;
            case 12:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set4.png").toString()));
                DialogueBox.setText("“I trust you are all eager to begin, so we will start right away.”");
                break;
            case 13:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set14.png").toString()));
                DialogueBox.setText("“We will begin with a light enchantment. A very simple spell.”");
                break;
            case 14:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set14.png").toString()));
                DialogueBox.setText("“To execute this spell, you must envision the rune clearly in your mind.”");
                break;
            case 15:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set6.png").toString()));
                DialogueBox.setText("“You must concentrate. Do not get distracted, Stay focused as you envision the rune.”");
                break;
            case 16:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set20.png").toString()));
                DialogueBox.setText("“You may now begin your attempts.”");
                break;
            case 17:
                OpenGame1();
                break;
            case 18:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set34.png").toString()));
                DialogueBox.setText(" ");
                break;
            case 19:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set35.png").toString()));
                DialogueBox.setText(" ");
                break;
            case 20:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set11.png").toString()));
                DialogueBox.setText("“Today, you all will be learning how to summon your familiars.”");
                break;
            case 21:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set28.png").toString()));
                DialogueBox.setText("“Your familiar is an embodiment of your magic, helping you concentrate your power and providing companionship.”");
                break;
            case 22:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set36.png").toString()));
                DialogueBox.setText(" ");
                break;
            case 23:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set36.png").toString()));
                DialogueBox.setText("“You should have reviewed this chapter last night.”");
                break;
            case 24:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set3.png").toString()));
                DialogueBox.setText("“You will arrange the materials provided on the table, like so, to begin the ritual. We will go one at a time.”");
                break;
            case 25:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set37.png").toString()));
                DialogueBox.setText(" ");
                break;
            case 26:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set38.png").toString()));
                DialogueBox.setText(" ");
                break;
            case 27:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set29.png").toString()));
                DialogueBox.setText("“Ms. Morgana, it is your turn.”");
                break;
            case 28:
                 OpenGame2();
                break;
            case 29:
                CenterStage.setImage(new Image(getClass().getResource("/assets/G2S2.png").toString()));
                DialogueBox.setText(" ");
                break;
            case 30:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set34.png").toString()));
                DialogueBox.setText(" ");
                break;
            case 31:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set39.png").toString()));
                DialogueBox.setText("“The objective for this evening is to create a vial of moon water.”");
                break;
            case 32:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set40.png").toString()));
                DialogueBox.setText("“Concentrate on the moon and call down her energy to enchant your vial.”");
                break;
            case 33:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set41.png").toString()));
                DialogueBox.setText("“You will know you are successful when the vial glows from the enchantment.”");
                break;
            case 34:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set42.png").toString()));
                DialogueBox.setText("“Concentrate on the moon. When you are ready, you may begin.”");
                break;
            case 35:
                OpenGame3();
                break;
            case 36:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set43.png").toString()));
                DialogueBox.setText("The End");
                break;
            case 37:
                CenterStage.setImage(new Image(getClass().getResource("/assets/Set44.png").toString()));
                DialogueBox.setText(" ");
                break;
            default:
                // If script exceeds the available cases, reset or end the script
                DialogueBox.setText("The script has ended.");
                break;



            }

        }

    public void updateGameResult(boolean success) {
        if (success) {
            DialogueBox.setText("Game 1 completed successfully! Proceeding...");
            ScriptPlace = 18; // Set to the next case after Game 1 success
        }
        else {
            DialogueBox.setText("Game 1 failed. Moving on...");
            ScriptPlace = 18; // Or another appropriate value if failure has a different branch
        }
        Script(); // Automatically continue the script after updating ScriptPlace
    }

    public void updateGameResult2(boolean success2) {
        if (success2) {
            DialogueBox.setText("Game 2 completed successfully! Proceeding...");
            ScriptPlace = 29; // Set to the next case after Game 1 success
        }
        else {
            DialogueBox.setText("Game 2 failed. Moving on...");
            ScriptPlace = 30; // Or another appropriate value if failure has a different branch
        }
        Script(); // Automatically continue the script after updating ScriptPlace
    }

    public void updateGameResult3(boolean success3) {
        if (success3) {
            DialogueBox.setText("Game 3 completed successfully! Proceeding...");
            ScriptPlace = 36; // Set to the next case after Game 1 success
        }
        else {
            DialogueBox.setText("Game 3 failed. Moving on...");
            ScriptPlace = 36; // Or another appropriate value if failure has a different branch
        }
        Script(); // Automatically continue the script after updating ScriptPlace
    }






    void OpenGame1() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Game1.fxml"));
            Scene game1Scene = new Scene(loader.load());
            Stage currentStage = (Stage) NextBTN.getScene().getWindow();
            currentStage.close();
            Stage newStage = new Stage();
            newStage.setScene(game1Scene);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            DialogueBox.setText("Error loading Game1 scene.");
        }
    }
    void OpenGame2() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Game2.fxml"));
            Scene game2Scene = new Scene(loader.load());
            Stage currentStage = (Stage) NextBTN.getScene().getWindow();
            currentStage.close();
            Stage newStage = new Stage();
            newStage.setScene(game2Scene);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            DialogueBox.setText("Error loading Game2 scene.");
        }
    }
    void OpenGame3() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Game3.fxml"));
            Scene game3Scene = new Scene(loader.load());
            Stage currentStage = (Stage) NextBTN.getScene().getWindow();
            currentStage.close();
            Stage newStage = new Stage();
            newStage.setScene(game3Scene);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            DialogueBox.setText("Error loading Game3 scene.");
        }
    }


}