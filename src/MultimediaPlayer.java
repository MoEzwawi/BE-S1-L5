import entities.*;

import java.util.Scanner;

public class MultimediaPlayer {
    public static void main(String[] args) {
        MultimediaElement[] contentsArray = new MultimediaElement[5];
        System.out.println("Welcome to Multimedia Player");
        Scanner input = new Scanner(System.in);
        for(int i=0;i<contentsArray.length;i++){
            String order = "";
            switch (i){
                case 0 -> order = "first";
                case 1 -> order = "second";
                case 2 -> order = "third";
                case 3 -> order = "fourth";
                case 4 -> order = "fifth";
            }
            System.out.println("Let's set the "+order+" media element");
            System.out.println("Press 1 for image, 2 for video or 3 for recording");
            int type = Integer.parseInt(input.nextLine());
            switch (type){
                case 1 -> {
                    contentsArray[i] = new Image("image"+(i+1));
                    System.out.println("Press 1 if you want to set a custom name for this image");
                    System.out.println("or press any other number to skip this phase");
                    int bool1 = Integer.parseInt(input.nextLine());
                    if(bool1==1) {
                        System.out.println("Please enter the custom name");
                        String name = input.nextLine();
                        contentsArray[i].setTitle(name);
                        System.out.println("Custom name set correctly");
                        if(contentsArray[i] instanceof Image){
                            System.out.println("Press 1 if you want to set a custom brightness level for this image");
                            System.out.println("or press any other number to skip this phase");
                            int bool2 = Integer.parseInt(input.nextLine());
                            if(bool2==1){
                                System.out.println("Please enter a number from 1 to 10");
                                int brightness = Integer.parseInt(input.nextLine());
                                ((Image) contentsArray[i]).setBrightness(brightness);
                                System.out.println("Brightness level set correctly");
                            }
                        }
                    }
                }
                case 2 -> {
                    contentsArray[i] = new Video("video"+(i+1),3);
                    System.out.println("Press 1 if you want to set a custom name for this video");
                    System.out.println("or press any other number to skip this phase");
                    int bool1 = Integer.parseInt(input.nextLine());
                    if(bool1==1) {
                        System.out.println("Please enter the custom name");
                        String name = input.nextLine();
                        contentsArray[i].setTitle(name);
                        System.out.println("Custom name set correctly");
                        if (contentsArray[i]instanceof Video){
                            System.out.println("Press 1 if you want to set a custom duration for this video");
                            System.out.println("or press any other number to skip this phase");
                            System.out.println("(you'll have a default duration of 3)");
                            int bool2 = Integer.parseInt(input.nextLine());
                            if(bool2==1){
                                System.out.println("Please enter a number from 1 to 10");
                                int duration = Integer.parseInt(input.nextLine());
                                ((Video) contentsArray[i]).setDuration(duration);
                                System.out.println("Duration set correctly");
                            }
                            System.out.println("Press 1 if you want to set a custom volume level for this video");
                            System.out.println("or press any other number to skip this phase");
                            System.out.println("(you'll have a default volume level of 5)");
                            int bool3 = Integer.parseInt(input.nextLine());
                            if(bool3==1){
                                System.out.println("Please enter a number from 1 to 10");
                                int volume = Integer.parseInt(input.nextLine());
                                ((Video) contentsArray[i]).setVolume(volume);
                                System.out.println("Volume level set correctly");
                            }
                            System.out.println("Press 1 if you want to set a custom brightness level for this video");
                            System.out.println("or press any other number to skip this phase");
                            System.out.println("(you'll have a default brightness level of 5)");
                            int bool4 = Integer.parseInt(input.nextLine());
                            if(bool4==1){
                                System.out.println("Please enter a number from 1 to 10");
                                int brightness = Integer.parseInt(input.nextLine());
                                ((Video) contentsArray[i]).setBrightness(brightness);
                                System.out.println("Brightness level set correctly");
                            }
                        }
                    }
                }
                case 3 -> {
                    contentsArray[i] = new AudioRecording("recording"+(i+1),3);
                    System.out.println("Press 1 if you want to set a custom name for this audio recording");
                    System.out.println("or press any other number to skip this phase");
                    int bool1 = Integer.parseInt(input.nextLine());
                    if(bool1==1) {
                        System.out.println("Please enter the custom name");
                        String name = input.nextLine();
                        contentsArray[i].setTitle(name);
                        System.out.println("Custom name set correctly");
                        if (contentsArray[i]instanceof AudioRecording){
                            System.out.println("Press 1 if you want to set a custom duration for this audio recording");
                            System.out.println("or press any other number to skip this phase");
                            System.out.println("(you'll have a default duration of 3)");
                            int bool2 = Integer.parseInt(input.nextLine());
                            if(bool2==1){
                                System.out.println("Please enter a number from 1 to 10");
                                int duration = Integer.parseInt(input.nextLine());
                                ((AudioRecording) contentsArray[i]).setDuration(duration);
                                System.out.println("Duration set correctly");
                            }
                            System.out.println("Press 1 if you want to set a custom volume level for this audio recording");
                            System.out.println("or press any other number to skip this phase");
                            System.out.println("(you'll have a default volume level of 5)");
                            int bool3 = Integer.parseInt(input.nextLine());
                            if(bool3==1) {
                                System.out.println("Please enter a number from 1 to 10");
                                int volume = Integer.parseInt(input.nextLine());
                                ((AudioRecording) contentsArray[i]).setVolume(volume);
                                System.out.println("Volume level set correctly");
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Now please choose a multimedia element to play");
        System.out.println("by typing a number from 1 to 5");
        System.out.println("(or press 0 to exit)");
        int contentChooser = Integer.parseInt(input.nextLine());
        while (contentChooser != 0){
                if (contentsArray[contentChooser-1] instanceof Image){
                    ((Image) contentsArray[contentChooser-1]).show();
                } else {
                    ((PlayableElement) contentsArray[contentChooser-1]).play();
                }
            System.out.println(" ");
            System.out.println("Please choose an other multimedia element to play");
            System.out.println("by typing a number from 1 to 5");
            System.out.println("(or press 0 to exit)");
            contentChooser = Integer.parseInt(input.nextLine());
        }
        input.close();
    }
}