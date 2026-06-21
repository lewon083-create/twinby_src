package cl;

import com.google.android.gms.internal.measurement.j4;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nc.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f2404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f2405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2406f;

    public c(d taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f2401a = taskRunner;
        this.f2402b = name;
        this.f2405e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = al.b.f1041a;
        synchronized (this.f2401a) {
            try {
                if (b()) {
                    this.f2401a.d(this);
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        a aVar = this.f2404d;
        if (aVar != null && aVar.f2396b) {
            this.f2406f = true;
        }
        ArrayList arrayList = this.f2405e;
        boolean z5 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f2396b) {
                a aVar2 = (a) arrayList.get(size);
                e eVar = d.f2407h;
                if (d.f2408j.isLoggable(Level.FINE)) {
                    j4.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z5 = true;
            }
        }
        return z5;
    }

    public final void c(a task, long j10) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f2401a) {
            if (!this.f2403c) {
                if (d(task, j10, false)) {
                    this.f2401a.d(this);
                }
                Unit unit = Unit.f27471a;
            } else if (task.f2396b) {
                e eVar = d.f2407h;
                if (d.f2408j.isLoggable(Level.FINE)) {
                    j4.a(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                e eVar2 = d.f2407h;
                if (d.f2408j.isLoggable(Level.FINE)) {
                    j4.a(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(cl.a r11, long r12, boolean r14) {
        /*
            r10 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r11.getClass()
            java.lang.String r0 = "queue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            cl.c r0 = r11.f2397c
            if (r0 != r10) goto L12
            goto L16
        L12:
            if (r0 != 0) goto L9a
            r11.f2397c = r10
        L16:
            cl.d r0 = r10.f2401a
            v7.f r0 = r0.f2409a
            long r0 = java.lang.System.nanoTime()
            long r2 = r0 + r12
            java.util.ArrayList r4 = r10.f2405e
            int r5 = r4.indexOf(r11)
            r6 = 0
            r7 = -1
            if (r5 == r7) goto L45
            long r8 = r11.f2398d
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 > 0) goto L42
            nc.e r12 = cl.d.f2407h
            java.util.logging.Logger r12 = cl.d.f2408j
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r12 = r12.isLoggable(r13)
            if (r12 == 0) goto L99
            java.lang.String r12 = "already scheduled"
            com.google.android.gms.internal.measurement.j4.a(r11, r10, r12)
            return r6
        L42:
            r4.remove(r5)
        L45:
            r11.f2398d = r2
            nc.e r5 = cl.d.f2407h
            java.util.logging.Logger r5 = cl.d.f2408j
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            boolean r5 = r5.isLoggable(r8)
            if (r5 == 0) goto L6f
            if (r14 == 0) goto L61
            long r2 = r2 - r0
            java.lang.String r14 = com.google.android.gms.internal.measurement.j4.o(r2)
            java.lang.String r2 = "run again after "
            java.lang.String r14 = r2.concat(r14)
            goto L6c
        L61:
            long r2 = r2 - r0
            java.lang.String r14 = com.google.android.gms.internal.measurement.j4.o(r2)
            java.lang.String r2 = "scheduled after "
            java.lang.String r14 = r2.concat(r14)
        L6c:
            com.google.android.gms.internal.measurement.j4.a(r11, r10, r14)
        L6f:
            java.util.Iterator r14 = r4.iterator()
            r2 = r6
        L74:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L8b
            java.lang.Object r3 = r14.next()
            cl.a r3 = (cl.a) r3
            long r8 = r3.f2398d
            long r8 = r8 - r0
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 <= 0) goto L88
            goto L8c
        L88:
            int r2 = r2 + 1
            goto L74
        L8b:
            r2 = r7
        L8c:
            if (r2 != r7) goto L92
            int r2 = r4.size()
        L92:
            r4.add(r2, r11)
            if (r2 != 0) goto L99
            r11 = 1
            return r11
        L99:
            return r6
        L9a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "task is in multiple queues"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.c.d(cl.a, long, boolean):boolean");
    }

    public final void e() {
        byte[] bArr = al.b.f1041a;
        synchronized (this.f2401a) {
            try {
                this.f2403c = true;
                if (b()) {
                    this.f2401a.d(this);
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String toString() {
        return this.f2402b;
    }
}
