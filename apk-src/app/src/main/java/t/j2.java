package t;

import com.google.android.gms.internal.measurement.b4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f33126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.d0 f33127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.d0 f33128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f33129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j0.i f33130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f33132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j1.h f33133h;
    public boolean i;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j2(t.o r5, u.i r6, j0.i r7) {
        /*
            r4 = this;
            r4.<init>()
            r4.f33126a = r5
            r4.f33130e = r7
            s3.q r7 = new s3.q
            r0 = 3
            r7.<init>(r0, r6)
            boolean r7 = com.google.android.gms.internal.auth.g.x(r7)
            r4.f33129d = r7
            boolean r0 = r6.d()
            r1 = 0
            if (r0 == 0) goto L40
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r0 < r2) goto L40
            boolean r3 = r6.d()
            if (r3 == 0) goto L33
            if (r0 < r2) goto L33
            android.hardware.camera2.CameraCharacteristics$Key r0 = b4.a.e()
            java.lang.Object r0 = r6.a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L34
        L33:
            r0 = 0
        L34:
            r2 = 1
            if (r0 != 0) goto L39
            r0 = r2
            goto L3d
        L39:
            int r0 = r0.intValue()
        L3d:
            if (r0 <= r2) goto L40
            goto L41
        L40:
            r2 = r1
        L41:
            if (r7 == 0) goto L4a
            if (r2 == 0) goto L4a
            int r6 = r6.b()
            goto L4b
        L4a:
            r6 = r1
        L4b:
            r4.f33132g = r6
            androidx.lifecycle.d0 r7 = new androidx.lifecycle.d0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r7.<init>(r0)
            r4.f33127b = r7
            androidx.lifecycle.d0 r7 = new androidx.lifecycle.d0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r6)
            r4.f33128c = r7
            t.i2 r6 = new t.i2
            r6.<init>()
            r5.a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.j2.<init>(t.o, u.i, j0.i):void");
    }

    public final void a(int i, j1.h hVar) {
        if (!this.f33129d) {
            if (hVar != null) {
                hVar.d(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        if (!this.f33131f) {
            b(0);
            if (hVar != null) {
                hVar.d(new a0.o("Camera is not active."));
                return;
            }
            return;
        }
        this.i = i != 0;
        this.f33126a.t(i);
        b(i);
        j1.h hVar2 = this.f33133h;
        if (hVar2 != null) {
            hVar2.d(new a0.o("There is a new enableTorch being set"));
        }
        this.f33133h = hVar;
    }

    public final void b(int i) {
        Integer numValueOf = Integer.valueOf(i != 1 ? 0 : 1);
        boolean zE = b4.E();
        androidx.lifecycle.d0 d0Var = this.f33127b;
        if (zE) {
            d0Var.k(numValueOf);
        } else {
            d0Var.i(numValueOf);
        }
    }
}
