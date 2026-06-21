package gl;

import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f20275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f20276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f20277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f20278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f20279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f20280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20281h;
    public final w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v f20282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x f20283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f20284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f20285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IOException f20286n;

    public y(int i, q connection, boolean z5, boolean z10, zk.k kVar) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f20274a = i;
        this.f20275b = connection;
        this.f20279f = connection.f20236r.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f20280g = arrayDeque;
        this.i = new w(this, connection.f20235q.a(), z10);
        this.f20282j = new v(this, z5);
        this.f20283k = new x(this);
        this.f20284l = new x(this);
        if (kVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(kVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r3 = this;
            byte[] r0 = al.b.f1041a
            monitor-enter(r3)
            gl.w r0 = r3.i     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f20268c     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.f20271f     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            gl.v r0 = r3.f20282j     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f20263b     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.f20265d     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L37
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r3.h()     // Catch: java.lang.Throwable -> L18
            kotlin.Unit r2 = kotlin.Unit.f27471a     // Catch: java.lang.Throwable -> L18
            monitor-exit(r3)
            if (r0 == 0) goto L2d
            gl.b r0 = gl.b.CANCEL
            r1 = 0
            r3.c(r0, r1)
            return
        L2d:
            if (r1 != 0) goto L36
            gl.q r0 = r3.f20275b
            int r1 = r3.f20274a
            r0.h(r1)
        L36:
            return
        L37:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.y.a():void");
    }

    public final void b() throws IOException {
        v vVar = this.f20282j;
        if (vVar.f20265d) {
            throw new IOException("stream closed");
        }
        if (vVar.f20263b) {
            throw new IOException("stream finished");
        }
        if (this.f20285m != null) {
            IOException iOException = this.f20286n;
            if (iOException != null) {
                throw iOException;
            }
            b bVar = this.f20285m;
            Intrinsics.b(bVar);
            throw new d0(bVar);
        }
    }

    public final void c(b statusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(statusCode, "rstStatusCode");
        if (d(statusCode, iOException)) {
            q qVar = this.f20275b;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(statusCode, "statusCode");
            qVar.f20242x.k(this.f20274a, statusCode);
        }
    }

    public final boolean d(b bVar, IOException iOException) {
        byte[] bArr = al.b.f1041a;
        synchronized (this) {
            if (this.f20285m != null) {
                return false;
            }
            this.f20285m = bVar;
            this.f20286n = iOException;
            notifyAll();
            if (this.i.f20268c && this.f20282j.f20263b) {
                return false;
            }
            Unit unit = Unit.f27471a;
            this.f20275b.h(this.f20274a);
            return true;
        }
    }

    public final void e(b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (d(errorCode, null)) {
            this.f20275b.l(this.f20274a, errorCode);
        }
    }

    public final v f() {
        synchronized (this) {
            try {
                if (!this.f20281h && !g()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f20282j;
    }

    public final boolean g() {
        boolean z5 = (this.f20274a & 1) == 1;
        this.f20275b.getClass();
        return true == z5;
    }

    public final synchronized boolean h() {
        try {
            if (this.f20285m != null) {
                return false;
            }
            w wVar = this.i;
            if (wVar.f20268c || wVar.f20271f) {
                v vVar = this.f20282j;
                if (vVar.f20263b || vVar.f20265d) {
                    if (this.f20281h) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void i(zk.k headers, boolean z5) {
        boolean zH;
        Intrinsics.checkNotNullParameter(headers, "headers");
        byte[] bArr = al.b.f1041a;
        synchronized (this) {
            try {
                if (this.f20281h && z5) {
                    this.i.getClass();
                } else {
                    this.f20281h = true;
                    this.f20280g.add(headers);
                }
                if (z5) {
                    this.i.f20268c = true;
                }
                zH = h();
                notifyAll();
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zH) {
            return;
        }
        this.f20275b.h(this.f20274a);
    }

    public final synchronized void j(b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f20285m == null) {
            this.f20285m = errorCode;
            notifyAll();
        }
    }
}
