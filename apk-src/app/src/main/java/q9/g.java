package q9;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.go;
import com.google.android.gms.internal.ads.ir;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f31856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g3 f31857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f31858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir f31859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f31860f;

    public g(o oVar, Context context, g3 g3Var, String str, ir irVar) {
        this.f31856b = context;
        this.f31857c = g3Var;
        this.f31858d = str;
        this.f31859e = irVar;
        Objects.requireNonNull(oVar);
        this.f31860f = oVar;
    }

    @Override // q9.q
    public final Object a() {
        o.r(this.f31856b, "banner");
        return new r2();
    }

    @Override // q9.q
    public final /* synthetic */ Object b() {
        return ((go) this.f31860f.f31946a).h(this.f31856b, this.f31857c, this.f31858d, this.f31859e, 1);
    }

    @Override // q9.q
    public final Object c(x0 x0Var) {
        return x0Var.D3(new xa.b(this.f31856b), this.f31857c, this.f31858d, this.f31859e, ModuleDescriptor.MODULE_VERSION);
    }
}
