package ef;

import android.content.Context;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f16374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NativeAdLoader f16375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public NativeAd f16377e;

    public e(String id2, Context context, a emit) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(emit, "emit");
        this.f16373a = context;
        this.f16374b = emit;
    }
}
