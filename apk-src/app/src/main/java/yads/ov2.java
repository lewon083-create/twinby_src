package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ov2 extends un1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f41743j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final un1 f41744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final un1 f41745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b03 f41746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nm2 f41747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nm2 f41748h;
    public final nv2 i;

    static {
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u(ov2.class, "weakMediaView", "getWeakMediaView()Lcom/monetization/ads/nativeads/CustomizableMediaView;");
        kotlin.jvm.internal.g0.f27511a.getClass();
        f41743j = new dk.i[]{uVar, new kotlin.jvm.internal.u(ov2.class, "weakMediaValue", "getWeakMediaValue()Lcom/monetization/ads/network/model/MediaValue;"), new kotlin.jvm.internal.u(ov2.class, "currentViewAdapter", "getCurrentViewAdapter()Lcom/monetization/ads/nativeads/assetadapter/viewadapter/MediaViewAdapter;")};
    }

    public ov2(CustomizableMediaView customizableMediaView, kv2 kv2Var, un1 un1Var, co1 co1Var, b03 b03Var) {
        super(customizableMediaView, co1Var);
        this.f41744d = kv2Var;
        this.f41745e = un1Var;
        this.f41746f = b03Var;
        this.f41747g = om2.a(null);
        this.f41748h = om2.a(null);
        this.i = new nv2(kv2Var, this);
        customizableMediaView.setOnSizeChangedListener$mobileads_externalRelease(new lv2(new WeakReference(this)));
    }

    @Override // yads.kk3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.f41744d.a((View) customizableMediaView);
        this.f41745e.a((View) customizableMediaView);
    }

    @Override // yads.un1
    public final tn1 d() {
        return ((un1) this.i.getValue(this, f41743j[2])).d();
    }

    @Override // yads.kk3
    public final void a(oi oiVar, nk3 nk3Var, Object obj) {
        qn1 qn1Var = (qn1) obj;
        this.f41744d.a(oiVar, nk3Var, qn1Var);
        this.f41745e.a(oiVar, nk3Var, qn1Var);
    }

    @Override // yads.un1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.f41744d.a(customizableMediaView);
        this.f41745e.a(customizableMediaView);
    }

    @Override // yads.kk3
    public final boolean a(View view, Object obj) {
        return ((un1) this.i.getValue(this, f41743j[2])).a(view, obj);
    }

    @Override // yads.un1
    /* JADX INFO: renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, qn1 qn1Var) {
        nm2 nm2Var = this.f41747g;
        dk.i[] iVarArr = f41743j;
        dk.i iVar = iVarArr[0];
        nm2Var.getClass();
        nm2Var.f41294a = new WeakReference(customizableMediaView);
        nm2 nm2Var2 = this.f41748h;
        dk.i iVar2 = iVarArr[1];
        nm2Var2.getClass();
        nm2Var2.f41294a = new WeakReference(qn1Var);
        ((un1) this.i.getValue(this, iVarArr[2])).b(customizableMediaView, qn1Var);
    }

    @Override // yads.un1
    public final void a(qn1 qn1Var) {
        ((un1) this.i.getValue(this, f41743j[2])).a(qn1Var);
    }
}
