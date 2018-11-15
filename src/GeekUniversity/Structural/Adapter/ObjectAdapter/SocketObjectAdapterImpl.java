package GeekUniversity.Structural.Adapter.ObjectAdapter;

import GeekUniversity.Structural.Adapter.Socket;
import GeekUniversity.Structural.Adapter.SocketAdapter;
import GeekUniversity.Structural.Adapter.Volt;

public class SocketObjectAdapterImpl implements SocketAdapter {
    Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt,10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt,40);
    }

    private Volt convertVolt (Volt volt,int i){
        return new Volt(volt.getVolts()/i);
    }
}
