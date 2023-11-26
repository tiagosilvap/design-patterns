package delegation.comdelegation.conversor;

public class DolarConverter implements Conversor {
    public Double converter(Double valor) {
        return valor * 3.66;
    }
}
