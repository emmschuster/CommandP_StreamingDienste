public class Kind {
private StreamingDienst streaming;
    
    public void setStream(StreamingDienst x) {
        this.streaming = x;
    }

    public void streamGo(String y){
        streaming.choose(y);
    }
}
