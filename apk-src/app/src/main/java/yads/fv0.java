package yads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fv0 implements rb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rb2 f38558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38559b;

    public fv0(e30 e30Var, List list) {
        this.f38558a = e30Var;
        this.f38559b = list;
    }

    @Override // yads.rb2
    public final Object a(Uri uri, r30 r30Var) {
        ev0 ev0Var = (ev0) this.f38558a.a(uri, r30Var);
        List list = this.f38559b;
        if (list == null || list.isEmpty()) {
            return ev0Var;
        }
        return ((c30) ev0Var).a(this.f38559b);
    }
}
