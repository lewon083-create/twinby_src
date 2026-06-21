package r7;

import android.os.Build;
import l7.n;
import u7.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f32271e = n.i("NetworkMeteredCtrlr");

    @Override // r7.c
    public final boolean a(j jVar) {
        return jVar.f34338j.f28011a == 5;
    }

    @Override // r7.c
    public final boolean b(Object obj) {
        q7.a aVar = (q7.a) obj;
        if (Build.VERSION.SDK_INT >= 26) {
            return (aVar.f31779a && aVar.f31781c) ? false : true;
        }
        n.g().e(f32271e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !aVar.f31779a;
    }
}
