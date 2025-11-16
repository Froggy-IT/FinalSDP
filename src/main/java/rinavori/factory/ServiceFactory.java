package rinavori.factory;
public class ServiceFactory {
    public StreamingService getService(String type) {
        if ("premium".equalsIgnoreCase(type)) return new PremiumService();
        return new FreeService();
    }
}
