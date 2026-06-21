package io.sentry;

import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface IConnectionStatusProvider extends Closeable {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum ConnectionStatus {
        UNKNOWN,
        CONNECTED,
        DISCONNECTED,
        NO_PERMISSION
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface IConnectionStatusObserver {
        void onConnectionStatusChanged(@NotNull ConnectionStatus connectionStatus);
    }

    boolean addConnectionStatusObserver(@NotNull IConnectionStatusObserver iConnectionStatusObserver);

    @NotNull
    ConnectionStatus getConnectionStatus();

    @Nullable
    String getConnectionType();

    void removeConnectionStatusObserver(@NotNull IConnectionStatusObserver iConnectionStatusObserver);
}
