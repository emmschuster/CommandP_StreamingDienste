public class Alte {
private StreamingDienst streaming;
    
    public void setStream(StreamingDienst x) {
        this.streaming = x;
    }

    public void streamGo(String y){
        streaming.choose(y);
    }
}
