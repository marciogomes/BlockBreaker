/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.eco405.blockbreaker.visual;

import java.io.*;
import javax.sound.sampled.*;

/**
 *
 * @author Márcio
 */
public enum SoundEffects {

    EXPLODE("res/sons/explode.wav"),
    BLOCO_IND_HIT("res/sons/bloco_ind_hit.wav"),
    BALL("res/sons/ball.wav"),
    LIFE_LOST("res/sons/life_lost.wav"),
    GAME_OVER("res/sons/game_over.wav"),
    OPENING("res/sons/opening.wav"),
    WIN("res/sons/win.wav"),
    POWER("res/sons/power.wav"),
    MENU_CLICK("res/sons/menu_click.wav"),
    MENU_ENTER("res/sons/menu_enter.wav");

    // Nested class for specifying volume
    public static enum Volume {

        MUTE, LOW, MEDIUM, HIGH
    }

    public static Volume volume = Volume.LOW;

    // Each sound effect has its own clip, loaded with its own sound file.
    private Clip clip;

    // Constructor to construct each element of the enum with its own sound file.
    SoundEffects(String soundFileName) {
        try {
            // Use URL (instead of File) to read from disk and JAR.
            //URL url = this.getClass().getClassLoader().getResource(soundFileName);
            File soundFile = new File(soundFileName);
            // Set up an audio input stream piped from the sound file.
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
            // Get a clip resource.
            clip = AudioSystem.getClip();
            // Open audio clip and load samples from the audio input stream.
            clip.open(audioInputStream);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    // Play or Re-play the sound effect from the beginning, by rewinding.
    public void play() {
        if (volume != Volume.MUTE) {
            if (clip.isRunning()) {
                clip.stop();   // Stop the player if it is still running
            }
            clip.setFramePosition(0); // rewind to the beginning
            clip.start();     // Start playing
        }
    }
    
    public void playLoop() {
        if (volume != Volume.MUTE) {
            if (clip.isRunning()) {
                clip.stop();   
            }
            clip.setFramePosition(0);
            clip.loop(Clip.LOOP_CONTINUOUSLY);    
        }
    }

    // Optional static method to pre-load all the sound files.
    static void init() {
        values(); // calls the constructor for all the elements
    }
}
