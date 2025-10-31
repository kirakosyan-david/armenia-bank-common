package am.armeniabank.armeniabankcommon.kafka.consumer;

public interface EventConsumer<E>{
    void handle(E e);
}
