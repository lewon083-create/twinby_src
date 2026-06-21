package x0;

import android.os.Build;
import fh.nd;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f35573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f35574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f35575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f35576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v7.f f35577f;

    public d0(b0 b0Var, long j10, m mVar, boolean z5) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f35573b = atomicBoolean;
        v7.f fVar = Build.VERSION.SDK_INT >= 30 ? new v7.f(21, new i0.d()) : new v7.f(21, new nd());
        this.f35577f = fVar;
        this.f35574c = b0Var;
        this.f35575d = j10;
        this.f35576e = mVar;
        if (z5) {
            atomicBoolean.set(true);
        } else {
            ((i0.e) fVar.f34767c).d("stop");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r11, java.lang.RuntimeException r12) {
        /*
            r10 = this;
            v7.f r0 = r10.f35577f
            java.lang.Object r0 = r0.f34767c
            i0.e r0 = (i0.e) r0
            r0.close()
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.f35573b
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto L14
            goto La6
        L14:
            x0.b0 r2 = r10.f35574c
            java.lang.String r0 = "stop() called on a recording that is no longer active: "
            java.lang.Object r8 = r2.f35541h
            monitor-enter(r8)
            x0.h r1 = r2.f35552p     // Catch: java.lang.Throwable -> L40
            boolean r1 = x0.b0.p(r10, r1)     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L44
            x0.h r1 = r2.f35551o     // Catch: java.lang.Throwable -> L40
            boolean r1 = x0.b0.p(r10, r1)     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L44
            java.lang.String r11 = "Recorder"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L40
            x0.m r0 = r10.f35576e     // Catch: java.lang.Throwable -> L40
            r12.append(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.auth.g.e(r11, r12)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L40
            return
        L40:
            r0 = move-exception
            r11 = r0
            goto Laf
        L44:
            x0.a0 r0 = r2.f35547l     // Catch: java.lang.Throwable -> L40
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L40
            r9 = 0
            switch(r0) {
                case 0: goto La7;
                case 1: goto L79;
                case 2: goto L79;
                case 3: goto La7;
                case 4: goto L5b;
                case 5: goto L5b;
                case 6: goto L51;
                case 7: goto L51;
                default: goto L4e;
            }     // Catch: java.lang.Throwable -> L40
        L4e:
            r6 = r11
            r7 = r12
            goto L8c
        L51:
            x0.h r0 = r2.f35551o     // Catch: java.lang.Throwable -> L40
            boolean r0 = x0.b0.p(r10, r0)     // Catch: java.lang.Throwable -> L40
            f2.g.h(r9, r0)     // Catch: java.lang.Throwable -> L40
            goto L4e
        L5b:
            x0.a0 r0 = x0.a0.f35512h     // Catch: java.lang.Throwable -> L40
            r2.D(r0)     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L40
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L40
            long r4 = r0.toMicros(r3)     // Catch: java.lang.Throwable -> L40
            x0.h r3 = r2.f35551o     // Catch: java.lang.Throwable -> L40
            j0.i r0 = r2.f35533d     // Catch: java.lang.Throwable -> L40
            x0.t r1 = new x0.t     // Catch: java.lang.Throwable -> L40
            r6 = r11
            r7 = r12
            r1.<init>()     // Catch: java.lang.Throwable -> L40
            r0.execute(r1)     // Catch: java.lang.Throwable -> L40
            goto L8c
        L79:
            r6 = r11
            r7 = r12
            x0.h r11 = r2.f35552p     // Catch: java.lang.Throwable -> L40
            boolean r11 = x0.b0.p(r10, r11)     // Catch: java.lang.Throwable -> L40
            f2.g.h(r9, r11)     // Catch: java.lang.Throwable -> L40
            x0.h r11 = r2.f35552p     // Catch: java.lang.Throwable -> L40
            r2.f35552p = r9     // Catch: java.lang.Throwable -> L40
            r2.y()     // Catch: java.lang.Throwable -> L40
            r9 = r11
        L8c:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L40
            if (r9 == 0) goto La6
            r11 = 10
            if (r6 != r11) goto L9a
            java.lang.String r11 = "Recorder"
            java.lang.String r12 = "Recording was stopped due to recording being garbage collected before any valid data has been produced."
            com.google.android.gms.internal.auth.g.k(r11, r12)
        L9a:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r12 = "Recording was stopped before any data could be produced."
            r11.<init>(r12, r7)
            r11 = 8
            r2.j(r9, r11)
        La6:
            return
        La7:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L40
            java.lang.String r12 = "Calling stop() while idling or initializing is invalid."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L40
            throw r11     // Catch: java.lang.Throwable -> L40
        Laf:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L40
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.d0.a(int, java.lang.RuntimeException):void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a(0, null);
    }

    public final void finalize() throws Throwable {
        try {
            ((i0.e) this.f35577f.f34767c).a();
            a(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }
}
