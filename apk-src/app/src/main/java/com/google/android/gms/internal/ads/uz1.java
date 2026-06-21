package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class uz1 extends mn {
    public static final uz1 F = new uz1(new tz1());
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f11139w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f11140x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f11141y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f11142z;

    static {
        String str = cq0.f4293a;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(VKApiCodes.CODE_PHONE_ALREADY_USED, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public uz1(tz1 tz1Var) {
        super(tz1Var);
        this.f11139w = tz1Var.f10763w;
        this.f11140x = tz1Var.f10764x;
        this.f11141y = tz1Var.f10765y;
        this.f11142z = tz1Var.f10766z;
        this.A = tz1Var.A;
        this.B = tz1Var.B;
        this.C = tz1Var.C;
        this.D = tz1Var.D;
        this.E = tz1Var.E;
    }

    @Override // com.google.android.gms.internal.ads.mn
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uz1.class == obj.getClass()) {
            uz1 uz1Var = (uz1) obj;
            if (super.equals(uz1Var) && this.f11139w == uz1Var.f11139w && this.f11140x == uz1Var.f11140x && this.f11141y == uz1Var.f11141y && this.f11142z == uz1Var.f11142z && this.A == uz1Var.A && this.B == uz1Var.B && this.C == uz1Var.C) {
                SparseBooleanArray sparseBooleanArray = uz1Var.E;
                SparseBooleanArray sparseBooleanArray2 = this.E;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = uz1Var.D;
                            SparseArray sparseArray2 = this.D;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i10 = 0; i10 < size2; i10++) {
                                    int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i10));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i10);
                                        Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                mz1 mz1Var = (mz1) entry.getKey();
                                                if (!map2.containsKey(mz1Var) || !Objects.equals(entry.getValue(), map2.get(mz1Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mn
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f11139w ? 1 : 0)) * VKApiCodes.CODE_CALL_LINK_OUTDATED) + (this.f11140x ? 1 : 0)) * VKApiCodes.CODE_CALL_LINK_OUTDATED) + (this.f11141y ? 1 : 0)) * 28629151) + (this.f11142z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * VKApiCodes.CODE_CALL_LINK_OUTDATED) + (this.C ? 1 : 0)) * 31;
    }
}
