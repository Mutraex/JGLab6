
/**
 *
 * @author Mutraex
 */
public abstract class ResponsibilityDecorator {
    String responsibility;
    public ResponsibilityDecorator(){
        
    }
    public void decorate(SalariedEmployee emp){
        emp.description.add(responsibility);
    }
}
