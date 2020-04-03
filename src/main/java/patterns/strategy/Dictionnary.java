package patterns.strategy;

public class Dictionnary {

    private ISpeak iSpeak;

    public void speak(){
        iSpeak.speak();
    }

    public void setLanguage(ISpeak iSpeak){
        this.iSpeak = iSpeak;
    }
}
