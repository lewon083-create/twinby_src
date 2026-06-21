package yads;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mx1 extends kk3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi2 f41091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ko2 f41092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9 f41093e;

    public mx1(y6.m mVar, oi2 oi2Var, ct1 ct1Var, v9 v9Var) {
        super(mVar);
        this.f41091c = oi2Var;
        this.f41092d = ct1Var;
        this.f41093e = v9Var;
    }

    @Override // yads.kk3
    public final boolean a(View view, Object obj) {
        return ((y6.m) view).getAdapter() instanceof jx1;
    }

    @Override // yads.kk3
    public final void b(View view, Object obj) {
        try {
            ((y6.m) view).setAdapter(new jx1(this.f41091c, (List) obj, this.f41093e));
        } catch (IllegalArgumentException e3) {
            ko2 ko2Var = this.f41092d;
            String message = e3.getMessage();
            if (message == null) {
                message = "IllegalArgumentException: set adapter exception";
            }
            ko2Var.reportError(message, e3);
        }
    }
}
