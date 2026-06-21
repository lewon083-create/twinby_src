package yads;

import android.content.Context;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ov0 implements d03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c03 f41737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fn f41738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f41741e;

    public ov0(int i, int i10, c03 c03Var, fn fnVar) {
        this.f41737a = c03Var;
        this.f41738b = fnVar;
        this.f41739c = (i >= 0 || -1 == i) ? i : 0;
        this.f41740d = (i10 >= 0 || -2 == i10) ? i10 : 0;
        String str = String.format(Locale.US, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i10)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        this.f41741e = str;
    }

    @Override // yads.d03
    public final int a(Context context) {
        int i = this.f41740d;
        return -2 == i ? nl3.b(context) : i;
    }

    @Override // yads.d03
    public final c03 b() {
        return this.f41737a;
    }

    @Override // yads.d03
    public final int c(Context context) {
        int i = this.f41739c;
        return -1 == i ? nl3.d(context) : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ov0.class.equals(obj.getClass())) {
            ov0 ov0Var = (ov0) obj;
            if (this.f41739c == ov0Var.f41739c && this.f41740d == ov0Var.f41740d && this.f41737a == ov0Var.f41737a) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.d03
    public final int getHeight() {
        return this.f41740d;
    }

    @Override // yads.d03
    public final int getWidth() {
        return this.f41739c;
    }

    public final int hashCode() {
        return this.f41737a.hashCode() + k4.a(this.f41741e, ((this.f41739c * 31) + this.f41740d) * 31, 31);
    }

    public final String toString() {
        return this.f41741e;
    }

    @Override // yads.d03
    public final fn a() {
        return this.f41738b;
    }
}
