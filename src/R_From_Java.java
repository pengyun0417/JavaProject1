import org.rosuda.REngine.*;
import org.rosuda.REngine.Rserve.*;

public class R_From_Java {
    public static void main(String[] args) throws RserveException, REXPMismatchException {
        try {
            RConnection c = new RConnection();// make a new local connection on default port (6311)
            double d[] = c.eval("rnorm(10)").asDoubles();
        
            REXP m = c.eval("matrix(sample(0:1,100, rep=T),ncol=10)");
            System.out.println(m.asString());
            org.rosuda.REngine.REXP x0 = c.eval("R.version.string");
            try {
				System.out.println(x0.asString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
} catch (REngineException e) {
            //manipulation
        }       

    }
}
