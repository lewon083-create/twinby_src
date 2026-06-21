package io.flutter.plugin.platform;

import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 {
    public static final y i = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SingleViewPresentation f25679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f25680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f25681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f25684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f25685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public VirtualDisplay f25686h;

    public b0(z2.w wVar, a aVar, VirtualDisplay virtualDisplay, f fVar, h hVar, l lVar, int i10) {
        this.f25680b = wVar;
        this.f25681c = aVar;
        this.f25684f = hVar;
        this.f25685g = lVar;
        this.f25683e = i10;
        this.f25686h = virtualDisplay;
        this.f25682d = wVar.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(wVar, this.f25686h.getDisplay(), fVar, aVar, i10, lVar);
        this.f25679a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final View a() {
        SingleViewPresentation singleViewPresentation = this.f25679a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }
}
