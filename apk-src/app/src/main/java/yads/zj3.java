package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ph3 f45442a;

    public zj3(Context context) {
        this.f45442a = new ph3(context);
    }

    public final void a(yj3 yj3Var, String str) {
        List list = (List) yj3Var.a().get(str);
        if (list != null) {
            this.f45442a.a(list, kotlin.collections.j0.d());
        }
    }
}
