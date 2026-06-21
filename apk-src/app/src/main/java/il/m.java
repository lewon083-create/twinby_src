package il;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f21385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f21386b;

    public m(l socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f21385a = socketAdapterFactory;
    }

    @Override // il.n
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f21385a.a(sslSocket);
    }

    @Override // il.n
    public final boolean b() {
        return true;
    }

    @Override // il.n
    public final String c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        n nVarE = e(sslSocket);
        if (nVarE != null) {
            return nVarE.c(sslSocket);
        }
        return null;
    }

    @Override // il.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        n nVarE = e(sslSocket);
        if (nVarE != null) {
            nVarE.d(sslSocket, str, protocols);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f21386b == null && this.f21385a.a(sSLSocket)) {
                this.f21386b = this.f21385a.b(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f21386b;
    }
}
