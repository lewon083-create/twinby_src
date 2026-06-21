package yads;

import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mo2 extends no2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f40980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rl2 f40981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yz2 f40982h;

    public mo2(long j10, nx0 nx0Var, r51 r51Var, jx2 jx2Var, ArrayList arrayList) {
        super(nx0Var, r51Var, jx2Var, arrayList);
        Uri.parse(((uo) r51Var.get(0)).f43742a);
        rl2 rl2VarB = jx2Var.b();
        this.f40981g = rl2VarB;
        this.f40980f = null;
        this.f40982h = rl2VarB == null ? new yz2(new rl2(null, 0L, -1L)) : null;
    }

    @Override // yads.no2
    public final String c() {
        return this.f40980f;
    }

    @Override // yads.no2
    public final i30 d() {
        return this.f40982h;
    }

    @Override // yads.no2
    public final rl2 e() {
        return this.f40981g;
    }
}
