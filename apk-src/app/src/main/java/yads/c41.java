package yads;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c41 implements f51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hk.j f37268a;

    public c41(hk.l lVar) {
        this.f37268a = lVar;
    }

    @Override // yads.f51
    public final void a(String str, Bitmap bitmap) {
    }

    @Override // yads.f51
    public final void a(Map map) {
        hk.j jVar = this.f37268a;
        ij.k kVar = ij.m.f21341c;
        jVar.resumeWith(new g51(map));
    }
}
