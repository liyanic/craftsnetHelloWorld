package ch.simpleclient;

import de.craftsblock.craftsnet.api.websocket.SocketExchange;
import de.craftsblock.craftsnet.api.websocket.SocketHandler;
import de.craftsblock.craftsnet.api.websocket.WebSocketClient;
import de.craftsblock.craftsnet.api.websocket.WebSocketServer;
import de.craftsblock.craftsnet.api.websocket.annotations.Socket;

import java.io.IOException;

@Socket("/test/")
public class SocketHelper implements SocketHandler {

    @Socket("api")
    public void onMessage(SocketExchange exchange, String message) {
        WebSocketClient client = exchange.client();
        WebSocketServer server = exchange.server();

        client.sendMessage("Hello World!");

    }

}
