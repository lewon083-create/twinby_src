package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class oc0 implements o30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o30 f41507b;

    public oc0(Context context, o30 o30Var) {
        this.f41506a = context.getApplicationContext();
        this.f41507b = o30Var;
    }

    @Override // yads.o30
    public final p30 createDataSource() {
        return new pc0(this.f41506a, this.f41507b.createDataSource());
    }
}
