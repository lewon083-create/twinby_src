package l3;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.h5;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Objects;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f27765s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f27766t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f27767u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f27768v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f27769w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f27770x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f27771y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f27772z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f27773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f27774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f27775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f27776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f27777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f27780h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f27781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f27782k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f27783l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f27784m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f27785n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f27786o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f27787p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f27788q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f27789r;

    static {
        new b("", null, null, null, -3.4028235E38f, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, 0.0f, 0);
        String str = z.f28608a;
        f27765s = Integer.toString(0, 36);
        f27766t = Integer.toString(17, 36);
        f27767u = Integer.toString(1, 36);
        f27768v = Integer.toString(2, 36);
        f27769w = Integer.toString(3, 36);
        f27770x = Integer.toString(18, 36);
        f27771y = Integer.toString(4, 36);
        f27772z = Integer.toString(5, 36);
        A = Integer.toString(6, 36);
        B = Integer.toString(7, 36);
        C = Integer.toString(8, 36);
        D = Integer.toString(9, 36);
        E = Integer.toString(10, 36);
        F = Integer.toString(11, 36);
        G = Integer.toString(12, 36);
        H = Integer.toString(13, 36);
        I = Integer.toString(14, 36);
        J = Integer.toString(15, 36);
        K = Integer.toString(16, 36);
        L = Integer.toString(19, 36);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i, int i10, float f11, int i11, int i12, float f12, float f13, float f14, boolean z5, int i13, int i14, float f15, int i15) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            h5.h(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f27773a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f27773a = charSequence.toString();
        } else {
            this.f27773a = null;
        }
        this.f27774b = alignment;
        this.f27775c = alignment2;
        this.f27776d = bitmap;
        this.f27777e = f10;
        this.f27778f = i;
        this.f27779g = i10;
        this.f27780h = f11;
        this.i = i11;
        this.f27781j = f13;
        this.f27782k = f14;
        this.f27783l = z5;
        this.f27784m = i13;
        this.f27785n = i12;
        this.f27786o = f12;
        this.f27787p = i14;
        this.f27788q = f15;
        this.f27789r = i15;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            Bitmap bitmap2 = bVar.f27776d;
            if (TextUtils.equals(this.f27773a, bVar.f27773a) && this.f27774b == bVar.f27774b && this.f27775c == bVar.f27775c && ((bitmap = this.f27776d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f27777e == bVar.f27777e && this.f27778f == bVar.f27778f && this.f27779g == bVar.f27779g && this.f27780h == bVar.f27780h && this.i == bVar.i && this.f27781j == bVar.f27781j && this.f27782k == bVar.f27782k && this.f27783l == bVar.f27783l && this.f27784m == bVar.f27784m && this.f27785n == bVar.f27785n && this.f27786o == bVar.f27786o && this.f27787p == bVar.f27787p && this.f27788q == bVar.f27788q && this.f27789r == bVar.f27789r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f27773a, this.f27774b, this.f27775c, this.f27776d, Float.valueOf(this.f27777e), Integer.valueOf(this.f27778f), Integer.valueOf(this.f27779g), Float.valueOf(this.f27780h), Integer.valueOf(this.i), Float.valueOf(this.f27781j), Float.valueOf(this.f27782k), Boolean.valueOf(this.f27783l), Integer.valueOf(this.f27784m), Integer.valueOf(this.f27785n), Float.valueOf(this.f27786o), Integer.valueOf(this.f27787p), Float.valueOf(this.f27788q), Integer.valueOf(this.f27789r));
    }
}
