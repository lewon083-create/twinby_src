package yads;

import android.view.ViewTreeObserver;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bo1 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ co1 f37113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomizableMediaView f37114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tn1 f37115c;

    public bo1(co1 co1Var, CustomizableMediaView customizableMediaView, tn1 tn1Var) {
        this.f37113a = co1Var;
        this.f37114b = customizableMediaView;
        this.f37115c = tn1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f37113a.f37456b.a(this.f37114b, this.f37115c.f43381b);
        return false;
    }
}
