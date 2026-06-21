package gl;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements Closeable {
    public static final c0 A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f20221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f20222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cl.d f20227h;
    public final cl.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cl.c f20228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final cl.c f20229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b0 f20230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f20231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f20232n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f20233o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f20234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c0 f20235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c0 f20236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f20237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f20238t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f20239u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f20240v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Socket f20241w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z f20242x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l f20243y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LinkedHashSet f20244z;

    static {
        c0 c0Var = new c0();
        c0Var.c(7, 65535);
        c0Var.c(5, 16384);
        A = c0Var;
    }

    public q(q9.o builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f20221b = (i) builder.f31951f;
        this.f20222c = new LinkedHashMap();
        String str = (String) builder.f31948c;
        if (str == null) {
            Intrinsics.g("connectionName");
            throw null;
        }
        this.f20223d = str;
        this.f20225f = 3;
        cl.d dVar = (cl.d) builder.f31946a;
        this.f20227h = dVar;
        this.i = dVar.e();
        this.f20228j = dVar.e();
        this.f20229k = dVar.e();
        this.f20230l = b0.f20164a;
        c0 c0Var = new c0();
        c0Var.c(7, 16777216);
        this.f20235q = c0Var;
        this.f20236r = A;
        this.f20240v = r0.a();
        Socket socket = (Socket) builder.f31947b;
        if (socket == null) {
            Intrinsics.g("socket");
            throw null;
        }
        this.f20241w = socket;
        nl.q qVar = (nl.q) builder.f31950e;
        if (qVar == null) {
            Intrinsics.g("sink");
            throw null;
        }
        this.f20242x = new z(qVar);
        nl.r rVar = (nl.r) builder.f31949d;
        if (rVar == null) {
            Intrinsics.g("source");
            throw null;
        }
        this.f20243y = new l(this, new u(rVar));
        this.f20244z = new LinkedHashSet();
    }

    public final void a(b connectionCode, b streamCode, IOException iOException) {
        int i;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        byte[] bArr = al.b.f1041a;
        try {
            i(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f20222c.isEmpty()) {
                    array = null;
                } else {
                    array = this.f20222c.values().toArray(new y[0]);
                    this.f20222c.clear();
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        y[] yVarArr = (y[]) array;
        if (yVarArr != null) {
            for (y yVar : yVarArr) {
                try {
                    yVar.c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f20242x.close();
        } catch (IOException unused3) {
        }
        try {
            this.f20241w.close();
        } catch (IOException unused4) {
        }
        this.i.e();
        this.f20228j.e();
        this.f20229k.e();
    }

    public final void b(IOException iOException) {
        b bVar = b.PROTOCOL_ERROR;
        a(bVar, bVar, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(b.NO_ERROR, b.CANCEL, null);
    }

    public final synchronized y d(int i) {
        return (y) this.f20222c.get(Integer.valueOf(i));
    }

    public final void flush() {
        this.f20242x.flush();
    }

    public final synchronized y h(int i) {
        y yVar;
        yVar = (y) this.f20222c.remove(Integer.valueOf(i));
        notifyAll();
        return yVar;
    }

    public final void i(b statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f20242x) {
            synchronized (this) {
                if (this.f20226g) {
                    return;
                }
                this.f20226g = true;
                int i = this.f20224e;
                Unit unit = Unit.f27471a;
                this.f20242x.h(i, statusCode, al.b.f1041a);
            }
        }
    }

    public final synchronized void j(long j10) {
        long j11 = this.f20237s + j10;
        this.f20237s = j11;
        long j12 = j11 - this.f20238t;
        if (j12 >= this.f20235q.a() / 2) {
            m(0, j12);
            this.f20238t += j12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f20242x.f20290d);
        r6 = r2;
        r8.f20239u += r6;
        r4 = kotlin.Unit.f27471a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r9, boolean r10, nl.g r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            gl.z r12 = r8.f20242x
            r12.b(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6a
            monitor-enter(r8)
        L12:
            long r4 = r8.f20239u     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            long r6 = r8.f20240v     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f20222c     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            goto L12
        L2a:
            r9 = move-exception
            goto L68
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            gl.z r4 = r8.f20242x     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f20290d     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f20239u     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f20239u = r4     // Catch: java.lang.Throwable -> L2a
            kotlin.Unit r4 = kotlin.Unit.f27471a     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            gl.z r4 = r8.f20242x
            if (r10 == 0) goto L56
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = r3
        L57:
            r4.b(r5, r9, r11, r2)
            goto Ld
        L5b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L68:
            monitor-exit(r8)
            throw r9
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.q.k(int, boolean, nl.g, long):void");
    }

    public final void l(int i, b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.i.c(new o(this.f20223d + '[' + i + "] writeSynReset", this, i, errorCode, 1), 0L);
    }

    public final void m(int i, long j10) {
        this.i.c(new p(this.f20223d + '[' + i + "] windowUpdate", this, i, j10), 0L);
    }
}
