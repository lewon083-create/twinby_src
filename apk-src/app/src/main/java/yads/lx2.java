package yads;

import android.net.Uri;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lx2 extends cs2 {
    public final /* synthetic */ p30 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u30 f40713j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ px2 f40714k;

    public lx2(px2 px2Var, rr rrVar, u30 u30Var) {
        this.f40714k = px2Var;
        this.i = rrVar;
        this.f40713j = u30Var;
    }

    @Override // yads.cs2
    public final Object b() {
        p30 p30Var = this.i;
        rb2 rb2Var = this.f40714k.f42100b;
        u30 u30Var = this.f40713j;
        u33 u33Var = new u33(p30Var);
        xf1.f44686a.getAndIncrement();
        u33Var.f43544b = 0L;
        r30 r30Var = new r30(u33Var, u30Var);
        try {
            r30Var.f42451a.a(r30Var.f42452b);
            r30Var.f42454d = true;
            Uri uri = u33Var.f43543a.getUri();
            uri.getClass();
            Object objA = rb2Var.a(uri, r30Var);
            lb3.a((Closeable) r30Var);
            objA.getClass();
            return (ev0) objA;
        } catch (Throwable th2) {
            lb3.a((Closeable) r30Var);
            throw th2;
        }
    }
}
