package a9;

import android.content.Context;
import fh.nd;
import fh.of;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f536b;

    public /* synthetic */ c(int i, Object obj) {
        this.f535a = i;
        this.f536b = obj;
    }

    @Override // hj.a
    public final Object get() {
        switch (this.f535a) {
            case 0:
                return this.f536b;
            default:
                return new x7.b((Context) ((c) this.f536b).f536b, new of(), new nd());
        }
    }
}
