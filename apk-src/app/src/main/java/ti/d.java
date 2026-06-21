package ti;

import android.app.Activity;
import android.util.Log;
import android.widget.ScrollView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ScrollView f33804h;
    public int i;

    @Override // ti.p, ti.l
    public final void a() {
        l9.c cVar = this.f33872g;
        if (cVar != null) {
            cVar.addOnLayoutChangeListener(new c(0, this));
            this.f33867b.L(this.f33834a, this.f33872g.getResponseInfo());
        }
    }

    @Override // ti.p, ti.j
    public final void b() {
        l9.c cVar = this.f33872g;
        if (cVar != null) {
            cVar.a();
            this.f33872g = null;
        }
        ScrollView scrollView = this.f33804h;
        if (scrollView != null) {
            scrollView.removeAllViews();
            this.f33804h = null;
        }
    }

    @Override // ti.p, ti.j
    public final io.flutter.plugin.platform.f c() {
        ScrollView scrollView;
        if (this.f33872g != null) {
            ScrollView scrollView2 = this.f33804h;
            if (scrollView2 != null) {
                return new ef.d(scrollView2, 2);
            }
            ka.k kVar = this.f33867b;
            if (((Activity) kVar.f27324c) == null) {
                Log.e("FluidAdManagerBannerAd", "Tried to create container view before plugin is attached to an activity.");
                scrollView = null;
            } else {
                scrollView = new ScrollView((Activity) kVar.f27324c);
            }
            if (scrollView != null) {
                scrollView.setClipChildren(false);
                scrollView.setVerticalScrollBarEnabled(false);
                scrollView.setHorizontalScrollBarEnabled(false);
                this.f33804h = scrollView;
                scrollView.addView(this.f33872g);
                return new ef.d(this.f33872g, 2);
            }
        }
        return null;
    }
}
