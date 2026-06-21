package m;

import android.content.Context;
import android.view.View;
import com.twinby.R;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends l.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f28203l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f28204m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Context context, l.i iVar, View view) {
        super(context, iVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f28204m = jVar;
        this.f27680f = 8388613;
        i iVar2 = jVar.f28281w;
        this.f27682h = iVar2;
        l.k kVar = this.i;
        if (kVar != null) {
            kVar.e(iVar2);
        }
    }

    @Override // l.n
    public final void c() {
        switch (this.f28203l) {
            case 0:
                j jVar = this.f28204m;
                jVar.f28278t = null;
                jVar.getClass();
                super.c();
                break;
            default:
                j jVar2 = this.f28204m;
                l.i iVar = jVar2.f28263d;
                if (iVar != null) {
                    iVar.c(true);
                }
                jVar2.f28277s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Context context, l.t tVar, View view) {
        super(context, tVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f28204m = jVar;
        if ((tVar.f27704x.f27670x & 32) != 32) {
            View view2 = jVar.i;
            this.f27679e = view2 == null ? jVar.f28267h : view2;
        }
        i iVar = jVar.f28281w;
        this.f27682h = iVar;
        l.k kVar = this.i;
        if (kVar != null) {
            kVar.e(iVar);
        }
    }
}
