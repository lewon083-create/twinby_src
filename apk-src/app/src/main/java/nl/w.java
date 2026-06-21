package nl;

import io.sentry.ProfilingTraceData;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Socket f29577m;

    public w(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f29577m = socket;
    }

    @Override // nl.e
    public final void j() {
        Socket socket = this.f29577m;
        try {
            socket.close();
        } catch (AssertionError e3) {
            if (!i0.o.y(e3)) {
                throw e3;
            }
            o.f29555a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e3);
        } catch (Exception e7) {
            o.f29555a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e7);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
