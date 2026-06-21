package yads;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tq0 implements uq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ug2 f43413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vg2 f43414c;

    public tq0(Context context, ug2 ug2Var, vg2 vg2Var) {
        this.f43412a = context;
        this.f43413b = ug2Var;
        this.f43414c = vg2Var;
    }

    @Override // yads.uq0
    public final Parcelable getValue() {
        vg2 vg2Var = this.f43414c;
        Context context = this.f43412a;
        ug2 ug2Var = this.f43413b;
        vg2Var.getClass();
        return vg2.a(context, ug2Var);
    }
}
