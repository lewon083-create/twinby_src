package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xs implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12291b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12292c;

    public /* synthetic */ xs(xc0 xc0Var) {
        this.f12292c = xc0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f12291b) {
            case 0:
                ((ys) this.f12292c).D(true);
                break;
            default:
                ((xc0) this.f12292c).f12117j.f31256b = true;
                break;
        }
    }

    public xs(ys ysVar) {
        Objects.requireNonNull(ysVar);
        this.f12292c = ysVar;
    }
}
