package dl;

import android.hardware.display.DisplayManager;
import android.os.Bundle;
import fj.n;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.q;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import ob.u;
import ob.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static k f15868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static n f15869g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f15872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f15873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f15874e;

    public k(long j10, Bundle bundle, String str, String str2) {
        this.f15870a = 2;
        this.f15872c = str;
        this.f15873d = str2;
        this.f15874e = bundle;
        this.f15871b = j10;
    }

    public static k b(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f15868f == null) {
            f15868f = new k(flutterJNI);
        }
        if (f15869g == null) {
            k kVar = f15868f;
            Objects.requireNonNull(kVar);
            n nVar = new n(kVar, displayManager, 1);
            f15869g = nVar;
            displayManager.registerDisplayListener(nVar, null);
        }
        if (f15868f.f15871b == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f15868f.f15871b = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f15868f;
    }

    public static k e(v vVar) {
        String str = vVar.f30454b;
        String str2 = vVar.f30456d;
        return new k(vVar.f30457e, vVar.f30455c.f(), str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(zk.a r6, dl.g r7, java.util.ArrayList r8, boolean r9) {
        /*
            r5 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.Object r0 = r5.f15874e
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.next()
            dl.j r1 = (dl.j) r1
            java.lang.String r3 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            monitor-enter(r1)
            r3 = 1
            if (r9 == 0) goto L32
            gl.q r4 = r1.f15858g     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L2d
            r2 = r3
        L2d:
            if (r2 == 0) goto L3d
            goto L32
        L30:
            r6 = move-exception
            goto L41
        L32:
            boolean r2 = r1.h(r6, r8)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L3d
            r7.a(r1)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)
            return r3
        L3d:
            kotlin.Unit r2 = kotlin.Unit.f27471a     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)
            goto L12
        L41:
            monitor-exit(r1)
            throw r6
        L43:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.k.a(zk.a, dl.g, java.util.ArrayList, boolean):boolean");
    }

    public int c(j jVar, long j10) {
        byte[] bArr = al.b.f1041a;
        ArrayList arrayList = jVar.f15866p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + jVar.f15853b.f46385a.f46315h + " was leaked. Did you forget to close a response body?";
                hl.n nVar = hl.n.f20755a;
                hl.n.f20755a.j(((e) reference).f15832a, str);
                arrayList.remove(i);
                jVar.f15860j = true;
                if (arrayList.isEmpty()) {
                    jVar.f15867q = j10 - this.f15871b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff A[PHI: r8 r16 r17
      0x00ff: PHI (r8v6 android.database.Cursor) = (r8v7 android.database.Cursor), (r8v10 android.database.Cursor) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r16v3 com.google.android.gms.internal.measurement.d3) = (r16v5 com.google.android.gms.internal.measurement.d3), (r16v10 com.google.android.gms.internal.measurement.d3) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.measurement.d3 d(com.google.android.gms.internal.measurement.d3 r21, java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.k.d(com.google.android.gms.internal.measurement.d3, java.lang.String):com.google.android.gms.internal.measurement.d3");
    }

    public v f() {
        return new v((String) this.f15872c, new u(new Bundle((Bundle) this.f15874e)), (String) this.f15873d, this.f15871b);
    }

    public String toString() {
        switch (this.f15870a) {
            case 2:
                String str = (String) this.f15873d;
                String string = ((Bundle) this.f15874e).toString();
                int length = String.valueOf(str).length();
                String str2 = (String) this.f15872c;
                StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
                o.t(sb2, "origin=", str, ",name=", str2);
                return a0.u.o(sb2, ",params=", string);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ k(ob.c cVar) {
        this.f15870a = 3;
        this.f15874e = cVar;
    }

    public k(cl.d taskRunner) {
        this.f15870a = 0;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f15871b = timeUnit.toNanos(5L);
        this.f15872c = taskRunner.e();
        this.f15873d = new cl.b(this, a0.u.o(new StringBuilder(), al.b.f1047g, " ConnectionPool"));
        this.f15874e = new ConcurrentLinkedQueue();
    }

    public k(FlutterJNI flutterJNI) {
        this.f15870a = 1;
        this.f15871b = -1L;
        this.f15873d = new q(this, 0L);
        this.f15874e = new io.flutter.view.b(this);
        this.f15872c = flutterJNI;
    }
}
