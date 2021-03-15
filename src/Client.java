public class Client {
	public static void main(String[] args) {
	ARD ar = new ARD();
	KIKA ki = new KIKA();
	Netflix net = new Netflix();
	DMAX dm = new DMAX();

	Kind k = new Kind();
	k.setStream(new KIKAstream(ki));
	k.streamGo("Bugs Bunny");
	
	k.setStream(new NetflixStream(net));
	k.streamGo("Little Angels");
	
	Erwachsener er = new Erwachsener();
	er.setStream(new ARDstream(ar));
	er.streamGo("Bear Grills");
	
	Jugend ju = new Jugend();
	ju.setStream(new DMAXStream(dm));
	ju.streamGo("Assi TV");
	
	Alte a = new Alte();
	a.setStream(new NetflixStream(net));
	a.streamGo("alte Leute zeugs");
	}
}
