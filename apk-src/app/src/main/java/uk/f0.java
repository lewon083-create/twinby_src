package uk;

import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements sk.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sk.f f34515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sk.f f34516c;

    public f0(String str, sk.f fVar, sk.f fVar2) {
        this.f34514a = str;
        this.f34515b = fVar;
        this.f34516c = fVar2;
    }

    @Override // sk.f
    public final String a() {
        return this.f34514a;
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
        throw new IllegalArgumentException(om1.x(name, " is not a valid map index"));
    }

    @Override // sk.f
    public final h5 e() {
        return sk.i.f32939d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.a(this.f34514a, f0Var.f34514a) && Intrinsics.a(this.f34515b, f0Var.f34515b) && Intrinsics.a(this.f34516c, f0Var.f34516c);
    }

    @Override // sk.f
    public final int f() {
        return 2;
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
        throw new IllegalArgumentException(a0.u.o(l7.o.m(i, "Illegal index ", ", "), this.f34514a, " expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f34516c.hashCode() + ((this.f34515b.hashCode() + (this.f34514a.hashCode() * 31)) * 31);
    }

    @Override // sk.f
    public final sk.f i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a0.u.o(l7.o.m(i, "Illegal index ", ", "), this.f34514a, " expects only non-negative indices").toString());
        }
        int i10 = i % 2;
        if (i10 == 0) {
            return this.f34515b;
        }
        if (i10 == 1) {
            return this.f34516c;
        }
        throw new IllegalStateException("Unreached");
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
        throw new IllegalArgumentException(a0.u.o(l7.o.m(i, "Illegal index ", ", "), this.f34514a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.f34514a + '(' + this.f34515b + ", " + this.f34516c + ')';
    }
}
