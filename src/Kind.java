public class Kind {
private StreamingDienst streaming;
    
    //Aufrufer wird mit dem konkreten DruckBefehl über einen Setter geladen
    //Alternative: Konstruktor
    public void setStream(StreamingDienst x) {
        this.streaming = x;
    }

    public void streamGo(String y){
        streaming.choose(y);
    }
}
