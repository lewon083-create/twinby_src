package bi;

import com.google.android.gms.internal.ads.rs;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2160g;

    public boolean a(int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        if ((i & (-2097152)) != -2097152 || (i10 = (i >>> 19) & 3) == 1 || (i11 = (i >>> 17) & 3) == 0 || (i12 = (i >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f2154a = i10;
        this.f2155b = q4.b.f31713s[3 - i11];
        int i14 = q4.b.f31714t[i13];
        this.f2157d = i14;
        if (i10 == 2) {
            this.f2157d = i14 / 2;
        } else if (i10 == 0) {
            this.f2157d = i14 / 4;
        }
        int i15 = (i >>> 9) & 1;
        int i16 = 1152;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalArgumentException();
                }
                i16 = 384;
            }
        } else if (i10 != 3) {
            i16 = 576;
        }
        this.f2160g = i16;
        if (i11 == 3) {
            int i17 = i10 == 3 ? q4.b.f31715u[i12 - 1] : q4.b.f31716v[i12 - 1];
            this.f2159f = i17;
            this.f2156c = (((i17 * 12) / this.f2157d) + i15) * 4;
        } else {
            if (i10 == 3) {
                int i18 = i11 == 2 ? q4.b.f31717w[i12 - 1] : q4.b.f31718x[i12 - 1];
                this.f2159f = i18;
                this.f2156c = ((i18 * 144) / this.f2157d) + i15;
            } else {
                int i19 = q4.b.f31719y[i12 - 1];
                this.f2159f = i19;
                this.f2156c = (((i11 == 1 ? 72 : 144) * i19) / this.f2157d) + i15;
            }
        }
        this.f2158e = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public boolean b(int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        if ((i & (-2097152)) != -2097152 || (i10 = (i >>> 19) & 3) == 1 || (i11 = (i >>> 17) & 3) == 0 || (i12 = (i >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i14 = i12 - 1;
        this.f2154a = i10;
        this.f2155b = rs.f10035d[3 - i11];
        int i15 = rs.f10036e[i13];
        this.f2157d = i15;
        if (i10 == 2) {
            i15 /= 2;
            this.f2157d = i15;
        } else if (i10 == 0) {
            i15 /= 4;
            this.f2157d = i15;
        }
        int i16 = (i >>> 9) & 1;
        int i17 = 1152;
        if (i11 != 1) {
            if (i11 != 2) {
                i17 = 384;
            }
        } else if (i10 != 3) {
            i17 = 576;
        }
        this.f2160g = i17;
        if (i11 == 3) {
            int i18 = i10 == 3 ? rs.f10037f[i14] : rs.f10038g[i14];
            this.f2159f = i18;
            this.f2156c = (((i18 * 12) / i15) + i16) * 4;
        } else {
            if (i10 == 3) {
                int i19 = i11 == 2 ? rs.f10039h[i14] : rs.i[i14];
                this.f2159f = i19;
                this.f2156c = ((i19 * 144) / i15) + i16;
            } else {
                int i20 = rs.f10040j[i14];
                this.f2159f = i20;
                this.f2156c = (((i11 == 1 ? 72 : 144) * i20) / i15) + i16;
            }
        }
        this.f2158e = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
