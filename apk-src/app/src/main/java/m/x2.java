package m;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28403b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28404c;

    public x2(d3 d3Var) {
        this.f28404c = d3Var;
        d3Var.f28190a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28403b) {
            case 0:
                z2 z2Var = ((Toolbar) this.f28404c).L;
                l.j jVar = z2Var == null ? null : z2Var.f28418c;
                if (jVar != null) {
                    jVar.collapseActionView();
                }
                break;
            default:
                d3 d3Var = (d3) this.f28404c;
                if (d3Var.f28199k != null) {
                    d3Var.getClass();
                }
                break;
        }
    }

    public x2(Toolbar toolbar) {
        this.f28404c = toolbar;
    }
}
