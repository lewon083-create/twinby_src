package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zh2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nv f45413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mv f45414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final to1 f45415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oh2 f45416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ph2 f45417e;

    public zh2(nv nvVar, mv mvVar, to1 to1Var, oh2 oh2Var, ph2 ph2Var) {
        this.f45413a = nvVar;
        this.f45414b = mvVar;
        this.f45415c = to1Var;
        this.f45416d = oh2Var;
        this.f45417e = ph2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        if (r0 == r11) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(long r14, android.content.Context r16, yads.e00 r17, yads.d03 r18, yads.zh2 r19, java.util.List r20, mj.a r21) throws java.lang.Throwable {
        /*
            r0 = r21
            r19.getClass()
            boolean r1 = r0 instanceof yads.wh2
            if (r1 == 0) goto L1a
            r1 = r0
            yads.wh2 r1 = (yads.wh2) r1
            int r2 = r1.f44406d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1a
            int r2 = r2 - r3
            r1.f44406d = r2
            r8 = r19
            goto L21
        L1a:
            yads.wh2 r1 = new yads.wh2
            r8 = r19
            r1.<init>(r8, r0)
        L21:
            java.lang.Object r0 = r1.f44404b
            nj.a r11 = nj.a.f29512b
            int r2 = r1.f44406d
            r12 = 2
            r13 = 1
            if (r2 == 0) goto L3f
            if (r2 == r13) goto L3b
            if (r2 != r12) goto L33
            com.google.android.gms.internal.measurement.h5.E(r0)
            goto L85
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            com.google.android.gms.internal.measurement.h5.E(r0)
            goto L70
        L3f:
            com.google.android.gms.internal.measurement.h5.E(r0)
            boolean r0 = r20.isEmpty()
            if (r0 == 0) goto L58
            yads.bh2 r14 = yads.bh2.f37027d
            yads.kh2 r14 = yads.lq1.a()
            yads.fh2 r15 = new yads.fh2
            java.util.List r14 = kotlin.collections.r.c(r14)
            r15.<init>(r14)
            return r15
        L58:
            yads.xh2 r2 = new yads.xh2
            r10 = 0
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r20
            r2.<init>(r3, r5, r6, r7, r8, r9, r10)
            r1.f44406d = r13
            java.lang.Object r0 = hk.c0.e(r2, r1)
            if (r0 != r11) goto L70
            goto L84
        L70:
            java.util.List r0 = (java.util.List) r0
            ok.e r14 = hk.k0.f20682a
            ok.d r14 = ok.d.f30722d
            yads.yh2 r15 = new yads.yh2
            r2 = 0
            r15.<init>(r0, r2)
            r1.f44406d = r12
            java.lang.Object r0 = hk.c0.t(r14, r15, r1)
            if (r0 != r11) goto L85
        L84:
            return r11
        L85:
            java.util.List r0 = (java.util.List) r0
            boolean r14 = r0.isEmpty()
            if (r14 == 0) goto L9d
            yads.bh2 r14 = yads.bh2.f37027d
            yads.kh2 r14 = yads.lq1.a()
            yads.fh2 r15 = new yads.fh2
            java.util.List r14 = kotlin.collections.r.c(r14)
            r15.<init>(r14)
            return r15
        L9d:
            yads.fh2 r14 = new yads.fh2
            r14.<init>(r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zh2.a(long, android.content.Context, yads.e00, yads.d03, yads.zh2, java.util.List, mj.a):java.lang.Object");
    }

    public /* synthetic */ zh2(zo1 zo1Var, nv nvVar) {
        this(nvVar, new mv(), new to1(zo1Var), new oh2(), new ph2());
    }

    public static final void a(zh2 zh2Var, sq1 sq1Var) {
        zh2Var.getClass();
        if (StringsKt.y(sq1Var.f43050b, "LevelPlay", true)) {
            List listF = kotlin.collections.s.f("app_key", "placement_name");
            ArrayList arrayList = new ArrayList();
            for (Object obj : listF) {
                if (!sq1Var.f43051c.containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                throw new IllegalArgumentException("Required configuration parameters are missing");
            }
        }
    }
}
