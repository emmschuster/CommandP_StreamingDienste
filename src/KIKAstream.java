public class KIKAstream implements StreamingDienst{
	private KIKA stream;
	@Override
	public void choose(String x) {
		stream.watch(x);
	}
	public KIKAstream(KIKA x) {
		this.stream=x;
	}

}


