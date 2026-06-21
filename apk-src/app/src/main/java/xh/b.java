package xh;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f36099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f36100c;

    public b(d dVar, s sVar) {
        this.f36100c = dVar;
        this.f36099b = sVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        d dVar = this.f36100c;
        if (dVar.f36113h && dVar.f36111f != null) {
            this.f36099b.getViewTreeObserver().removeOnPreDrawListener(this);
            dVar.f36111f = null;
        }
        return dVar.f36113h;
    }
}
