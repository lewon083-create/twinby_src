package g2;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f19830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f19831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19832d;

    public a1(int i, Interpolator interpolator, long j10) {
        this.f19829a = i;
        this.f19831c = interpolator;
        this.f19832d = j10;
    }

    public long a() {
        return this.f19832d;
    }

    public float b() {
        Interpolator interpolator = this.f19831c;
        return interpolator != null ? interpolator.getInterpolation(this.f19830b) : this.f19830b;
    }

    public int c() {
        return this.f19829a;
    }

    public void d(float f10) {
        this.f19830b = f10;
    }
}
