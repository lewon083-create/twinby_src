package q9;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.go;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f31898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g3 f31899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f31900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f31901e;

    public i(o oVar, Context context, g3 g3Var, String str) {
        this.f31898b = context;
        this.f31899c = g3Var;
        this.f31900d = str;
        Objects.requireNonNull(oVar);
        this.f31901e = oVar;
    }

    @Override // q9.q
    public final Object a() {
        o.r(this.f31898b, "search");
        return new r2();
    }

    @Override // q9.q
    public final /* synthetic */ Object b() {
        return ((go) this.f31901e.f31946a).h(this.f31898b, this.f31899c, this.f31900d, null, 3);
    }

    @Override // q9.q
    public final Object c(x0 x0Var) {
        return x0Var.F2(new xa.b(this.f31898b), this.f31899c, this.f31900d, ModuleDescriptor.MODULE_VERSION);
    }
}
