package e4;

import android.util.Rational;
import android.util.Size;
import g0.i1;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16135d;

    public j(zh.b bVar) {
        s7.g gVar = new s7.g(bVar, "flutter/lifecycle", ii.y.f21324b, (Object) null);
        this.f16132a = 0;
        this.f16133b = 0;
        this.f16134c = true;
        this.f16135d = gVar;
    }

    public static int b(int i, int i10) {
        int iMin;
        int i11 = i - i10;
        return (Math.abs(i11) <= 1000 || (iMin = (Math.min(i, i10) - Math.max(i, i10)) + 65535) >= 1000) ? i11 : i < i10 ? iMin : -iMin;
    }

    public synchronized void a(i iVar) {
        this.f16132a = iVar.f16130a.f16122c;
        ((TreeSet) this.f16135d).add(iVar);
    }

    public Size c(i1 i1Var) {
        int iS = i1Var.s(0);
        Size size = (Size) i1Var.g(i1.f19608m, null);
        int i = this.f16133b;
        int i10 = this.f16132a;
        if (size != null) {
            int i11 = a0.e.i(a0.e.v(iS), i10, 1 == i);
            if (i11 == 90 || i11 == 270) {
                return new Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }

    public synchronized h d(long j10) {
        if (((TreeSet) this.f16135d).isEmpty()) {
            return null;
        }
        i iVar = (i) ((TreeSet) this.f16135d).first();
        int i = iVar.f16130a.f16122c;
        if (i != h.a(this.f16133b) && j10 < iVar.f16131b) {
            return null;
        }
        ((TreeSet) this.f16135d).pollFirst();
        this.f16133b = i;
        return iVar.f16130a;
    }

    public synchronized void e() {
        ((TreeSet) this.f16135d).clear();
        this.f16134c = false;
        this.f16133b = -1;
        this.f16132a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(int r5, boolean r6) {
        /*
            r4 = this;
            int r0 = r4.f16132a
            if (r0 != r5) goto L9
            boolean r1 = r4.f16134c
            if (r6 != r1) goto L9
            goto L32
        L9:
            if (r5 != 0) goto L10
            if (r0 != 0) goto L10
            r4.f16134c = r6
            return
        L10:
            int r0 = t.z.m(r5)
            if (r0 == 0) goto L29
            r1 = 1
            r2 = 3
            r3 = 2
            if (r0 == r1) goto L24
            if (r0 == r3) goto L29
            if (r0 == r2) goto L29
            r1 = 4
            if (r0 == r1) goto L29
            r0 = 0
            goto L2a
        L24:
            if (r6 == 0) goto L27
            r2 = r3
        L27:
            r0 = r2
            goto L2a
        L29:
            r0 = r5
        L2a:
            r4.f16132a = r5
            r4.f16134c = r6
            int r5 = r4.f16133b
            if (r0 != r5) goto L33
        L32:
            return
        L33:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "AppLifecycleState."
            r5.<init>(r6)
            r6 = 1
            if (r0 == r6) goto L57
            r6 = 2
            if (r0 == r6) goto L54
            r6 = 3
            if (r0 == r6) goto L51
            r6 = 4
            if (r0 == r6) goto L4e
            r6 = 5
            if (r0 != r6) goto L4c
            java.lang.String r6 = "PAUSED"
            goto L59
        L4c:
            r5 = 0
            throw r5
        L4e:
            java.lang.String r6 = "HIDDEN"
            goto L59
        L51:
            java.lang.String r6 = "INACTIVE"
            goto L59
        L54:
            java.lang.String r6 = "RESUMED"
            goto L59
        L57:
            java.lang.String r6 = "DETACHED"
        L59:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r6 = r4.f16135d
            s7.g r6 = (s7.g) r6
            r1 = 0
            r6.K(r5, r1)
            r4.f16133b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.j.f(int, boolean):void");
    }

    public j() {
        this.f16135d = new TreeSet(new d2.a(1));
        e();
    }

    public j(g0.d0 d0Var, Rational rational) {
        this.f16132a = d0Var.c();
        this.f16133b = d0Var.l();
        this.f16135d = rational;
        boolean z5 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z5 = false;
        }
        this.f16134c = z5;
    }
}
