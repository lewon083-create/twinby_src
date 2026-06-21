package uk;

import com.google.android.gms.internal.measurement.h5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u0 implements sk.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sk.e f34593b;

    public u0(String serialName, sk.e kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f34592a = serialName;
        this.f34593b = kind;
    }

    @Override // sk.f
    public final String a() {
        return this.f34592a;
    }

    @Override // sk.f
    public final boolean c() {
        return false;
    }

    @Override // sk.f
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // sk.f
    public final h5 e() {
        return this.f34593b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.a(this.f34592a, u0Var.f34592a) && Intrinsics.a(this.f34593b, u0Var.f34593b);
    }

    @Override // sk.f
    public final int f() {
        return 0;
    }

    @Override // sk.f
    public final String g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // sk.f
    public final List getAnnotations() {
        return kotlin.collections.b0.f27475b;
    }

    @Override // sk.f
    public final List h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f34593b.hashCode() * 31) + this.f34592a.hashCode();
    }

    @Override // sk.f
    public final sk.f i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // sk.f
    public final boolean isInline() {
        return false;
    }

    @Override // sk.f
    public final boolean j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return a0.u.n(new StringBuilder("PrimitiveDescriptor("), this.f34592a, ')');
    }
}
