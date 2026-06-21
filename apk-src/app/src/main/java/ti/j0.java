package ti;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.in;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ka.k f33835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final df.f f33837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f33838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f33839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f33840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public NativeAdView f33841h;
    public final l0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ui.b f33842j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TemplateView f33843k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f33844l;

    public j0(Context context, int i, ka.k kVar, String str, df.f fVar, s sVar, m mVar, Map map, l0 l0Var, ui.b bVar) {
        super(i);
        this.f33844l = context;
        this.f33835b = kVar;
        this.f33836c = str;
        this.f33837d = fVar;
        this.f33839f = sVar;
        this.f33838e = mVar;
        this.i = l0Var;
        this.f33842j = bVar;
    }

    @Override // ti.j
    public final void b() {
        NativeAdView nativeAdView = this.f33841h;
        if (nativeAdView != null) {
            in inVar = nativeAdView.f2578c;
            if (inVar != null) {
                try {
                    inVar.i();
                } catch (RemoteException e3) {
                    u9.i.f("Unable to destroy native ad view", e3);
                }
            }
            this.f33841h = null;
        }
        TemplateView templateView = this.f33843k;
        if (templateView != null) {
            templateView.f2515d.a();
            this.f33843k = null;
        }
    }

    @Override // ti.j
    public final io.flutter.plugin.platform.f c() {
        NativeAdView nativeAdView = this.f33841h;
        if (nativeAdView != null) {
            return new ef.d(nativeAdView, 2);
        }
        TemplateView templateView = this.f33843k;
        if (templateView != null) {
            return new ef.d(templateView, 2);
        }
        return null;
    }

    public j0(Context context, int i, ka.k kVar, String str, df.f fVar, n nVar, m mVar, Map map, l0 l0Var, ui.b bVar) {
        super(i);
        this.f33844l = context;
        this.f33835b = kVar;
        this.f33836c = str;
        this.f33837d = fVar;
        this.f33840g = nVar;
        this.f33838e = mVar;
        this.i = l0Var;
        this.f33842j = bVar;
    }
}
