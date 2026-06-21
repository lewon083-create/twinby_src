package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f42811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42812b = 0;

    public s51(int i) {
        this.f42811a = new Object[i * 2];
    }

    public final zm2 a() {
        return zm2.a(this.f42812b, this.f42811a);
    }

    public final void a(int i) {
        int i10 = i * 2;
        Object[] objArr = this.f42811a;
        if (i10 > objArr.length) {
            this.f42811a = Arrays.copyOf(objArr, k51.a(objArr.length, i10));
        }
    }

    public final s51 a(Object obj, Object obj2) {
        a(this.f42812b + 1);
        kx.a(obj, obj2);
        Object[] objArr = this.f42811a;
        int i = this.f42812b;
        int i10 = i * 2;
        objArr[i10] = obj;
        objArr[i10 + 1] = obj2;
        this.f42812b = i + 1;
        return this;
    }
}
