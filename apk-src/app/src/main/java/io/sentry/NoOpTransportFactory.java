package io.sentry;

import io.sentry.transport.ITransport;
import io.sentry.transport.NoOpTransport;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpTransportFactory implements ITransportFactory {
    private static final NoOpTransportFactory instance = new NoOpTransportFactory();

    private NoOpTransportFactory() {
    }

    public static NoOpTransportFactory getInstance() {
        return instance;
    }

    @Override // io.sentry.ITransportFactory
    @NotNull
    public ITransport create(@NotNull SentryOptions sentryOptions, @NotNull RequestDetails requestDetails) {
        return NoOpTransport.getInstance();
    }
}
