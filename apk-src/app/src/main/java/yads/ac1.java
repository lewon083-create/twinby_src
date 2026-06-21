package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ac1 implements kk.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IntegrationInspectorActivity f36682a;

    public ac1(IntegrationInspectorActivity integrationInspectorActivity) {
        this.f36682a = integrationInspectorActivity;
    }

    @Override // kk.f
    public final Object emit(Object obj, mj.a aVar) {
        p90 p90Var = (p90) obj;
        q90 q90VarC = IntegrationInspectorActivity.c(this.f36682a);
        q90VarC.getClass();
        if (p90Var.f41844c) {
            q90VarC.f42226a.submitList(kotlin.collections.b0.f27475b);
            q90VarC.f42228c.setVisibility(0);
        } else {
            q90VarC.f42226a.submitList(p90Var.f41845d);
            q90VarC.f42228c.setVisibility(8);
        }
        q90VarC.f42227b.setText(p90Var.f41843b.f42831a);
        return Unit.f27471a;
    }
}
