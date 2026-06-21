package q9;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.go;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f31909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g3 f31910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f31911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fr f31912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f31913f;

    public j(o oVar, Context context, g3 g3Var, String str, fr frVar) {
        this.f31909b = context;
        this.f31910c = g3Var;
        this.f31911d = str;
        this.f31912e = frVar;
        Objects.requireNonNull(oVar);
        this.f31913f = oVar;
    }

    @Override // q9.q
    public final Object a() {
        o.r(this.f31909b, "interstitial");
        return new r2();
    }

    @Override // q9.q
    public final /* synthetic */ Object b() {
        return ((go) this.f31913f.f31946a).h(this.f31909b, this.f31910c, this.f31911d, this.f31912e, 2);
    }

    @Override // q9.q
    public final Object c(x0 x0Var) {
        return x0Var.z3(new xa.b(this.f31909b), this.f31910c, this.f31911d, this.f31912e, ModuleDescriptor.MODULE_VERSION);
    }
}
