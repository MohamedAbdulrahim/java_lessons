
package lec17v2;

public class MyButton {

    private ActionInterface/*Object or Generic*/ Ref = null; // Object will has code
    public void click(){
        Ref.save();
    }

    public ActionInterface getRef() {
        return Ref;
    }

    public void setRef(ActionInterface Ref) {
        this.Ref = Ref;
    }
    
}
