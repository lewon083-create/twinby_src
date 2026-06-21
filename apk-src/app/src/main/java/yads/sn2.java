package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sn2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wn2 f43005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap f43006c;

    public sn2(wn2 wn2Var, Bitmap bitmap) {
        this.f43005b = wn2Var;
        this.f43006c = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f43005b.setBackground(new BitmapDrawable(this.f43005b.getResources(), this.f43006c));
        this.f43005b.setVisibility(0);
    }
}
