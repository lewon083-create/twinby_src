package ck;

import java.util.NoSuchElementException;
import kotlin.collections.e0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2384e;

    public g(int i, int i10, int i11) {
        this.f2381b = i11;
        this.f2382c = i10;
        boolean z5 = false;
        if (i11 <= 0 ? i >= i10 : i <= i10) {
            z5 = true;
        }
        this.f2383d = z5;
        this.f2384e = z5 ? i : i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2383d;
    }

    @Override // kotlin.collections.e0
    public final int nextInt() {
        int i = this.f2384e;
        if (i != this.f2382c) {
            this.f2384e = this.f2381b + i;
            return i;
        }
        if (!this.f2383d) {
            throw new NoSuchElementException();
        }
        this.f2383d = false;
        return i;
    }
}
