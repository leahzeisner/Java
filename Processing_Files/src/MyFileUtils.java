import com.leah.exceptions.FooRuntimeException;

public class MyFileUtils {
	
	public int subtractTenFromLargerNum(int num) throws Exception {
		
		if (num < 10) {
			throw new FooRuntimeException("Number must be greater than or equal to 10.");
		}
		
		return num - 10;		
	}
}
