package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e6 implements xq {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e6 f38020h = new e6(null, new d6[0], 0, -9223372036854775807L, 0);
    public static final d6 i = new d6(0, -1, new int[0], new Uri[0], new long[0], 0, false).a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final wq f38021j = new zf.a(18);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f38022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f38024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f38025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d6[] f38027g;

    public e6(Object obj, d6[] d6VarArr, long j10, long j11, int i10) {
        this.f38022b = obj;
        this.f38024d = j10;
        this.f38025e = j11;
        this.f38023c = d6VarArr.length + i10;
        this.f38027g = d6VarArr;
        this.f38026f = i10;
    }

    public static e6 a(Bundle bundle) {
        d6[] d6VarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
        if (parcelableArrayList == null) {
            d6VarArr = new d6[0];
        } else {
            d6[] d6VarArr2 = new d6[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                d6VarArr2[i10] = (d6) d6.i.fromBundle((Bundle) parcelableArrayList.get(i10));
            }
            d6VarArr = d6VarArr2;
        }
        return new e6(null, d6VarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e6.class == obj.getClass()) {
            e6 e6Var = (e6) obj;
            if (lb3.a(this.f38022b, e6Var.f38022b) && this.f38023c == e6Var.f38023c && this.f38024d == e6Var.f38024d && this.f38025e == e6Var.f38025e && this.f38026f == e6Var.f38026f && Arrays.equals(this.f38027g, e6Var.f38027g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f38023c * 31;
        Object obj = this.f38022b;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f38024d)) * 31) + ((int) this.f38025e)) * 31) + this.f38026f) * 31) + Arrays.hashCode(this.f38027g);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f38022b);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f38024d);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f38027g.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f38027g[i10].f37631b);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f38027g[i10].f37634e.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f38027g[i10].f37634e[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f38027g[i10].f37635f[i11]);
                sb2.append(')');
                if (i11 < this.f38027g[i10].f37634e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f38027g.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    public final d6 a(int i10) {
        int i11 = this.f38026f;
        if (i10 < i11) {
            return i;
        }
        return this.f38027g[i10 - i11];
    }
}
