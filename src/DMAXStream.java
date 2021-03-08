public class DMAXStream implements StreamingDienst{
	private DMAX stream;
	@Override
	public void choose(String x) {
		stream.watch(x);
	}
	public DMAXStream(DMAX x) {
		this.stream=x;
	}
}