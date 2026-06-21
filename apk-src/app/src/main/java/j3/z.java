package j3;

import ad.b1;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.w6;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    public static final z B;
    public final ad.j0 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f26419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f26420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f26421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f26422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f26423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f26424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f26425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f26426h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f26427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f26428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f26429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f26430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f26431n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f26432o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f26433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f26434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f26435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CharSequence f26436s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CharSequence f26437t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CharSequence f26438u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Integer f26439v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f26440w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CharSequence f26441x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f26442y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Integer f26443z;

    static {
        w6 w6Var = new w6();
        ad.h0 h0Var = ad.j0.f818c;
        w6Var.f11679z = b1.f768f;
        B = new z(w6Var);
        gf.a.o(0, 1, 2, 3, 4);
        gf.a.o(5, 6, 8, 9, 10);
        gf.a.o(11, 12, 13, 14, 15);
        gf.a.o(16, 17, 18, 19, 20);
        gf.a.o(21, 22, 23, 24, 25);
        gf.a.o(26, 27, 28, 29, 30);
        gf.a.o(31, 32, 33, 34, 1000);
    }

    public z(w6 w6Var) {
        Boolean boolValueOf = w6Var.f11664k;
        Integer numValueOf = w6Var.f11663j;
        Integer numValueOf2 = w6Var.f11678y;
        int i = 1;
        int i10 = 0;
        int i11 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i11 = i;
                }
                numValueOf = Integer.valueOf(i11);
            }
        } else if (numValueOf != null) {
            boolean z5 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z5);
            if (z5 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i10 = 21;
                        break;
                    case 3:
                        i10 = 22;
                        break;
                    case 4:
                        i10 = 23;
                        break;
                    case 5:
                        i10 = 24;
                        break;
                    case 6:
                        i10 = 25;
                        break;
                    default:
                        i10 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i10);
            }
        }
        this.f26419a = w6Var.f11655a;
        this.f26420b = w6Var.f11656b;
        this.f26421c = w6Var.f11657c;
        this.f26422d = w6Var.f11658d;
        this.f26423e = w6Var.f11659e;
        this.f26424f = w6Var.f11660f;
        this.f26425g = w6Var.f11661g;
        this.f26426h = w6Var.f11662h;
        this.i = w6Var.i;
        this.f26427j = numValueOf;
        this.f26428k = boolValueOf;
        Integer num = w6Var.f11665l;
        this.f26429l = num;
        this.f26430m = num;
        this.f26431n = w6Var.f11666m;
        this.f26432o = w6Var.f11667n;
        this.f26433p = w6Var.f11668o;
        this.f26434q = w6Var.f11669p;
        this.f26435r = w6Var.f11670q;
        this.f26436s = w6Var.f11671r;
        this.f26437t = w6Var.f11672s;
        this.f26438u = w6Var.f11673t;
        this.f26439v = w6Var.f11674u;
        this.f26440w = w6Var.f11675v;
        this.f26441x = w6Var.f11676w;
        this.f26442y = w6Var.f11677x;
        this.f26443z = numValueOf2;
        this.A = (ad.j0) w6Var.f11679z;
    }

    public final w6 a() {
        w6 w6Var = new w6();
        w6Var.f11655a = this.f26419a;
        w6Var.f11656b = this.f26420b;
        w6Var.f11657c = this.f26421c;
        w6Var.f11658d = this.f26422d;
        w6Var.f11659e = this.f26423e;
        w6Var.f11660f = this.f26424f;
        w6Var.f11661g = this.f26425g;
        w6Var.f11662h = this.f26426h;
        w6Var.i = this.i;
        w6Var.f11663j = this.f26427j;
        w6Var.f11664k = this.f26428k;
        w6Var.f11665l = this.f26430m;
        w6Var.f11666m = this.f26431n;
        w6Var.f11667n = this.f26432o;
        w6Var.f11668o = this.f26433p;
        w6Var.f11669p = this.f26434q;
        w6Var.f11670q = this.f26435r;
        w6Var.f11671r = this.f26436s;
        w6Var.f11672s = this.f26437t;
        w6Var.f11673t = this.f26438u;
        w6Var.f11674u = this.f26439v;
        w6Var.f11675v = this.f26440w;
        w6Var.f11676w = this.f26441x;
        w6Var.f11677x = this.f26442y;
        w6Var.f11678y = this.f26443z;
        w6Var.f11679z = this.A;
        return w6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return TextUtils.equals(this.f26419a, zVar.f26419a) && TextUtils.equals(this.f26420b, zVar.f26420b) && TextUtils.equals(this.f26421c, zVar.f26421c) && TextUtils.equals(this.f26422d, zVar.f26422d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.f26423e, zVar.f26423e) && Arrays.equals(this.f26424f, zVar.f26424f) && Objects.equals(this.f26425g, zVar.f26425g) && Objects.equals(this.f26426h, zVar.f26426h) && Objects.equals(this.i, zVar.i) && Objects.equals(this.f26427j, zVar.f26427j) && Objects.equals(this.f26428k, zVar.f26428k) && Objects.equals(this.f26430m, zVar.f26430m) && Objects.equals(this.f26431n, zVar.f26431n) && Objects.equals(this.f26432o, zVar.f26432o) && Objects.equals(this.f26433p, zVar.f26433p) && Objects.equals(this.f26434q, zVar.f26434q) && Objects.equals(this.f26435r, zVar.f26435r) && TextUtils.equals(this.f26436s, zVar.f26436s) && TextUtils.equals(this.f26437t, zVar.f26437t) && TextUtils.equals(this.f26438u, zVar.f26438u) && Objects.equals(this.f26439v, zVar.f26439v) && Objects.equals(this.f26440w, zVar.f26440w) && TextUtils.equals(this.f26441x, zVar.f26441x) && TextUtils.equals(null, null) && TextUtils.equals(this.f26442y, zVar.f26442y) && Objects.equals(this.f26443z, zVar.f26443z) && Objects.equals(this.A, zVar.A);
    }

    public final int hashCode() {
        return Objects.hash(this.f26419a, this.f26420b, this.f26421c, this.f26422d, null, null, this.f26423e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f26424f)), this.f26425g, null, this.f26426h, this.i, this.f26427j, this.f26428k, null, this.f26430m, this.f26431n, this.f26432o, this.f26433p, this.f26434q, this.f26435r, this.f26436s, this.f26437t, this.f26438u, this.f26439v, this.f26440w, this.f26441x, null, this.f26442y, this.f26443z, true, this.A);
    }
}
