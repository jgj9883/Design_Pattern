package WardManagement;

import java.util.ArrayList;
/**
 *
 * @author HyunSung <gus005479@daum.net>
 */
abstract class Ward {    
    protected abstract void care();
    protected abstract ArrayList update(String id);
}
