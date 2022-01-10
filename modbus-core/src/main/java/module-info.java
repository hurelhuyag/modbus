module com.digitalpetri.modbus.core {
    requires java.base;
    requires transitive io.netty.buffer;
    requires org.slf4j;

    exports com.digitalpetri.modbus;
    exports com.digitalpetri.modbus.requests;
    exports com.digitalpetri.modbus.responses;
}
