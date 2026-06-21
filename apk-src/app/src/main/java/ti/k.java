package ti;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends k9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ka.k f33846c;

    public k(int i, ka.k kVar) {
        this.f33845b = i;
        this.f33846c = kVar;
    }

    @Override // k9.c
    public final void a() {
        ka.k kVar = this.f33846c;
        kVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f33845b));
        map.put("eventName", "onAdClosed");
        kVar.I(map);
    }

    @Override // k9.c
    public final void b(k9.m mVar) {
        this.f33846c.K(this.f33845b, new g(mVar));
    }

    @Override // k9.c
    public final void c() {
        ka.k kVar = this.f33846c;
        kVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f33845b));
        map.put("eventName", "onAdImpression");
        kVar.I(map);
    }

    @Override // k9.c
    public final void i() {
        ka.k kVar = this.f33846c;
        kVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f33845b));
        map.put("eventName", "onAdOpened");
        kVar.I(map);
    }

    @Override // k9.c, q9.a
    public final void onAdClicked() {
        ka.k kVar = this.f33846c;
        kVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f33845b));
        map.put("eventName", "onAdClicked");
        kVar.I(map);
    }
}
