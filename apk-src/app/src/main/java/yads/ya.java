package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ya implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final za3 f44985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f44986d;

    public ya(String str, za3 za3Var, Map map) {
        this.f44984b = str;
        this.f44985c = za3Var;
        this.f44986d = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f44984b.length() > 0) {
            this.f44985c.a(this.f44984b, this.f44986d);
        }
    }
}
