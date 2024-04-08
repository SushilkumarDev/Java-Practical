import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TTS {

    public static void main(String[] args) {
        // Set up a voice
        VoiceManager voiceManager = VoiceManager.getInstance();
        Voice voice = voiceManager.getVoice("kevin16");
        
        // Check if voice is available
        if (voice == null) {
            System.err.println("Cannot find a voice named kevin16. Please specify a valid voice.");
            System.exit(1);
        }
        
        // Allocate the resources for the voice
        voice.allocate();
        
        // Speak the text
        String text = "Hello, world! This is a text-to-speech conversion example.";
        voice.speak(text);
        
        // Deallocate the resources
        voice.deallocate();
    }
}
