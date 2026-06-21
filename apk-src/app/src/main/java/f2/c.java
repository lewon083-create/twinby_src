package f2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f16568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16569b;

    public c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f16568a = new Object[i];
    }

    public Object a() {
        int i = this.f16569b;
        if (i <= 0) {
            return null;
        }
        int i10 = i - 1;
        Object[] objArr = this.f16568a;
        Object obj = objArr[i10];
        Intrinsics.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.f16569b--;
        return obj;
    }

    public void b(k1.b bVar) {
        int i = this.f16569b;
        Object[] objArr = this.f16568a;
        if (i < objArr.length) {
            objArr[i] = bVar;
            this.f16569b = i + 1;
        }
    }

    public boolean c(Object instance) {
        Object[] objArr;
        boolean z5;
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i = this.f16569b;
        int i10 = 0;
        while (true) {
            objArr = this.f16568a;
            if (i10 >= i) {
                z5 = false;
                break;
            }
            if (objArr[i10] == instance) {
                z5 = true;
                break;
            }
            i10++;
        }
        if (z5) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i11 = this.f16569b;
        if (i11 >= objArr.length) {
            return false;
        }
        objArr[i11] = instance;
        this.f16569b = i11 + 1;
        return true;
    }

    public c() {
        this.f16568a = new Object[256];
    }
}
