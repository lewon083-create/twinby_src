package io.sentry.transport;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpTransportGate implements ITransportGate {
    private static final NoOpTransportGate instance = new NoOpTransportGate();

    private NoOpTransportGate() {
    }

    public static NoOpTransportGate getInstance() {
        return instance;
    }

    @Override // io.sentry.transport.ITransportGate
    public boolean isConnected() {
        return true;
    }
}
