package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q83 implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wq f42218g = new zl.g0(17);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k73 f42220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f42221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f42222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f42223f;

    public q83(k73 k73Var, boolean z5, int[] iArr, boolean[] zArr) {
        int i = k73Var.f40095b;
        this.f42219b = i;
        boolean z10 = false;
        ni.a(i == iArr.length && i == zArr.length);
        this.f42220c = k73Var;
        if (z5 && i > 1) {
            z10 = true;
        }
        this.f42221d = z10;
        this.f42222e = (int[]) iArr.clone();
        this.f42223f = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.f42220c.f40097d;
    }

    public final boolean b() {
        for (boolean z5 : this.f42223f) {
            if (z5) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q83.class == obj.getClass()) {
            q83 q83Var = (q83) obj;
            if (this.f42221d == q83Var.f42221d && this.f42220c.equals(q83Var.f42220c) && Arrays.equals(this.f42222e, q83Var.f42222e) && Arrays.equals(this.f42223f, q83Var.f42223f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f42223f) + ((Arrays.hashCode(this.f42222e) + (((this.f42220c.hashCode() * 31) + (this.f42221d ? 1 : 0)) * 31)) * 31);
    }

    public static q83 a(Bundle bundle) {
        wq wqVar = k73.f40094g;
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        bundle2.getClass();
        k73 k73Var = (k73) wqVar.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int[] iArr = new int[k73Var.f40095b];
        if (intArray == null) {
            intArray = iArr;
        }
        boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
        boolean[] zArr = new boolean[k73Var.f40095b];
        if (booleanArray == null) {
            booleanArray = zArr;
        }
        return new q83(k73Var, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
    }
}
