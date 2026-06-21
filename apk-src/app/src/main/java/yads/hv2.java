package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hv2 extends un1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lk3 f39346d;

    public hv2(CustomizableMediaView customizableMediaView, co1 co1Var, lk3 lk3Var) {
        super(customizableMediaView, co1Var);
        this.f39346d = lk3Var;
    }

    @Override // yads.kk3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.f39346d.a();
        customizableMediaView.setVisibility(8);
        customizableMediaView.setOnClickListener(null);
        customizableMediaView.setOnTouchListener(null);
        customizableMediaView.setSelected(false);
    }

    @Override // yads.un1
    public final tn1 d() {
        return tn1.f43378f;
    }

    @Override // yads.kk3
    public final void a(oi oiVar, nk3 nk3Var, Object obj) {
        qn1 qn1Var = (qn1) obj;
        this.f39346d.a(oiVar, nk3Var, a(qn1Var != null ? qn1Var.f42352c : null));
    }

    public static w41 a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (w41) list.get(0);
    }

    @Override // yads.un1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.f39346d.a();
    }

    @Override // yads.kk3
    public final boolean a(View view, Object obj) {
        w41 w41VarA = a(((qn1) obj).f42352c);
        if (w41VarA != null) {
            return this.f39346d.a(w41VarA);
        }
        return false;
    }

    @Override // yads.un1
    /* JADX INFO: renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, qn1 qn1Var) {
        super.b(customizableMediaView, qn1Var);
        w41 w41VarA = a(qn1Var.f42352c);
        if (w41VarA == null) {
            return;
        }
        this.f39346d.b(w41VarA);
    }

    @Override // yads.un1
    public final void a(qn1 qn1Var) {
        w41 w41VarA = a(qn1Var.f42352c);
        if (w41VarA == null) {
            return;
        }
        this.f39346d.b(w41VarA);
    }
}
