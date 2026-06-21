package ti;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends k9.v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ka.k f33819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33820f;

    public f0(int i, ka.k kVar) {
        this.f33819e = kVar;
        this.f33820f = i;
    }

    @Override // k9.v
    public final void a() {
        ka.k kVar = this.f33819e;
        kVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f33820f));
        map.put("eventName", "onAdClicked");
        kVar.I(map);
    }

    @Override // k9.v
    public final void c() {
        ka.k kVar = this.f33819e;
        kVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f33820f));
        map.put("eventName", "onAdDismissedFullScreenContent");
        kVar.I(map);
    }

    @Override // k9.v
    public final void e(la.m mVar) {
        ka.k kVar = this.f33819e;
        kVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f33820f));
        map.put("eventName", "onFailedToShowFullScreenContent");
        map.put("error", new e(mVar));
        kVar.I(map);
    }

    @Override // k9.v
    public final void f() {
        ka.k kVar = this.f33819e;
        kVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f33820f));
        map.put("eventName", "onAdImpression");
        kVar.I(map);
    }

    @Override // k9.v
    public final void j() {
        ka.k kVar = this.f33819e;
        kVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f33820f));
        map.put("eventName", "onAdShowedFullScreenContent");
        kVar.I(map);
    }
}
