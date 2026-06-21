package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j51 extends k51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f39728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39730c;

    public j51() {
        kx.a(4, "initialCapacity");
        this.f39728a = new Object[4];
        this.f39729b = 0;
    }

    public final void a(int i) {
        Object[] objArr = this.f39728a;
        if (objArr.length < i) {
            this.f39728a = Arrays.copyOf(objArr, k51.a(objArr.length, i));
            this.f39730c = false;
        } else if (this.f39730c) {
            this.f39728a = (Object[]) objArr.clone();
            this.f39730c = false;
        }
    }
}
