package zk;

import com.google.android.gms.internal.measurement.b4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m.t2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f46379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f46380f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f46383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f46384d;

    static {
        f fVar = f.f46375r;
        f fVar2 = f.f46376s;
        f fVar3 = f.f46377t;
        f fVar4 = f.f46369l;
        f fVar5 = f.f46371n;
        f fVar6 = f.f46370m;
        f fVar7 = f.f46372o;
        f fVar8 = f.f46374q;
        f fVar9 = f.f46373p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9};
        f[] fVarArr2 = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f46367j, f.f46368k, f.f46366h, f.i, f.f46364f, f.f46365g, f.f46363e};
        t2 t2Var = new t2();
        t2Var.c((f[]) Arrays.copyOf(fVarArr, 9));
        h0 h0Var = h0.TLS_1_3;
        h0 h0Var2 = h0.TLS_1_2;
        t2Var.e(h0Var, h0Var2);
        t2Var.f28366b = true;
        t2Var.a();
        t2 t2Var2 = new t2();
        t2Var2.c((f[]) Arrays.copyOf(fVarArr2, 16));
        t2Var2.e(h0Var, h0Var2);
        t2Var2.f28366b = true;
        f46379e = t2Var2.a();
        t2 t2Var3 = new t2();
        t2Var3.c((f[]) Arrays.copyOf(fVarArr2, 16));
        t2Var3.e(h0Var, h0Var2, h0.TLS_1_1, h0.TLS_1_0);
        t2Var3.f28366b = true;
        t2Var3.a();
        f46380f = new g(false, false, null, null);
    }

    public g(boolean z5, boolean z10, String[] strArr, String[] strArr2) {
        this.f46381a = z5;
        this.f46382b = z10;
        this.f46383c = strArr;
        this.f46384d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f46383c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f46360b.c(str));
        }
        return CollectionsKt.R(arrayList);
    }

    public final boolean b(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f46381a) {
            return false;
        }
        String[] strArr = this.f46384d;
        if (strArr != null) {
            String[] enabledProtocols = socket.getEnabledProtocols();
            kj.b bVar = kj.b.f27401b;
            Intrinsics.c(bVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
            if (!al.b.h(strArr, enabledProtocols, bVar)) {
                return false;
            }
        }
        String[] strArr2 = this.f46383c;
        return strArr2 == null || al.b.h(strArr2, socket.getEnabledCipherSuites(), f.f46361c);
    }

    public final List c() {
        String[] strArr = this.f46384d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(b4.r(str));
        }
        return CollectionsKt.R(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        g gVar = (g) obj;
        boolean z5 = gVar.f46381a;
        boolean z10 = this.f46381a;
        if (z10 != z5) {
            return false;
        }
        if (z10) {
            return Arrays.equals(this.f46383c, gVar.f46383c) && Arrays.equals(this.f46384d, gVar.f46384d) && this.f46382b == gVar.f46382b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f46381a) {
            return 17;
        }
        String[] strArr = this.f46383c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f46384d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f46382b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f46381a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f46382b + ')';
    }
}
