public class Client {
	ARD ar = new ARD();
	KIKA ki = new KIKA();
	Netflix net = new Netflix();
	DMAX dm = new DMAX();

	Kind k = new Kind();
	k.setStream(new KIKAstream(ki));
	k.streamGo();
}
