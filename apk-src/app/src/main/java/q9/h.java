package q9;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.go;
import com.google.android.gms.internal.ads.ir;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f31889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g3 f31890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f31891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir f31892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f31893f;

    public h(o oVar, Context context, g3 g3Var, String str, ir irVar) {
        this.f31889b = context;
        this.f31890c = g3Var;
        this.f31891d = str;
        this.f31892e = irVar;
        Objects.requireNonNull(oVar);
        this.f31893f = oVar;
    }

    @Override // q9.q
    public final Object a() {
        o.r(this.f31889b, "app_open");
        return new r2();
    }

    @Override // q9.q
    public final /* synthetic */ Object b() {
        return ((go) this.f31893f.f31946a).h(this.f31889b, this.f31890c, this.f31891d, this.f31892e, 4);
    }

    @Override // q9.q
    public final Object c(x0 x0Var) {
        return x0Var.N2(new xa.b(this.f31889b), this.f31890c, this.f31891d, this.f31892e, ModuleDescriptor.MODULE_VERSION);
    }
}
