package rs.raf.pds.v4.z5.messages;

import java.util.ArrayList;
import java.util.List;

import com.esotericsoftware.kryo.Kryo;

public class KryoUtil {
	public static void registerKryoClasses(Kryo kryo) {
		kryo.register(String.class);
		kryo.register(String[].class);
		kryo.register(ArrayList.class);
		kryo.register(Login.class);
		kryo.register(ChatMessage.class);
		kryo.register(WhoRequest.class);
		kryo.register(ListUsers.class);
		kryo.register(InfoMessage.class);
		kryo.register(PrivateMessage.class);
		
	}
}
