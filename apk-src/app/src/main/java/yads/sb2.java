package yads;

import android.net.Uri;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sb2 implements dg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u30 f42879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u33 f42881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rb2 f42882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f42883f;

    public sb2(int i, p30 p30Var, u30 u30Var, rb2 rb2Var) {
        this.f42881d = new u33(p30Var);
        this.f42879b = u30Var;
        this.f42880c = i;
        this.f42882e = rb2Var;
        this.f42878a = xf1.a();
    }

    @Override // yads.dg1
    public final void a() {
        this.f42881d.f43544b = 0L;
        r30 r30Var = new r30(this.f42881d, this.f42879b);
        try {
            r30Var.f42451a.a(r30Var.f42452b);
            r30Var.f42454d = true;
            Uri uri = this.f42881d.f43543a.getUri();
            uri.getClass();
            this.f42883f = this.f42882e.a(uri, r30Var);
        } finally {
            lb3.a((Closeable) r30Var);
        }
    }

    public sb2(p30 p30Var, Uri uri, int i, rb2 rb2Var) {
        this(i, p30Var, new t30().a(uri).a(1).a(), rb2Var);
    }

    @Override // yads.dg1
    public final void b() {
    }
}
