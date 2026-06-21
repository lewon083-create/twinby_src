package e4;

import ad.b1;
import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Charset f16219h = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1.e f16220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m4.n f16221c = new m4.n("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f16222d = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f16223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Socket f16224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f16225g;

    public z(a1.e eVar) {
        this.f16220b = eVar;
    }

    public final void a(Socket socket) {
        this.f16224f = socket;
        this.f16223e = new y(this, socket.getOutputStream());
        this.f16221c.f(new x(this, socket.getInputStream()), new wd.d(), 0);
    }

    public final void b(b1 b1Var) {
        this.f16223e.getClass();
        y yVar = this.f16223e;
        yVar.getClass();
        yVar.f16218d.post(new e1.y(yVar, new d8.k(a0.f16043h).d(b1Var).getBytes(f16219h), b1Var));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16225g) {
            return;
        }
        try {
            y yVar = this.f16223e;
            if (yVar != null) {
                yVar.close();
            }
            this.f16221c.e(null);
            Socket socket = this.f16224f;
            if (socket != null) {
                socket.close();
            }
            this.f16225g = true;
        } catch (Throwable th2) {
            this.f16225g = true;
            throw th2;
        }
    }
}
