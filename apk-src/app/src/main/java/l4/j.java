package l4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.vk.api.sdk.exceptions.VKApiCodes;
import i4.j1;
import j3.s0;
import java.util.Map;
import java.util.Objects;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends s0 {
    public static final j F = new j(new i());
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f27865w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f27866x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f27867y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f27868z;

    static {
        gf.a.o(1000, 1001, 1002, 1003, VKApiCodes.CODE_PHONE_ALREADY_USED);
        gf.a.o(1005, 1006, 1007, 1008, 1009);
        gf.a.o(1010, 1011, 1012, 1013, 1014);
        z.G(1015);
        z.G(1016);
        z.G(1017);
        z.G(1018);
    }

    public j(i iVar) {
        super(iVar);
        this.f27865w = iVar.f27861w;
        this.f27866x = iVar.f27862x;
        this.f27867y = iVar.f27863y;
        this.f27868z = iVar.f27864z;
        this.A = iVar.A;
        this.B = iVar.B;
        this.C = iVar.C;
        this.D = iVar.D;
        this.E = iVar.E;
    }

    @Override // j3.s0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (super.equals(jVar) && this.f27865w == jVar.f27865w && this.f27866x == jVar.f27866x && this.f27867y == jVar.f27867y && this.f27868z == jVar.f27868z && this.A == jVar.A && this.B == jVar.B && this.C == jVar.C) {
                SparseBooleanArray sparseBooleanArray = jVar.E;
                SparseBooleanArray sparseBooleanArray2 = this.E;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = jVar.D;
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
                                                j1 j1Var = (j1) entry.getKey();
                                                if (!map2.containsKey(j1Var) || !Objects.equals(entry.getValue(), map2.get(j1Var))) {
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

    @Override // j3.s0
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f27865w ? 1 : 0)) * VKApiCodes.CODE_CALL_LINK_OUTDATED) + (this.f27866x ? 1 : 0)) * VKApiCodes.CODE_CALL_LINK_OUTDATED) + (this.f27867y ? 1 : 0)) * 28629151) + (this.f27868z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * VKApiCodes.CODE_CALL_LINK_OUTDATED) + (this.C ? 1 : 0)) * 31;
    }
}
