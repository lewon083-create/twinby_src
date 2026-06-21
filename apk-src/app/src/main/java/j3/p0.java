package j3;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.h5;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o[] f26354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26355e;

    static {
        m3.z.G(0);
        m3.z.G(1);
    }

    public p0(String str, o... oVarArr) {
        h5.h(oVarArr.length > 0);
        this.f26352b = str;
        this.f26354d = oVarArr;
        this.f26351a = oVarArr.length;
        String str2 = oVarArr[0].f26335n;
        this.f26353c = TextUtils.isEmpty(str2) ? c0.h(oVarArr[0].f26334m) : c0.h(str2);
        String str3 = oVarArr[0].f26326d;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i = oVarArr[0].f26328f | 16384;
        for (int i10 = 1; i10 < oVarArr.length; i10++) {
            String str4 = oVarArr[i10].f26326d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                b("languages", oVarArr[0].f26326d, oVarArr[i10].f26326d, i10);
                return;
            } else {
                if (i != (oVarArr[i10].f26328f | 16384)) {
                    b("role flags", Integer.toBinaryString(oVarArr[0].f26328f), Integer.toBinaryString(oVarArr[i10].f26328f), i10);
                    return;
                }
            }
        }
    }

    public static void b(String str, String str2, String str3, int i) {
        StringBuilder sbJ = t.z.j("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbJ.append(str3);
        sbJ.append("' (track ");
        sbJ.append(i);
        sbJ.append(")");
        m3.b.f("TrackGroup", "", new IllegalStateException(sbJ.toString()));
    }

    public final int a(o oVar) {
        int i = 0;
        while (true) {
            o[] oVarArr = this.f26354d;
            if (i >= oVarArr.length) {
                return -1;
            }
            if (oVar == oVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p0.class == obj.getClass()) {
            p0 p0Var = (p0) obj;
            if (this.f26352b.equals(p0Var.f26352b) && Arrays.equals(this.f26354d, p0Var.f26354d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f26355e == 0) {
            this.f26355e = Arrays.hashCode(this.f26354d) + gf.a.e(527, 31, this.f26352b);
        }
        return this.f26355e;
    }

    public final String toString() {
        return this.f26352b + ": " + Arrays.toString(this.f26354d);
    }
}
