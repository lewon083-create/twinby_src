package yads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k73 implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wq f40094g = new zf.a(28);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nx0[] f40098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40099f;

    public k73(String str, nx0... nx0VarArr) {
        ni.a(nx0VarArr.length > 0);
        this.f40096c = str;
        this.f40098e = nx0VarArr;
        this.f40095b = nx0VarArr.length;
        int iD = jt1.d(nx0VarArr[0].f41375m);
        this.f40097d = iD == -1 ? jt1.d(nx0VarArr[0].f41374l) : iD;
        a();
    }

    public final nx0 a(int i) {
        return this.f40098e[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k73.class == obj.getClass()) {
            k73 k73Var = (k73) obj;
            if (this.f40096c.equals(k73Var.f40096c) && Arrays.equals(this.f40098e, k73Var.f40098e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f40099f == 0) {
            this.f40099f = k4.a(this.f40096c, 527, 31) + Arrays.hashCode(this.f40098e);
        }
        return this.f40099f;
    }

    public final int a(nx0 nx0Var) {
        int i = 0;
        while (true) {
            nx0[] nx0VarArr = this.f40098e;
            if (i >= nx0VarArr.length) {
                return -1;
            }
            if (nx0Var == nx0VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public static k73 a(Bundle bundle) {
        um2 um2VarA;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            o51 o51Var = r51.f42498c;
            um2VarA = um2.f43723f;
        } else {
            um2VarA = yq.a(nx0.I, parcelableArrayList);
        }
        return new k73(bundle.getString(Integer.toString(1, 36), ""), (nx0[]) um2VarA.toArray(new nx0[0]));
    }

    public k73(nx0... nx0VarArr) {
        this("", nx0VarArr);
    }

    public final void a() {
        String str = this.f40098e[0].f41367d;
        if (str == null || str.equals("und")) {
            str = "";
        }
        int i = this.f40098e[0].f41369f | 16384;
        int i10 = 1;
        while (true) {
            nx0[] nx0VarArr = this.f40098e;
            if (i10 >= nx0VarArr.length) {
                return;
            }
            String str2 = nx0VarArr[i10].f41367d;
            if (str2 == null || str2.equals("und")) {
                str2 = "";
            }
            if (!str.equals(str2)) {
                nx0[] nx0VarArr2 = this.f40098e;
                kh1.b("TrackGroup", kh1.a("", new IllegalStateException(t.z.d(i10, ")", t.z.j("Different languages combined in one TrackGroup: '", nx0VarArr2[0].f41367d, "' (track 0) and '", nx0VarArr2[i10].f41367d, "' (track ")))));
                return;
            } else {
                nx0[] nx0VarArr3 = this.f40098e;
                if (i != (nx0VarArr3[i10].f41369f | 16384)) {
                    kh1.b("TrackGroup", kh1.a("", new IllegalStateException(t.z.d(i10, ")", t.z.j("Different role flags combined in one TrackGroup: '", Integer.toBinaryString(nx0VarArr3[0].f41369f), "' (track 0) and '", Integer.toBinaryString(this.f40098e[i10].f41369f), "' (track ")))));
                    return;
                }
                i10++;
            }
        }
    }
}
