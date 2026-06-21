package yads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a22 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f36611g = {wb.a(a22.class, "nativeAdView", "getNativeAdView()Landroid/view/View;", 0), wb.a(a22.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0), wb.a(a22.class, "muteButtonView", "getMuteButtonView()Landroid/widget/CheckBox;", 0), wb.a(a22.class, "videoProgressView", "getVideoProgressView()Landroid/widget/ProgressBar;", 0), wb.a(a22.class, "customAssets", "getCustomAssets()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nm2 f36612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nm2 f36613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nm2 f36614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nm2 f36615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nm2 f36616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f36617f;

    public a22(z12 z12Var) {
        this.f36612a = om2.a(z12Var.e());
        this.f36613b = om2.a(z12Var.c());
        this.f36614c = om2.a(z12Var.d());
        this.f36615d = om2.a(z12Var.f());
        this.f36616e = om2.a(z12Var.b());
        this.f36617f = mi1.a(z12Var.a());
    }

    public final View a(String str) {
        WeakReference weakReference = (WeakReference) this.f36617f.get(str);
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final View a() {
        nm2 nm2Var = this.f36612a;
        dk.i iVar = f36611g[0];
        return (View) nm2Var.f41294a.get();
    }
}
