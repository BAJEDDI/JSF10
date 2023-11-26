
import util.HibernateUtil;

/**
 *
 * @author USER
 */
public class Test {
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory().openSession();
    }
}

