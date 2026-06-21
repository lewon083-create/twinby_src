package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nv2 extends zj.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ov2 f41357a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv2(kv2 kv2Var, ov2 ov2Var) {
        super(kv2Var);
        this.f41357a = ov2Var;
    }

    @Override // zj.b
    public final void afterChange(dk.i property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        un1 un1Var = (un1) obj2;
        un1 un1Var2 = (un1) obj;
        if (Intrinsics.a(un1Var, un1Var2)) {
            return;
        }
        nm2 nm2Var = this.f41357a.f41747g;
        dk.i[] iVarArr = ov2.f41743j;
        dk.i iVar = iVarArr[0];
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) nm2Var.f41294a.get();
        if (customizableMediaView == null) {
            return;
        }
        nm2 nm2Var2 = this.f41357a.f41748h;
        dk.i iVar2 = iVarArr[1];
        qn1 qn1Var = (qn1) nm2Var2.f41294a.get();
        if (qn1Var == null) {
            return;
        }
        un1Var2.a(customizableMediaView);
        customizableMediaView.post(new mv2(un1Var, customizableMediaView, qn1Var));
    }
}
