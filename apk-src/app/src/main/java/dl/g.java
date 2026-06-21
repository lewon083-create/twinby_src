package dl;

import com.google.android.gms.internal.ads.gn0;
import com.google.firebase.messaging.y;
import hl.n;
import io.sentry.ProfilingTraceData;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zk.d0;
import zk.u;
import zk.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f15834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f15835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f15836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f15837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f15838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f15839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f15840h;
    public j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public gn0 f15842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f15846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile gn0 f15847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile j f15848q;

    public g(u client, x originalRequest) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f15834b = client;
        this.f15835c = originalRequest;
        this.f15836d = (k) client.f46476c.f27180c;
        client.f46479f.getClass();
        zk.i this_asFactory = zk.i.f46409d;
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(this, "it");
        f fVar = new f(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        fVar.g(0);
        this.f15837e = fVar;
        this.f15838f = new AtomicBoolean();
        this.f15845n = true;
    }

    public final void a(j connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr = al.b.f1041a;
        if (this.i != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.i = connection;
        connection.f15866p.add(new e(this, this.f15839g));
    }

    public final IOException b(IOException iOException) {
        IOException ioe;
        Socket socketH;
        byte[] bArr = al.b.f1041a;
        j connection = this.i;
        if (connection != null) {
            synchronized (connection) {
                socketH = h();
            }
            if (this.i == null) {
                if (socketH != null) {
                    al.b.d(socketH);
                }
                Intrinsics.checkNotNullParameter(this, "call");
                Intrinsics.checkNotNullParameter(connection, "connection");
            } else if (socketH != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f15841j && this.f15837e.i()) {
            ioe = new InterruptedIOException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
            if (iOException != null) {
                ioe.initCause(iOException);
            }
        } else {
            ioe = iOException;
        }
        if (iOException == null) {
            Intrinsics.checkNotNullParameter(this, "call");
            return ioe;
        }
        Intrinsics.b(ioe);
        Intrinsics.checkNotNullParameter(this, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        return ioe;
    }

    public final d0 c() {
        if (!this.f15838f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f15837e.h();
        n nVar = n.f20755a;
        this.f15839g = n.f20755a.g();
        Intrinsics.checkNotNullParameter(this, "call");
        try {
            y yVar = this.f15834b.f46475b;
            synchronized (yVar) {
                Intrinsics.checkNotNullParameter(this, "call");
                ((ArrayDeque) yVar.f14901d).add(this);
            }
            return e();
        } finally {
            this.f15834b.f46475b.f(this);
        }
    }

    public final Object clone() {
        return new g(this.f15834b, this.f15835c);
    }

    public final void d(boolean z5) {
        gn0 gn0Var;
        synchronized (this) {
            if (!this.f15845n) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.f27471a;
        }
        if (z5 && (gn0Var = this.f15847p) != null) {
            ((el.d) gn0Var.f5877f).cancel();
            ((g) gn0Var.f5875d).f(gn0Var, true, true, null);
        }
        this.f15842k = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zk.d0 e() {
        /*
            r9 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            zk.u r0 = r9.f15834b
            java.util.List r0 = r0.f46477d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.x.m(r2, r0)
            el.a r0 = new el.a
            zk.u r1 = r9.f15834b
            r0.<init>(r1)
            r2.add(r0)
            el.a r0 = new el.a
            zk.u r1 = r9.f15834b
            zk.i r1 = r1.f46483k
            r0.<init>(r1)
            r2.add(r0)
            bl.b r0 = new bl.b
            r0.<init>()
            r2.add(r0)
            dl.a r0 = dl.a.f15811a
            r2.add(r0)
            zk.u r0 = r9.f15834b
            java.util.List r0 = r0.f46478e
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.x.m(r2, r0)
            el.b r0 = new el.b
            r0.<init>()
            r2.add(r0)
            el.f r0 = new el.f
            zk.x r5 = r9.f15835c
            zk.u r1 = r9.f15834b
            int r6 = r1.f46495w
            int r7 = r1.f46496x
            int r8 = r1.f46497y
            r3 = 0
            r4 = 0
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r2 = 0
            r3 = 0
            zk.x r4 = r1.f15835c     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            zk.d0 r0 = r0.b(r4)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            boolean r4 = r1.f15846o     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            if (r4 != 0) goto L64
            r9.g(r2)
            return r0
        L64:
            al.b.c(r0)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.lang.String r4 = "Canceled"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            throw r0     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
        L6f:
            r0 = move-exception
            goto L7d
        L71:
            r0 = move-exception
            r3 = 1
            java.io.IOException r0 = r9.g(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Throwable"
            kotlin.jvm.internal.Intrinsics.c(r0, r4)     // Catch: java.lang.Throwable -> L6f
            throw r0     // Catch: java.lang.Throwable -> L6f
        L7d:
            if (r3 != 0) goto L82
            r9.g(r2)
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.g.e():zk.d0");
    }

    public final IOException f(gn0 exchange, boolean z5, boolean z10, IOException iOException) {
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (Intrinsics.a(exchange, this.f15847p)) {
            synchronized (this) {
                z11 = false;
                if (z5) {
                    try {
                        if (!this.f15843l) {
                            if (z10 || !this.f15844m) {
                                z12 = false;
                            }
                            Unit unit = Unit.f27471a;
                        }
                        if (z5) {
                            this.f15843l = false;
                        }
                        if (z10) {
                            this.f15844m = false;
                        }
                        boolean z13 = this.f15843l;
                        boolean z14 = (z13 || this.f15844m) ? false : true;
                        if (!z13 && !this.f15844m && !this.f15845n) {
                            z11 = true;
                        }
                        z12 = z11;
                        z11 = z14;
                        Unit unit2 = Unit.f27471a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    if (z10) {
                    }
                    z12 = false;
                    Unit unit22 = Unit.f27471a;
                }
            }
            if (z11) {
                this.f15847p = null;
                j jVar = this.i;
                if (jVar != null) {
                    synchronized (jVar) {
                        jVar.f15863m++;
                    }
                }
            }
            if (z12) {
                return b(iOException);
            }
        }
        return iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z5;
        synchronized (this) {
            try {
                z5 = false;
                if (this.f15845n) {
                    this.f15845n = false;
                    if (!this.f15843l && !this.f15844m) {
                        z5 = true;
                    }
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z5 ? b(iOException) : iOException;
    }

    public final Socket h() {
        j connection = this.i;
        Intrinsics.b(connection);
        byte[] bArr = al.b.f1041a;
        ArrayList arrayList = connection.f15866p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.i = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        connection.f15867q = System.nanoTime();
        k kVar = this.f15836d;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) kVar.f15874e;
        cl.c cVar = (cl.c) kVar.f15872c;
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr2 = al.b.f1041a;
        if (!connection.f15860j) {
            cVar.c((cl.b) kVar.f15873d, 0L);
            return null;
        }
        connection.f15860j = true;
        concurrentLinkedQueue.remove(connection);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        Socket socket = connection.f15855d;
        Intrinsics.b(socket);
        return socket;
    }
}
