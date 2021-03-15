public class ARDstream implements StreamingDienst{
	private ARD stream;
	@Override
	public void choose(String x) {
		stream.watch(x);
		stream.sleep(); 
	}
	public ARDstream(ARD x) {
		this.stream=x;
	}

}


