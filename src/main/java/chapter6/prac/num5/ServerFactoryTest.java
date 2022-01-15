package chapter6.prac.num5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServerFactoryTest {

    @Test
    void testSomething(){
        UseServer useServer = new UseServer();
        useServer.doSomething();
        DummyServer server = (DummyServer) useServer.getServer();
        assertEquals("invoked",server.getResult());
    }

    @BeforeEach
    void setUp() {
        ServerFactory.setServer(new ServerProvider() {
            @Override
            public Server getServer() {
                return new DummyServer();
            }
        });
    }
}


