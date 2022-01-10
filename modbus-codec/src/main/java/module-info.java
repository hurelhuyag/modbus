module com.digitalpetri.modbus.codec {
    requires transitive com.digitalpetri.modbus.core;
    requires transitive io.netty.common;
    requires transitive io.netty.transport;
    requires transitive io.netty.buffer;
    requires transitive io.netty.codec;
    requires org.slf4j;

    exports com.digitalpetri.modbus.codec;
}
