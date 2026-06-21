package yads;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dz f42762a;

    public /* synthetic */ rx2() {
        this(new dz());
    }

    public static boolean a(Context context) {
        pt2 pt2VarA = fw2.a().a(context);
        return pt2VarA == null || pt2VarA.f42034j;
    }

    public final boolean b(Context context) {
        pt2 pt2VarA = fw2.a().a(context);
        if (pt2VarA == null || !pt2VarA.i || a(context)) {
            return true;
        }
        this.f42762a.getClass();
        return !Intrinsics.a(fw2.a().b(), pt2VarA.M) && Intrinsics.a(fw2.a().b(), Boolean.TRUE);
    }

    public rx2(dz dzVar) {
        this.f42762a = dzVar;
    }
}
