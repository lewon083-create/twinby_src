package yads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class oe0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b53 f41523h = new zl.p0(0);
    public static final Random i = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u63 f41524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s63 f41525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f41526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b53 f41527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public je2 f41528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v63 f41529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f41530g;

    public oe0() {
        this(f41523h);
    }

    public final synchronized void a(ye yeVar) {
        je2 je2Var;
        this.f41530g = null;
        Iterator it = this.f41526c.values().iterator();
        while (it.hasNext()) {
            ne0 ne0Var = (ne0) it.next();
            it.remove();
            if (ne0Var.f41239e && (je2Var = this.f41528e) != null) {
                ((om1) je2Var).b(yeVar, ne0Var.f41235a);
            }
        }
    }

    public final void b(ye yeVar) {
        an1 an1Var;
        if (yeVar.f45028b.c()) {
            this.f41530g = null;
            return;
        }
        ne0 ne0Var = (ne0) this.f41526c.get(this.f41530g);
        this.f41530g = a(yeVar.f45029c, yeVar.f45030d).f41235a;
        c(yeVar);
        an1 an1Var2 = yeVar.f45030d;
        if (an1Var2 == null || !an1Var2.a()) {
            return;
        }
        if (ne0Var != null) {
            long j10 = ne0Var.f41237c;
            an1 an1Var3 = yeVar.f45030d;
            if (j10 == an1Var3.f43369d && (an1Var = ne0Var.f41238d) != null && an1Var.f43367b == an1Var3.f43367b && an1Var.f43368c == an1Var3.f43368c) {
                return;
            }
        }
        an1 an1Var4 = yeVar.f45030d;
        a(yeVar.f45029c, new an1(an1Var4.f43366a, an1Var4.f43369d));
        this.f41528e.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r1.f43369d < r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void c(yads.ye r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            yads.je2 r0 = r7.f41528e     // Catch: java.lang.Throwable -> L2f
            r0.getClass()     // Catch: java.lang.Throwable -> L2f
            yads.v63 r0 = r8.f45028b     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L10
            monitor-exit(r7)
            return
        L10:
            java.util.HashMap r0 = r7.f41526c     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = r7.f41530g     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2f
            yads.ne0 r0 = (yads.ne0) r0     // Catch: java.lang.Throwable -> L2f
            yads.an1 r1 = r8.f45030d     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L3a
            if (r0 == 0) goto L3a
            long r2 = r0.f41237c     // Catch: java.lang.Throwable -> L2f
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L32
            int r0 = r0.f41236b     // Catch: java.lang.Throwable -> L2f
            int r2 = r8.f45029c     // Catch: java.lang.Throwable -> L2f
            if (r0 == r2) goto L3a
            goto L38
        L2f:
            r8 = move-exception
            goto Lc2
        L32:
            long r4 = r1.f43369d     // Catch: java.lang.Throwable -> L2f
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3a
        L38:
            monitor-exit(r7)
            return
        L3a:
            int r0 = r8.f45029c     // Catch: java.lang.Throwable -> L2f
            yads.ne0 r0 = r7.a(r0, r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = r7.f41530g     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L48
            java.lang.String r1 = r0.f41235a     // Catch: java.lang.Throwable -> L2f
            r7.f41530g = r1     // Catch: java.lang.Throwable -> L2f
        L48:
            yads.an1 r1 = r8.f45030d     // Catch: java.lang.Throwable -> L2f
            r2 = 1
            if (r1 == 0) goto L9c
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L9c
            yads.an1 r1 = new yads.an1     // Catch: java.lang.Throwable -> L2f
            yads.an1 r3 = r8.f45030d     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r4 = r3.f43366a     // Catch: java.lang.Throwable -> L2f
            long r5 = r3.f43369d     // Catch: java.lang.Throwable -> L2f
            int r3 = r3.f43367b     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r3, r5, r4)     // Catch: java.lang.Throwable -> L2f
            int r3 = r8.f45029c     // Catch: java.lang.Throwable -> L2f
            yads.ne0 r1 = r7.a(r3, r1)     // Catch: java.lang.Throwable -> L2f
            boolean r3 = r1.f41239e     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L9c
            r1.f41239e = r2     // Catch: java.lang.Throwable -> L2f
            yads.v63 r1 = r8.f45028b     // Catch: java.lang.Throwable -> L2f
            yads.an1 r3 = r8.f45030d     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r3 = r3.f43366a     // Catch: java.lang.Throwable -> L2f
            yads.s63 r4 = r7.f41525b     // Catch: java.lang.Throwable -> L2f
            r1.a(r3, r4)     // Catch: java.lang.Throwable -> L2f
            yads.s63 r1 = r7.f41525b     // Catch: java.lang.Throwable -> L2f
            yads.an1 r3 = r8.f45030d     // Catch: java.lang.Throwable -> L2f
            int r3 = r3.f43367b     // Catch: java.lang.Throwable -> L2f
            yads.e6 r1 = r1.f42829h     // Catch: java.lang.Throwable -> L2f
            yads.d6 r1 = r1.a(r3)     // Catch: java.lang.Throwable -> L2f
            long r3 = r1.f37631b     // Catch: java.lang.Throwable -> L2f
            long r3 = yads.lb3.b(r3)     // Catch: java.lang.Throwable -> L2f
            yads.s63 r1 = r7.f41525b     // Catch: java.lang.Throwable -> L2f
            long r5 = r1.f42827f     // Catch: java.lang.Throwable -> L2f
            long r5 = yads.lb3.b(r5)     // Catch: java.lang.Throwable -> L2f
            long r5 = r5 + r3
            r3 = 0
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> L2f
            yads.je2 r1 = r7.f41528e     // Catch: java.lang.Throwable -> L2f
            r1.getClass()     // Catch: java.lang.Throwable -> L2f
        L9c:
            boolean r1 = r0.f41239e     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto La7
            r0.f41239e = r2     // Catch: java.lang.Throwable -> L2f
            yads.je2 r1 = r7.f41528e     // Catch: java.lang.Throwable -> L2f
            r1.getClass()     // Catch: java.lang.Throwable -> L2f
        La7:
            java.lang.String r1 = r0.f41235a     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r7.f41530g     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto Lc0
            boolean r1 = r0.f41240f     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto Lc0
            r0.f41240f = r2     // Catch: java.lang.Throwable -> L2f
            yads.je2 r1 = r7.f41528e     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r0.f41235a     // Catch: java.lang.Throwable -> L2f
            yads.om1 r1 = (yads.om1) r1     // Catch: java.lang.Throwable -> L2f
            r1.a(r8, r0)     // Catch: java.lang.Throwable -> L2f
        Lc0:
            monitor-exit(r7)
            return
        Lc2:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.oe0.c(yads.ye):void");
    }

    public oe0(b53 b53Var) {
        this.f41527d = b53Var;
        this.f41524a = new u63();
        this.f41525b = new s63();
        this.f41526c = new HashMap();
        this.f41529f = v63.f43913b;
    }

    public static String a() {
        byte[] bArr = new byte[12];
        i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.ne0 a(int r14, yads.an1 r15) {
        /*
            r13 = this;
            java.util.HashMap r0 = r13.f41526c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L10:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L78
            java.lang.Object r4 = r0.next()
            yads.ne0 r4 = (yads.ne0) r4
            long r5 = r4.f41237c
            r7 = -1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L2e
            int r5 = r4.f41236b
            if (r14 != r5) goto L2e
            if (r15 == 0) goto L2e
            long r5 = r15.f43369d
            r4.f41237c = r5
        L2e:
            if (r15 != 0) goto L35
            int r5 = r4.f41236b
            if (r14 != r5) goto L10
            goto L5c
        L35:
            yads.an1 r5 = r4.f41238d
            if (r5 != 0) goto L48
            boolean r5 = r15.a()
            if (r5 != 0) goto L10
            long r5 = r15.f43369d
            long r9 = r4.f41237c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L10
            goto L5c
        L48:
            long r9 = r15.f43369d
            long r11 = r5.f43369d
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 != 0) goto L10
            int r6 = r15.f43367b
            int r9 = r5.f43367b
            if (r6 != r9) goto L10
            int r6 = r15.f43368c
            int r5 = r5.f43368c
            if (r6 != r5) goto L10
        L5c:
            long r5 = r4.f41237c
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L75
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L67
            goto L75
        L67:
            if (r7 != 0) goto L10
            int r5 = yads.lb3.f40466a
            yads.an1 r5 = r1.f41238d
            if (r5 == 0) goto L10
            yads.an1 r5 = r4.f41238d
            if (r5 == 0) goto L10
            r1 = r4
            goto L10
        L75:
            r1 = r4
            r2 = r5
            goto L10
        L78:
            if (r1 != 0) goto L8c
            yads.b53 r0 = r13.f41527d
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            yads.ne0 r1 = new yads.ne0
            r1.<init>(r13, r0, r14, r15)
            java.util.HashMap r14 = r13.f41526c
            r14.put(r0, r1)
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.oe0.a(int, yads.an1):yads.ne0");
    }

    public final void a(je2 je2Var) {
        this.f41528e = je2Var;
    }

    public final synchronized void a(ye yeVar, int i10) {
        try {
            this.f41528e.getClass();
            Iterator it = this.f41526c.values().iterator();
            while (it.hasNext()) {
                ne0 ne0Var = (ne0) it.next();
                if (ne0Var.a(yeVar)) {
                    it.remove();
                    if (ne0Var.f41239e) {
                        if (ne0Var.f41235a.equals(this.f41530g)) {
                            this.f41530g = null;
                        }
                        ((om1) this.f41528e).b(yeVar, ne0Var.f41235a);
                    }
                }
            }
            b(yeVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
