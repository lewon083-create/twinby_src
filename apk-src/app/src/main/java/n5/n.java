package n5;

import com.google.android.gms.internal.measurement.h5;
import i4.c0;
import java.util.HashMap;
import m3.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements m3.g, m3.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f29128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29129d;

    public /* synthetic */ n(o oVar, long j10, int i) {
        this.f29129d = oVar;
        this.f29128c = j10;
        this.f29127b = i;
    }

    @Override // m3.g
    public void accept(Object obj) {
        o oVar = (o) this.f29129d;
        a aVar = (a) obj;
        oVar.f29137h.getClass();
        byte[] bArrD = l7.b.d(aVar.f29103c, aVar.f29101a);
        p pVar = oVar.f29132c;
        pVar.getClass();
        pVar.K(bArrD.length, bArrD);
        oVar.f29130a.d(bArrD.length, pVar);
        long j10 = aVar.f29102b;
        long j11 = this.f29128c;
        if (j10 == -9223372036854775807L) {
            h5.r(oVar.f29137h.f26340s == Long.MAX_VALUE);
        } else {
            long j12 = oVar.f29137h.f26340s;
            j11 = j12 == Long.MAX_VALUE ? j11 + j10 : j10 + j12;
        }
        oVar.f29130a.f(j11, this.f29127b | 1, bArrD.length, 0, null);
    }

    @Override // m3.k, yads.of1
    public void invoke(Object obj) {
        t3.a aVar = (t3.a) this.f29129d;
        t3.i iVar = (t3.i) obj;
        HashMap map = iVar.f33447h;
        HashMap map2 = iVar.i;
        c0 c0Var = aVar.f33409d;
        if (c0Var != null) {
            String strC = iVar.f33442c.c(aVar.f33407b, c0Var);
            Long l10 = (Long) map2.get(strC);
            Long l11 = (Long) map.get(strC);
            map2.put(strC, Long.valueOf((l10 == null ? 0L : l10.longValue()) + this.f29128c));
            map.put(strC, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) this.f29127b)));
        }
    }

    public /* synthetic */ n(t3.a aVar, int i, long j10, long j11) {
        this.f29129d = aVar;
        this.f29127b = i;
        this.f29128c = j10;
    }
}
