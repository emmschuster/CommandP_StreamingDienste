public class Kind {
private StreamingDienst streaming;
    
    //Aufrufer wird mit dem konkreten DruckBefehl �ber einen Setter geladen
    //Alternative: Konstruktor
    public void setStream(StreamingDienst x) {
        this.streaming = x;
    }

    public void streamGo(String y){
        streaming.choose(y);
    }
}
