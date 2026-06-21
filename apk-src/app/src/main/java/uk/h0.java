package uk;

import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h0 implements sk.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sk.f f34526a;

    public h0(sk.f fVar) {
        this.f34526a = fVar;
    }

    @Override // sk.f
    public final boolean c() {
        return false;
    }

    @Override // sk.f
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(om1.x(name, " is not a valid list index"));
    }

    @Override // sk.f
    public final h5 e() {
        return sk.i.f32938c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.a(this.f34526a, h0Var.f34526a) && Intrinsics.a(a(), h0Var.a());
    }

    @Override // sk.f
    public final int f() {
        return 1;
    }

    @Override // sk.f
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // sk.f
    public final List getAnnotations() {
        return kotlin.collections.b0.f27475b;
    }

    @Override // sk.f
    public final List h(int i) {
        if (i >= 0) {
            return kotlin.collections.b0.f27475b;
        }
        StringBuilder sbM = l7.o.m(i, "Illegal index ", ", ");
        sbM.append(a());
        sbM.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f34526a.hashCode() * 31);
    }

    @Override // sk.f
    public final sk.f i(int i) {
        if (i >= 0) {
            return this.f34526a;
        }
        StringBuilder sbM = l7.o.m(i, "Illegal index ", ", ");
        sbM.append(a());
        sbM.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM.toString().toString());
    }

    @Override // sk.f
    public final boolean isInline() {
        return false;
    }

    @Override // sk.f
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbM = l7.o.m(i, "Illegal index ", ", ");
        sbM.append(a());
        sbM.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.f34526a + ')';
    }
}
