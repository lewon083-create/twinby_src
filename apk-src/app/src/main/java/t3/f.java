package t3;

import i4.c0;
import j3.m0;
import j3.n0;
import j3.o0;
import java.util.HashMap;
import java.util.Random;
import o4.l;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f33432h = new l(2);
    public static final Random i = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f33436d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33438f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f33433a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f33434b = new m0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f33435c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o0 f33437e = o0.f26348a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f33439g = -1;

    public final void a(e eVar) {
        long j10 = eVar.f33427c;
        if (j10 != -1 && eVar.f33429e) {
            this.f33439g = j10;
        }
        this.f33438f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t3.e b(int r19, i4.c0 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = r0.f33435c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto La4
            java.lang.Object r8 = r4.next()
            t3.e r8 = (t3.e) r8
            long r9 = r8.f33427c
            i4.c0 r11 = r8.f33428d
            r12 = -1
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L57
            int r9 = r8.f33426b
            if (r1 != r9) goto L57
            if (r2 == 0) goto L57
            long r9 = r2.f20864d
            t3.f r14 = r8.f33431g
            java.util.HashMap r15 = r14.f33435c
            r16 = r12
            java.lang.String r12 = r14.f33438f
            java.lang.Object r12 = r15.get(r12)
            t3.e r12 = (t3.e) r12
            if (r12 == 0) goto L4b
            long r12 = r12.f33427c
            int r15 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r15 == 0) goto L4b
            goto L50
        L4b:
            long r12 = r14.f33439g
            r14 = 1
            long r12 = r12 + r14
        L50:
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 < 0) goto L59
            r8.f33427c = r9
            goto L59
        L57:
            r16 = r12
        L59:
            if (r2 == 0) goto L84
            long r9 = r2.f20864d
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 != 0) goto L62
            goto L84
        L62:
            if (r11 != 0) goto L71
            boolean r12 = r2.b()
            if (r12 != 0) goto L16
            long r12 = r8.f33427c
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            goto L88
        L71:
            long r12 = r11.f20864d
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            int r9 = r2.f20862b
            int r10 = r11.f20862b
            if (r9 != r10) goto L16
            int r9 = r2.f20863c
            int r10 = r11.f20863c
            if (r9 != r10) goto L16
            goto L88
        L84:
            int r9 = r8.f33426b
            if (r1 != r9) goto L16
        L88:
            long r9 = r8.f33427c
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 >= 0) goto L93
            goto La0
        L93:
            if (r12 != 0) goto L16
            java.lang.String r9 = m3.z.f28608a
            i4.c0 r9 = r5.f33428d
            if (r9 == 0) goto L16
            if (r11 == 0) goto L16
            r5 = r8
            goto L16
        La0:
            r5 = r8
            r6 = r9
            goto L16
        La4:
            if (r5 != 0) goto Lb6
            o4.l r4 = t3.f.f33432h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            t3.e r5 = new t3.e
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        Lb6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.f.b(int, i4.c0):t3.e");
    }

    public final synchronized String c(o0 o0Var, c0 c0Var) {
        return b(o0Var.g(c0Var.f20861a, this.f33434b).f26276c, c0Var).f33425a;
    }

    public final void d(a aVar) {
        c0 c0Var;
        o0 o0Var = aVar.f33407b;
        int i10 = aVar.f33408c;
        c0 c0Var2 = aVar.f33409d;
        boolean zP = o0Var.p();
        HashMap map = this.f33435c;
        if (zP) {
            String str = this.f33438f;
            if (str != null) {
                e eVar = (e) map.get(str);
                eVar.getClass();
                a(eVar);
                return;
            }
            return;
        }
        e eVar2 = (e) map.get(this.f33438f);
        this.f33438f = b(i10, c0Var2).f33425a;
        e(aVar);
        if (c0Var2 != null) {
            long j10 = c0Var2.f20864d;
            if (c0Var2.b()) {
                if (eVar2 != null && eVar2.f33427c == j10 && (c0Var = eVar2.f33428d) != null && c0Var.f20862b == c0Var2.f20862b && c0Var.f20863c == c0Var2.f20863c) {
                    return;
                }
                b(i10, new c0(c0Var2.f20861a, j10));
                this.f33436d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x001c, B:13:0x0028, B:16:0x002f, B:22:0x003a, B:24:0x0046, B:26:0x004c, B:32:0x0057, B:34:0x0063, B:35:0x0067, B:37:0x006c, B:39:0x0072, B:41:0x0089, B:42:0x00b6, B:44:0x00ba, B:45:0x00c1, B:47:0x00cb, B:49:0x00cf, B:51:0x00dc, B:54:0x00e3), top: B:59:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void e(t3.a r10) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.f.e(t3.a):void");
    }
}
