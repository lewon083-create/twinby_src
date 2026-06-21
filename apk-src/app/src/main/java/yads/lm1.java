package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lm1 implements xq {
    public static final lm1 H = new lm1(new km1());
    public static final wq I = new zl.g0(4);
    public final CharSequence A;
    public final Integer B;
    public final Integer C;
    public final CharSequence D;
    public final CharSequence E;
    public final CharSequence F;
    public final Bundle G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f40585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f40586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f40587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f40588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f40589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f40590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f40591h;
    public final sl2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sl2 f40592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f40593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f40594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f40595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f40596n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f40597o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f40598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Boolean f40599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f40600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f40601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Integer f40602t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Integer f40603u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Integer f40604v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f40605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Integer f40606x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f40607y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CharSequence f40608z;

    public lm1(km1 km1Var) {
        this.f40585b = km1Var.f40252a;
        this.f40586c = km1Var.f40253b;
        this.f40587d = km1Var.f40254c;
        this.f40588e = km1Var.f40255d;
        this.f40589f = km1Var.f40256e;
        this.f40590g = km1Var.f40257f;
        this.f40591h = km1Var.f40258g;
        this.i = km1Var.f40259h;
        this.f40592j = km1Var.i;
        this.f40593k = km1Var.f40260j;
        this.f40594l = km1Var.f40261k;
        this.f40595m = km1Var.f40262l;
        this.f40596n = km1Var.f40263m;
        this.f40597o = km1Var.f40264n;
        this.f40598p = km1Var.f40265o;
        this.f40599q = km1Var.f40266p;
        Integer num = km1Var.f40267q;
        this.f40600r = num;
        this.f40601s = num;
        this.f40602t = km1Var.f40268r;
        this.f40603u = km1Var.f40269s;
        this.f40604v = km1Var.f40270t;
        this.f40605w = km1Var.f40271u;
        this.f40606x = km1Var.f40272v;
        this.f40607y = km1Var.f40273w;
        this.f40608z = km1Var.f40274x;
        this.A = km1Var.f40275y;
        this.B = km1Var.f40276z;
        this.C = km1Var.A;
        this.D = km1Var.B;
        this.E = km1Var.C;
        this.F = km1Var.D;
        this.G = km1Var.E;
    }

    public static lm1 a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        km1 km1Var = new km1();
        km1Var.f40252a = bundle.getCharSequence(Integer.toString(0, 36));
        km1Var.f40253b = bundle.getCharSequence(Integer.toString(1, 36));
        km1Var.f40254c = bundle.getCharSequence(Integer.toString(2, 36));
        km1Var.f40255d = bundle.getCharSequence(Integer.toString(3, 36));
        km1Var.f40256e = bundle.getCharSequence(Integer.toString(4, 36));
        km1Var.f40257f = bundle.getCharSequence(Integer.toString(5, 36));
        km1Var.f40258g = bundle.getCharSequence(Integer.toString(6, 36));
        byte[] byteArray = bundle.getByteArray(Integer.toString(10, 36));
        Integer numValueOf = bundle.containsKey(Integer.toString(29, 36)) ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
        km1Var.f40260j = byteArray != null ? (byte[]) byteArray.clone() : null;
        km1Var.f40261k = numValueOf;
        km1Var.f40262l = (Uri) bundle.getParcelable(Integer.toString(11, 36));
        km1Var.f40273w = bundle.getCharSequence(Integer.toString(22, 36));
        km1Var.f40274x = bundle.getCharSequence(Integer.toString(23, 36));
        km1Var.f40275y = bundle.getCharSequence(Integer.toString(24, 36));
        km1Var.B = bundle.getCharSequence(Integer.toString(27, 36));
        km1Var.C = bundle.getCharSequence(Integer.toString(28, 36));
        km1Var.D = bundle.getCharSequence(Integer.toString(30, 36));
        km1Var.E = bundle.getBundle(Integer.toString(1000, 36));
        if (bundle.containsKey(Integer.toString(8, 36)) && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
            km1Var.f40259h = (sl2) sl2.f42969b.fromBundle(bundle3);
        }
        if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
            km1Var.i = (sl2) sl2.f42969b.fromBundle(bundle2);
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            km1Var.f40263m = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            km1Var.f40264n = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
        }
        if (bundle.containsKey(Integer.toString(14, 36))) {
            km1Var.f40265o = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            km1Var.f40266p = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            km1Var.f40267q = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
        }
        if (bundle.containsKey(Integer.toString(17, 36))) {
            km1Var.f40268r = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
        }
        if (bundle.containsKey(Integer.toString(18, 36))) {
            km1Var.f40269s = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
        }
        if (bundle.containsKey(Integer.toString(19, 36))) {
            km1Var.f40270t = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
        }
        if (bundle.containsKey(Integer.toString(20, 36))) {
            km1Var.f40271u = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
        }
        if (bundle.containsKey(Integer.toString(21, 36))) {
            km1Var.f40272v = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
        }
        if (bundle.containsKey(Integer.toString(25, 36))) {
            km1Var.f40276z = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
        }
        if (bundle.containsKey(Integer.toString(26, 36))) {
            km1Var.A = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
        }
        return new lm1(km1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lm1.class == obj.getClass()) {
            lm1 lm1Var = (lm1) obj;
            if (lb3.a(this.f40585b, lm1Var.f40585b) && lb3.a(this.f40586c, lm1Var.f40586c) && lb3.a(this.f40587d, lm1Var.f40587d) && lb3.a(this.f40588e, lm1Var.f40588e) && lb3.a(this.f40589f, lm1Var.f40589f) && lb3.a(this.f40590g, lm1Var.f40590g) && lb3.a(this.f40591h, lm1Var.f40591h) && lb3.a(this.i, lm1Var.i) && lb3.a(this.f40592j, lm1Var.f40592j) && Arrays.equals(this.f40593k, lm1Var.f40593k) && lb3.a(this.f40594l, lm1Var.f40594l) && lb3.a(this.f40595m, lm1Var.f40595m) && lb3.a(this.f40596n, lm1Var.f40596n) && lb3.a(this.f40597o, lm1Var.f40597o) && lb3.a(this.f40598p, lm1Var.f40598p) && lb3.a(this.f40599q, lm1Var.f40599q) && lb3.a(this.f40601s, lm1Var.f40601s) && lb3.a(this.f40602t, lm1Var.f40602t) && lb3.a(this.f40603u, lm1Var.f40603u) && lb3.a(this.f40604v, lm1Var.f40604v) && lb3.a(this.f40605w, lm1Var.f40605w) && lb3.a(this.f40606x, lm1Var.f40606x) && lb3.a(this.f40607y, lm1Var.f40607y) && lb3.a(this.f40608z, lm1Var.f40608z) && lb3.a(this.A, lm1Var.A) && lb3.a(this.B, lm1Var.B) && lb3.a(this.C, lm1Var.C) && lb3.a(this.D, lm1Var.D) && lb3.a(this.E, lm1Var.E) && lb3.a(this.F, lm1Var.F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40585b, this.f40586c, this.f40587d, this.f40588e, this.f40589f, this.f40590g, this.f40591h, this.i, this.f40592j, Integer.valueOf(Arrays.hashCode(this.f40593k)), this.f40594l, this.f40595m, this.f40596n, this.f40597o, this.f40598p, this.f40599q, this.f40601s, this.f40602t, this.f40603u, this.f40604v, this.f40605w, this.f40606x, this.f40607y, this.f40608z, this.A, this.B, this.C, this.D, this.E, this.F});
    }
}
