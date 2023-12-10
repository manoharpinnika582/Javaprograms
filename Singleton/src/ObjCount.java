
public class ObjCount {
	static int objCount=0;
	
	public ObjCount() {
		objCount++;
	}
	
	static public int displayCount() {
		return objCount;
	}
}
