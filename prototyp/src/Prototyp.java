

public class Prototyp {

    public class Cookie implements Cloneable {

        public Object clone() {
            try {
                Cookie copy = (Cookie)super.clone();

                return copy;

            }
            catch(CloneNotSupportedException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /** Concrete Prototypes to clone **/
    public static class CoconutCookie { }

    /** Client Class**/
    public class CookieMachine {

        private Cookie cookie;//could have been a private Cloneable cookie;

        public CookieMachine(Cookie cookie) {
            this.cookie = cookie;
        }
        public Cookie makeCookie() {
            return (Cookie)cookie.clone();
        }
        public void main(String[] args) {
            Cookie tempCookie =  null;
            Cookie prot = new Cookie();
            CookieMachine cm = new CookieMachine(prot);
            for (int i=0; i<100; i++)
                tempCookie = cm.makeCookie();
        }
    }
}
