package yads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o20 implements xq {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o20 f41435s = new o20("", null, null, null, -3.4028235E38f, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, 0.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final wq f41436t = new zl.g0(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f41437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f41438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Layout.Alignment f41439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f41440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f41441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f41442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f41443h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f41444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f41445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f41446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f41447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f41448n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f41449o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f41450p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f41451q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f41452r;

    public o20(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i, int i10, float f11, int i11, int i12, float f12, float f13, float f14, boolean z5, int i13, int i14, float f15) {
        if (charSequence == null) {
            ni.a(bitmap);
        } else {
            ni.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f41437b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f41437b = charSequence.toString();
        } else {
            this.f41437b = null;
        }
        this.f41438c = alignment;
        this.f41439d = alignment2;
        this.f41440e = bitmap;
        this.f41441f = f10;
        this.f41442g = i;
        this.f41443h = i10;
        this.i = f11;
        this.f41444j = i11;
        this.f41445k = f13;
        this.f41446l = f14;
        this.f41447m = z5;
        this.f41448n = i13;
        this.f41449o = i12;
        this.f41450p = f12;
        this.f41451q = i14;
        this.f41452r = f15;
    }

    public static final o20 a(Bundle bundle) {
        float f10;
        int i;
        float f11;
        int i10;
        int i11;
        boolean z5;
        CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
            f10 = bundle.getFloat(Integer.toString(4, 36));
            i = bundle.getInt(Integer.toString(5, 36));
        } else {
            f10 = -3.4028235E38f;
            i = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        }
        int i12 = bundle.containsKey(Integer.toString(6, 36)) ? bundle.getInt(Integer.toString(6, 36)) : VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        float f12 = bundle.containsKey(Integer.toString(7, 36)) ? bundle.getFloat(Integer.toString(7, 36)) : -3.4028235E38f;
        int i13 = bundle.containsKey(Integer.toString(8, 36)) ? bundle.getInt(Integer.toString(8, 36)) : VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
            f11 = bundle.getFloat(Integer.toString(10, 36));
            i10 = bundle.getInt(Integer.toString(9, 36));
        } else {
            f11 = -3.4028235E38f;
            i10 = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        }
        float f13 = bundle.containsKey(Integer.toString(11, 36)) ? bundle.getFloat(Integer.toString(11, 36)) : -3.4028235E38f;
        float f14 = bundle.containsKey(Integer.toString(12, 36)) ? bundle.getFloat(Integer.toString(12, 36)) : -3.4028235E38f;
        if (bundle.containsKey(Integer.toString(13, 36))) {
            i11 = bundle.getInt(Integer.toString(13, 36));
            z5 = true;
        } else {
            i11 = -16777216;
            z5 = false;
        }
        return new o20(charSequence2, alignment2, alignment4, bitmap2, f10, i, i12, f12, i13, i10, f11, f13, f14, !bundle.getBoolean(Integer.toString(14, 36), false) ? false : z5, i11, bundle.containsKey(Integer.toString(15, 36)) ? bundle.getInt(Integer.toString(15, 36)) : VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, bundle.containsKey(Integer.toString(16, 36)) ? bundle.getFloat(Integer.toString(16, 36)) : 0.0f);
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && o20.class == obj.getClass()) {
            o20 o20Var = (o20) obj;
            if (TextUtils.equals(this.f41437b, o20Var.f41437b) && this.f41438c == o20Var.f41438c && this.f41439d == o20Var.f41439d && ((bitmap = this.f41440e) != null ? !((bitmap2 = o20Var.f41440e) == null || !bitmap.sameAs(bitmap2)) : o20Var.f41440e == null) && this.f41441f == o20Var.f41441f && this.f41442g == o20Var.f41442g && this.f41443h == o20Var.f41443h && this.i == o20Var.i && this.f41444j == o20Var.f41444j && this.f41445k == o20Var.f41445k && this.f41446l == o20Var.f41446l && this.f41447m == o20Var.f41447m && this.f41448n == o20Var.f41448n && this.f41449o == o20Var.f41449o && this.f41450p == o20Var.f41450p && this.f41451q == o20Var.f41451q && this.f41452r == o20Var.f41452r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41437b, this.f41438c, this.f41439d, this.f41440e, Float.valueOf(this.f41441f), Integer.valueOf(this.f41442g), Integer.valueOf(this.f41443h), Float.valueOf(this.i), Integer.valueOf(this.f41444j), Float.valueOf(this.f41445k), Float.valueOf(this.f41446l), Boolean.valueOf(this.f41447m), Integer.valueOf(this.f41448n), Integer.valueOf(this.f41449o), Float.valueOf(this.f41450p), Integer.valueOf(this.f41451q), Float.valueOf(this.f41452r)});
    }
}
