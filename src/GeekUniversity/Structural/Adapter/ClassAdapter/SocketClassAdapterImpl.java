package GeekUniversity.Structural.Adapter.ClassAdapter;

import GeekUniversity.Structural.Adapter.Socket;
import GeekUniversity.Structural.Adapter.SocketAdapter;
import GeekUniversity.Structural.Adapter.Volt;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = getVolt();
        return convertVolt(volt,10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = getVolt();
        return convertVolt(volt,40);
    }

    private Volt convertVolt (Volt volt,int i){
        return new Volt(volt.getVolts()/i);
    }
}
