package uk;

import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.j4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends q0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sk.h f34590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ij.p f34591m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(final String name, final int i) {
        super(name, null, i);
        Intrinsics.checkNotNullParameter(name, "name");
        this.f34590l = sk.h.f32936c;
        this.f34591m = ij.h.b(new Function0() { // from class: uk.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i10 = i;
                sk.f[] fVarArr = new sk.f[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    fVarArr[i11] = j4.d(name + '.' + this.f34572e[i11], sk.i.f32940e, new sk.f[0], new ch.a(16));
                }
                return fVarArr;
            }
        });
    }

    @Override // uk.q0, sk.f
    public final h5 e() {
        return this.f34590l;
    }

    @Override // uk.q0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof sk.f)) {
            return false;
        }
        sk.f fVar = (sk.f) obj;
        return fVar.e() == sk.h.f32936c && Intrinsics.a(this.f34568a, fVar.a()) && Intrinsics.a(o0.b(this), o0.b(fVar));
    }

    @Override // uk.q0
    public final int hashCode() {
        int iHashCode = this.f34568a.hashCode();
        Intrinsics.checkNotNullParameter(this, "<this>");
        ij.t tVar = new ij.t(this);
        int iHashCode2 = 1;
        while (tVar.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) tVar.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // uk.q0, sk.f
    public final sk.f i(int i) {
        return ((sk.f[]) this.f34591m.getValue())[i];
    }

    @Override // uk.q0
    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return CollectionsKt.I(new ek.s(2, this), ", ", a0.u.n(new StringBuilder(), this.f34568a, '('), ")", null, 56);
    }
}
