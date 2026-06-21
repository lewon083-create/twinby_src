package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z40 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f12864q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f12865r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f12866s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f12867t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f12868u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f12869v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f12870w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f12871x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f12872y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f12873z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f12874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f12875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f12876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f12877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f12878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f12881h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f12882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f12883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f12884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f12885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f12886n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f12887o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f12888p;

    static {
        Layout.Alignment alignment = null;
        float f10 = -3.4028235E38f;
        int i = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        new z40("", alignment, alignment, null, f10, i, i, f10, i, i, f10, f10, f10, i, 0.0f, 0);
        String str = cq0.f4293a;
        f12864q = Integer.toString(0, 36);
        f12865r = Integer.toString(17, 36);
        f12866s = Integer.toString(1, 36);
        f12867t = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f12868u = Integer.toString(18, 36);
        f12869v = Integer.toString(4, 36);
        f12870w = Integer.toString(5, 36);
        f12871x = Integer.toString(6, 36);
        f12872y = Integer.toString(7, 36);
        f12873z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
        F = Integer.toString(14, 36);
        G = Integer.toString(15, 36);
        H = Integer.toString(16, 36);
        I = Integer.toString(19, 36);
    }

    public /* synthetic */ z40(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i, int i10, float f11, int i11, int i12, float f12, float f13, float f14, int i13, float f15, int i14) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            ix.o(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f12874a = SpannedString.valueOf(charSequence);
        } else {
            this.f12874a = charSequence != null ? charSequence.toString() : null;
        }
        this.f12875b = alignment;
        this.f12876c = alignment2;
        this.f12877d = bitmap;
        this.f12878e = f10;
        this.f12879f = i;
        this.f12880g = i10;
        this.f12881h = f11;
        this.i = i11;
        this.f12882j = f13;
        this.f12883k = f14;
        this.f12884l = i12;
        this.f12885m = f12;
        this.f12886n = i13;
        this.f12887o = f15;
        this.f12888p = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z40.class != obj.getClass()) {
            return false;
        }
        z40 z40Var = (z40) obj;
        Bitmap bitmap = z40Var.f12877d;
        if (!TextUtils.equals(this.f12874a, z40Var.f12874a) || this.f12875b != z40Var.f12875b || this.f12876c != z40Var.f12876c) {
            return false;
        }
        Bitmap bitmap2 = this.f12877d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f12878e == z40Var.f12878e && this.f12879f == z40Var.f12879f && this.f12880g == z40Var.f12880g && this.f12881h == z40Var.f12881h && this.i == z40Var.i && this.f12882j == z40Var.f12882j && this.f12883k == z40Var.f12883k && this.f12884l == z40Var.f12884l && this.f12885m == z40Var.f12885m && this.f12886n == z40Var.f12886n && this.f12887o == z40Var.f12887o && this.f12888p == z40Var.f12888p;
    }

    public final int hashCode() {
        return Objects.hash(this.f12874a, this.f12875b, this.f12876c, this.f12877d, Float.valueOf(this.f12878e), Integer.valueOf(this.f12879f), Integer.valueOf(this.f12880g), Float.valueOf(this.f12881h), Integer.valueOf(this.i), Float.valueOf(this.f12882j), Float.valueOf(this.f12883k), Boolean.FALSE, -16777216, Integer.valueOf(this.f12884l), Float.valueOf(this.f12885m), Integer.valueOf(this.f12886n), Float.valueOf(this.f12887o), Integer.valueOf(this.f12888p));
    }
}
