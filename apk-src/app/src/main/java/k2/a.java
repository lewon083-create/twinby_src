package k2;

import android.database.DataSetObserver;
import m.n2;
import m.p1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26831b;

    public /* synthetic */ a(int i, Object obj) {
        this.f26830a = i;
        this.f26831b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f26830a) {
            case 0:
                n2 n2Var = (n2) this.f26831b;
                n2Var.f26832b = true;
                n2Var.notifyDataSetChanged();
                break;
            default:
                p1 p1Var = (p1) this.f26831b;
                if (p1Var.isShowing()) {
                    p1Var.show();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f26830a) {
            case 0:
                n2 n2Var = (n2) this.f26831b;
                n2Var.f26832b = false;
                n2Var.notifyDataSetInvalidated();
                break;
            default:
                ((p1) this.f26831b).dismiss();
                break;
        }
    }
}
