module com.digitalpetri.modbus.slave {
    requires transitive com.digitalpetri.modbus.core;
    requires transitive com.digitalpetri.modbus.codec;
    requires transitive com.codahale.metrics;

    requires transitive io.netty.handler;
    requires org.slf4j;

    exports com.digitalpetri.modbus.slave;
}
