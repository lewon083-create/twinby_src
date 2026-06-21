package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0306l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ve f24278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wo f24279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Qk f24280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M6 f24281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I8 f24282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ik f24283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0247j0 f24284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0020a5 f24285h;
    public final TimeProvider i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f24286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f24287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24288l;

    public C0306l9(Ve ve2, wo woVar, Qk qk2, M6 m62, C0247j0 c0247j0, I8 i82, Ik ik2, int i, C0020a5 c0020a5, SystemTimeProvider systemTimeProvider) {
        this.f24278a = ve2;
        this.f24279b = woVar;
        this.f24280c = qk2;
        this.f24281d = m62;
        this.f24284g = c0247j0;
        this.f24282e = i82;
        this.f24283f = ik2;
        this.f24286j = i;
        this.i = systemTimeProvider;
        this.f24285h = c0020a5;
        this.f24287k = ve2.i();
        this.f24288l = ve2.h();
    }

    public final void a(Q5 q5, Sk sk2) {
        long jOptLong;
        Map map = q5.f22874p;
        Ik ik2 = this.f24283f;
        ik2.getClass();
        map.putAll(new HashMap(ik2.f22460b));
        q5.c(this.f24278a.j());
        q5.f22873o = Integer.valueOf(this.f24279b.b());
        C0222i0 c0222i0A = this.f24284g.a();
        I8 i82 = this.f24282e;
        i82.getClass();
        H8 h82 = (H8) i82.f22445b.a(EnumC0078cb.a(q5.f22863d));
        M6 m62 = this.f24281d;
        A8 a8A = h82.a(q5);
        int i = q5.f22863d;
        wo woVar = this.f24279b;
        C0229i7 c0229i7 = new C0229i7(m62.f22659g, sk2, i, woVar, a8A, (C0264jh) m62.f22660h.f23291k.a(), c0222i0A);
        Long lValueOf = Long.valueOf(sk2.f22973a);
        Uk uk2 = sk2.f22976d;
        Long lValueOf2 = Long.valueOf(sk2.f22974b);
        EnumC0078cb enumC0078cbA = EnumC0078cb.a(c0229i7.f24052h.f22863d);
        long j10 = 0;
        if (!AbstractC0605x9.f25016g.contains(EnumC0078cb.a(i))) {
            synchronized (woVar) {
                JSONObject jSONObjectA = woVar.f24991a.a();
                jOptLong = jSONObjectA.optLong("global_number", 0L);
                woVar.f24991a.a(jSONObjectA.put("global_number", jOptLong + 1));
            }
            j10 = jOptLong;
        }
        m62.a(m62.f22663l.fromModel(new C0151f7(lValueOf, uk2, lValueOf2, enumC0078cbA, Long.valueOf(j10), Long.valueOf(sk2.f22975c), c0229i7.a())));
        this.f24285h.f23401a.h();
    }
}
