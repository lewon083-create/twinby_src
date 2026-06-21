package yads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f41137a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f41138b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Layout.Alignment f41139c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Layout.Alignment f41140d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f41141e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41142f = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41143g = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f41144h = -3.4028235E38f;
    public int i = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41145j = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f41146k = -3.4028235E38f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f41147l = -3.4028235E38f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f41148m = -3.4028235E38f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f41149n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f41150o = -16777216;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f41151p = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f41152q;

    public final n20 a(float f10) {
        this.f41141e = f10;
        this.f41142f = 0;
        return this;
    }

    public final n20 b(float f10) {
        this.f41144h = f10;
        return this;
    }

    public final void c(int i) {
        this.f41150o = i;
        this.f41149n = true;
    }

    public final n20 b(int i) {
        this.i = i;
        return this;
    }

    public final n20 a(int i) {
        this.f41143g = i;
        return this;
    }

    public final n20 b() {
        this.f41147l = -3.4028235E38f;
        return this;
    }

    public final n20 a(SpannableStringBuilder spannableStringBuilder) {
        this.f41137a = spannableStringBuilder;
        return this;
    }

    public final n20 a(Layout.Alignment alignment) {
        this.f41139c = alignment;
        return this;
    }

    public final o20 a() {
        return new o20(this.f41137a, this.f41139c, this.f41140d, this.f41138b, this.f41141e, this.f41142f, this.f41143g, this.f41144h, this.i, this.f41145j, this.f41146k, this.f41147l, this.f41148m, this.f41149n, this.f41150o, this.f41151p, this.f41152q);
    }
}
