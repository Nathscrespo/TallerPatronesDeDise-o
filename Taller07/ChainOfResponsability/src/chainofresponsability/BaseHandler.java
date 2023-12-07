
package chainofresponsability;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class BaseHandler implements IHandler{
      private IHandler nextHandler;

    @Override
    public void setNext(IHandler nextHandler) {
      this.nextHandler=nextHandler;
    }

    @Override
    public void handlerRequest() {
        //logic
    }
      
      
}
