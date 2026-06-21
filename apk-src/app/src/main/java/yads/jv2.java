package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jv2 extends un1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lk3 f39996d;

    public jv2(CustomizableMediaView customizableMediaView, co1 co1Var, lk3 lk3Var) {
        super(customizableMediaView, co1Var);
        this.f39996d = lk3Var;
    }

    @Override // yads.kk3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.f39996d.a();
        customizableMediaView.setVisibility(8);
        customizableMediaView.setOnClickListener(null);
        customizableMediaView.setOnTouchListener(null);
        customizableMediaView.setSelected(false);
    }

    @Override // yads.un1
    public final tn1 d() {
        return tn1.f43377e;
    }

    @Override // yads.kk3
    public final void a(oi oiVar, nk3 nk3Var, Object obj) {
        qn1 qn1Var = (qn1) obj;
        this.f39996d.a(oiVar, nk3Var, qn1Var != null ? qn1Var.f42352c : null);
    }

    @Override // yads.un1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.f39996d.a();
    }

    @Override // yads.kk3
    public final boolean a(View view, Object obj) {
        List list = ((qn1) obj).f42352c;
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        return this.f39996d.a(list);
    }

    @Override // yads.un1
    /* JADX INFO: renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, qn1 qn1Var) {
        super.b(customizableMediaView, qn1Var);
        List list = qn1Var.f42352c;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        this.f39996d.b(list);
    }

    @Override // yads.un1
    public final void a(qn1 qn1Var) {
        List list = qn1Var.f42352c;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        this.f39996d.b(list);
    }
}
