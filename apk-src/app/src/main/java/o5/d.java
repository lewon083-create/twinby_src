package o5;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d2.a f29733c = new d2.a(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l3.b f29734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29735b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i, float f11, int i10, boolean z5, int i11, int i12) {
        this.f29734a = new l3.b(spannableStringBuilder, alignment, null, null, f10, 0, i, f11, i10, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z5, z5 ? i11 : -16777216, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, 0.0f, 0);
        this.f29735b = i12;
    }
}
