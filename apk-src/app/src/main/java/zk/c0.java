package zk;

import com.google.android.gms.internal.ads.gn0;
import g0.a2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f46331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f46332b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f46334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f46335e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0 f46337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d0 f46338h;
    public d0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d0 f46339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f46340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f46341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public gn0 f46342m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46333c = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a2 f46336f = new a2(2);

    public static void b(String str, d0 d0Var) {
        if (d0Var != null) {
            if (d0Var.f46352h != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (d0Var.i != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (d0Var.f46353j != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (d0Var.f46354k != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final d0 a() {
        int i = this.f46333c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f46333c).toString());
        }
        x xVar = this.f46331a;
        if (xVar == null) {
            throw new IllegalStateException("request == null");
        }
        v vVar = this.f46332b;
        if (vVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f46334d;
        if (str != null) {
            return new d0(xVar, vVar, str, i, this.f46335e, this.f46336f.g(), this.f46337g, this.f46338h, this.i, this.f46339j, this.f46340k, this.f46341l, this.f46342m);
        }
        throw new IllegalStateException("message == null");
    }
}
