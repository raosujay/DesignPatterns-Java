adapter mode

The Adapter Pattern serves as a bridge between two incompatible interfaces. This type of design pattern is a structural pattern, which combines the functionality of two independent interfaces.

This pattern involves a single class that is responsible for adding independent or incompatible interface functionality. To give a real example, the card reader acts as an adapter between the memory card and the notebook. You insert the memory card into the card reader, then insert the card reader into the notebook, so that the memory card can be read through the notebook.

We demonstrate the use of the adapter pattern through the following example. Among them, the audio player device can only play mp3 files, by using a more advanced audio player to play vlc and mp4 files.
introduce

Intent: Convert the interface of a class into another interface that the customer wants. The Adapter pattern enables classes to work together that would otherwise not work together due to incompatible interfaces.

Main solution: The main solution is that in software systems, it is often necessary to put some "existing objects" into a new environment, and the interfaces required by the new environment cannot be satisfied by the existing objects.

When to use: 1. The system needs to use existing classes, but the interface of this class does not meet the needs of the system. 2. You want to create a class that can be reused to work with some classes that are not much related to each other, including some classes that may be introduced in the future. These source classes do not necessarily have consistent interfaces. 3. Insert one class into another class through interface conversion. (For example, tigers and birds now have a flying tiger. Without the need to add entities, add an adapter to contain a tiger object and implement the flying interface.)

How to solve: inheritance or dependency (recommended).

Key code: The adapter inherits or relies on existing objects to achieve the desired target interface.

Application examples: 1. American electrical appliances are 110V and China is 220V. An adapter is required to convert 110V into 220V. 2. JAVA JDK 1.1 provides the Enumeration interface, and 1.2 provides the Iterator interface. If you want to use the 1.2 JDK, you must convert the Enumeration interface of the previous system into the Iterator interface. In this case, the adapter mode is required. 3. Run the WINDOWS program on LINUX. 4. jdbc in JAVA.

Advantages: 1. Any two unrelated classes can be run together. 2. Improved class reuse. 3. Increased the transparency of the class. 4. Good flexibility.

Disadvantages: 1. Excessive use of adapters will make the system very messy and difficult to grasp as a whole. For example, it is obvious that the A interface is called, but in fact it is internally adapted to the implementation of the B interface. If this happens too much in a system, it will be tantamount to a disaster. Therefore, if it is not necessary, you can reconstruct the system directly without using the adapter. 2. Since JAVA inherits at most one class, it can only adapt to at most one adapter class, and the target class must be an abstract class.

Usage scenario: If you are motivated to modify the interface of a normally running system, you should consider using the adapter pattern.

Note: The adapter is not added during detailed design, but to solve the problem of the project in service.
accomplish

We have a MediaPlayer interface and an entity class AudioPlayer that implements the MediaPlayer interface. By default, AudioPlayer can play audio files in mp3 format.

We have another interface AdvancedMediaPlayer and entity classes that implement AdvancedMediaPlayer interface. This class can play files in vlc and mp4 formats.

We want AudioPlayer to play audio files in other formats. In order to achieve this function, we need to create an adapter class MediaAdapter that implements the MediaPlayer interface and use the AdvancedMediaPlayer object to play the required format.

AudioPlayer uses the adapter class MediaAdapter to pass the required audio type without needing to know the actual class that can play audio in the required format. AdapterPatternDemo, our demo class uses the AudioPlayer class to play various formats.
UML diagram of adapter pattern
step 1

Create interfaces for media players and more advanced media players.

MediaPlayer.java

public interface MediaPlayer {
    public void play(String audioType, String fileName);
}

AdvancedMediaPlayer.java

public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}

Step 2

Create an entity class that implements the AdvancedMediaPlayer interface.

VlcPlayer.java

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
       System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
       //do nothing
    }
}

Mp4Player.java

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
       //do nothing
    }
    @Override
    public void playMp4(String fileName) {
       System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}

Step 3

Create an adapter class that implements the MediaPlayer interface.

MediaAdapter.java

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;
    public MediaAdapter(String audioType){
       if(audioType.equalsIgnoreCase("vlc") ){
          advancedMusicPlayer = new VlcPlayer();
       } else if (audioType.equalsIgnoreCase("mp4")){
          advancedMusicPlayer = new Mp4Player();
       }
    }

    @Override
    public void play(String audioType, String fileName) {
       if(audioType.equalsIgnoreCase("vlc")){
          advancedMusicPlayer.playVlc(fileName);
       }else if(audioType.equalsIgnoreCase("mp4")){
          advancedMusicPlayer.playMp4(fileName);
       }
    }
}

Step 4

Create an entity class that implements the MediaPlayer interface.

AudioPlayer.java

public class AudioPlayer implements MediaPlayer {
  MediaAdapter mediaAdapter;
  @Override
  public void play(String audioType, String fileName) {
    //Built-in support for playing mp3 music files
    if (audioType.equalsIgnoreCase("mp3")) {
      System.out.println("Playing mp3 file. Name: " + fileName);
    }
    //mediaAdapter provides support for playing other file formats
    else if (audioType.equalsIgnoreCase("vlc") ||
      audioType.equalsIgnoreCase("mp4")) {
      mediaAdapter = new MediaAdapter(audioType);
      mediaAdapter.play(audioType, fileName);
    } else {
      System.out.println("Invalid media. " +
        audioType + " format not supported");
    }
  }
}

Step 5

Use AudioPlayer to play different types of audio formats.

AdapterPatternDemo.java

public class AdapterPatternDemo {
    public static void main(String[] args) {
       AudioPlayer audioPlayer = new AudioPlayer();
       audioPlayer.play("mp3", "beyond the horizon.mp3");
       audioPlayer.play("mp4", "alone.mp4");
       audioPlayer.play("vlc", "far far away.vlc");
       audioPlayer.play("avi", "mind me.avi");
    }
}

Step 6

Verify the output.

Playing mp3 file. Name: beyond the horizon.mp3
Playing mp4 file. Name: alone.mp4
Playing vlc file. Name: far far away.vlc
Invalid media. avi format not supported
