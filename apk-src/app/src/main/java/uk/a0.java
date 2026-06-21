package uk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends q0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f34492l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(String name, b0 generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.f34492l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ij.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [ij.g, java.lang.Object] */
    @Override // uk.q0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            sk.f fVar = (sk.f) obj;
            if (Intrinsics.a(this.f34568a, fVar.a())) {
                a0 a0Var = (a0) obj;
                if (a0Var.f34492l && Arrays.equals((sk.f[]) this.f34576j.getValue(), (sk.f[]) a0Var.f34576j.getValue())) {
                    int iF = fVar.f();
                    int i = this.f34570c;
                    if (i == iF) {
                        for (int i10 = 0; i10 < i; i10++) {
                            if (Intrinsics.a(i(i10).a(), fVar.i(i10).a()) && Intrinsics.a(i(i10).e(), fVar.i(i10).e())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // uk.q0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // uk.q0, sk.f
    public final boolean isInline() {
        return this.f34492l;
    }
}
