public class NetflixStream implements StreamingDienst{
	private Netflix stream;
	@Override
	public void choose(String x) {
		stream.watch(x);
		stream.pwd(); 
	}
	public NetflixStream(Netflix x) {
		this.stream=x;
	}
}

