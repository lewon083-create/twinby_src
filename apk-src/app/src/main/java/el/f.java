package el;

import com.google.android.gms.internal.ads.gn0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zk.d0;
import zk.n;
import zk.o;
import zk.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl.g f16436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gn0 f16439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f16440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f16443h;
    public int i;

    public f(dl.g call, ArrayList interceptors, int i, gn0 gn0Var, x request, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f16436a = call;
        this.f16437b = interceptors;
        this.f16438c = i;
        this.f16439d = gn0Var;
        this.f16440e = request;
        this.f16441f = i10;
        this.f16442g = i11;
        this.f16443h = i12;
    }

    public static f a(f fVar, int i, gn0 gn0Var, x xVar, int i10) {
        if ((i10 & 1) != 0) {
            i = fVar.f16438c;
        }
        int i11 = i;
        if ((i10 & 2) != 0) {
            gn0Var = fVar.f16439d;
        }
        gn0 gn0Var2 = gn0Var;
        if ((i10 & 4) != 0) {
            xVar = fVar.f16440e;
        }
        x request = xVar;
        int i12 = fVar.f16441f;
        int i13 = fVar.f16442g;
        int i14 = fVar.f16443h;
        Intrinsics.checkNotNullParameter(request, "request");
        return new f(fVar.f16436a, fVar.f16437b, i11, gn0Var2, request, i12, i13, i14);
    }

    public final d0 b(x request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = this.f16437b;
        int size = arrayList.size();
        int i = this.f16438c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        gn0 gn0Var = this.f16439d;
        if (gn0Var != null) {
            if (!((dl.d) gn0Var.f5876e).d(request.f46511a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i10 = i + 1;
        f fVarA = a(this, i10, null, request, 58);
        o oVar = (o) arrayList.get(i);
        d0 d0VarIntercept = oVar.intercept(fVarA);
        if (d0VarIntercept == null) {
            throw new NullPointerException("interceptor " + oVar + " returned null");
        }
        if (gn0Var != null && i10 < arrayList.size() && fVarA.i != 1) {
            throw new IllegalStateException(("network interceptor " + oVar + " must call proceed() exactly once").toString());
        }
        if (d0VarIntercept.f46352h != null) {
            return d0VarIntercept;
        }
        throw new IllegalStateException(("interceptor " + oVar + " returned a response with no body").toString());
    }
}
