package nh;

import a0.b1;
import android.content.Context;
import android.net.ConnectivityManager;
import ii.f;
import ii.i;
import ii.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class b implements ei.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f29334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f29335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f29336d;

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        f fVar = aVar.f16383c;
        Context context = aVar.f16381a;
        this.f29334b = new q(fVar, "dev.fluttercommunity.plus/connectivity");
        this.f29335c = new i(fVar, "dev.fluttercommunity.plus/connectivity_status");
        m7.a aVar2 = new m7.a(1, (ConnectivityManager) context.getSystemService("connectivity"));
        b1 b1Var = new b1(29, aVar2);
        this.f29336d = new a(context, aVar2);
        this.f29334b.b(b1Var);
        this.f29335c.a(this.f29336d);
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        this.f29334b.b(null);
        this.f29335c.a(null);
        this.f29336d.k(null);
        this.f29334b = null;
        this.f29335c = null;
        this.f29336d = null;
    }
}
