public class Erwachsener {
private StreamingDienst streaming;
    
    public void setStream(StreamingDienst x) {
    	System.out.println("Viel Vernügen beim schauen! \n");
        this.streaming = x;
    }

    public void streamGo(String y){
        streaming.choose(y);
    }
}
