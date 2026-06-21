package be;

import g8.g;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import zd.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f2085d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f2086e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f2087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2089c;

    public d() {
        if (g.f20032d == null) {
            Pattern pattern = j.f46267c;
            g.f20032d = new g(10);
        }
        g gVar = g.f20032d;
        if (j.f46268d == null) {
            j.f46268d = new j(gVar);
        }
        this.f2087a = j.f46268d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f2089c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            zd.j r0 = r4.f2087a     // Catch: java.lang.Throwable -> L19
            g8.g r0 = r0.f46269a     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.f2088b     // Catch: java.lang.Throwable -> L19
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            r0 = 0
            goto L1c
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            r0 = 1
        L1c:
            monitor-exit(r4)
            return r0
        L1e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.d.a():boolean");
    }

    public final synchronized void b(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.f2089c = 0;
            }
            return;
        }
        this.f2089c++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double dPow = Math.pow(2.0d, this.f2089c);
                this.f2087a.getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f2086e);
            } else {
                jMin = f2085d;
            }
            this.f2087a.f46269a.getClass();
            this.f2088b = System.currentTimeMillis() + jMin;
        }
        return;
    }
}
