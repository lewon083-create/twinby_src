package zl;

import android.view.View;
import android.widget.CheckBox;
import yads.j72;
import yads.pb;
import yads.r90;
import yads.u90;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46643d;

    public /* synthetic */ u(int i, Object obj, Object obj2) {
        this.f46641b = i;
        this.f46642c = obj;
        this.f46643d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f46641b) {
            case 0:
                j72.a((j72) this.f46642c, (CheckBox) this.f46643d, view);
                break;
            case 1:
                yads.n0.a((yads.n0) this.f46642c, (u90) this.f46643d, view);
                break;
            default:
                pb.a((pb) this.f46642c, (r90) this.f46643d, view);
                break;
        }
    }
}
