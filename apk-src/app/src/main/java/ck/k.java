package ck;

import java.util.NoSuchElementException;
import kotlin.collections.f0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2392e;

    public k(long j10, long j11, long j12) {
        this.f2389b = j12;
        this.f2390c = j11;
        boolean z5 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z5 = true;
        }
        this.f2391d = z5;
        this.f2392e = z5 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2391d;
    }

    @Override // kotlin.collections.f0
    public final long nextLong() {
        long j10 = this.f2392e;
        if (j10 != this.f2390c) {
            this.f2392e = this.f2389b + j10;
            return j10;
        }
        if (!this.f2391d) {
            throw new NoSuchElementException();
        }
        this.f2391d = false;
        return j10;
    }
}
