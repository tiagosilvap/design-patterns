package delegation.comdelegation.conversor;

import delegation.comdelegation.Moeda;

import java.util.EnumMap;

public class Factory {
    
    private final EnumMap<Moeda, Conversor> factoryMap;
    
    public Factory() {
        factoryMap = new EnumMap<>(Moeda.class);
        factoryMap.put(Moeda.DOLAR, new DolarConverter());
        factoryMap.put(Moeda.EURO, new EuroConverter());
    }
    
    public Conversor getConversor(Moeda moeda) {
        return factoryMap.get(moeda);
    }
}
