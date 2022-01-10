module com.digitalpetri.modbus.master {
    requires transitive com.digitalpetri.modbus.core;
    requires transitive com.digitalpetri.modbus.codec;
    requires transitive strict.machine;
    requires transitive netty.channel.fsm;
    requires transitive com.codahale.metrics;

    requires transitive io.netty.common;
    requires transitive io.netty.transport;
    requires transitive io.netty.buffer;
    requires transitive io.netty.codec;
    requires transitive org.slf4j;

    exports com.digitalpetri.modbus.master;
}
