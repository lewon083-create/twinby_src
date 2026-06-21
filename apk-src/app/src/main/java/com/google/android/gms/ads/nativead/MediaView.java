package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k6.t0;
import k9.n;
import z9.c;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class MediaView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f2571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t0 f2573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView.ScaleType f2574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f2576g;

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public n getMediaContent() {
        return this.f2571b;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f2575f = true;
        this.f2574e = scaleType;
        c cVar = this.f2576g;
        if (cVar != null) {
            cVar.a(scaleType);
        }
    }

    public void setMediaContent(n nVar) {
        this.f2572c = true;
        this.f2571b = nVar;
        t0 t0Var = this.f2573d;
        if (t0Var != null) {
            t0Var.t(nVar);
        }
    }
}
