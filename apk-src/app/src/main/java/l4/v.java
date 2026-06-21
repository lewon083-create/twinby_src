package l4;

import com.google.android.gms.internal.measurement.h5;
import j3.u0;
import java.util.Objects;
import s3.a1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1[] f27920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r[] f27921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0 f27922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f27923e;

    public v(a1[] a1VarArr, r[] rVarArr, u0 u0Var, Object obj) {
        h5.h(a1VarArr.length == rVarArr.length);
        this.f27920b = a1VarArr;
        this.f27921c = (r[]) rVarArr.clone();
        this.f27922d = u0Var;
        this.f27923e = obj;
        this.f27919a = a1VarArr.length;
    }

    public final boolean a(v vVar, int i) {
        return vVar != null && Objects.equals(this.f27920b[i], vVar.f27920b[i]) && Objects.equals(this.f27921c[i], vVar.f27921c[i]);
    }

    public final boolean b(int i) {
        return this.f27920b[i] != null;
    }
}
