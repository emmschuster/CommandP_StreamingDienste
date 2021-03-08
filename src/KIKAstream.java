public class KIKAstream implements StreamingDienst{
	private KIKA stream;
	@Override
	public void choose(String x) {
		stream.watch(x);
		stream.sleep(); 
	}
	public KIKAstream(KIKA x) {
		this.stream=x;
	}

}


