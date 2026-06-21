package j4;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26450d;

    public b(long j10, long j11) {
        this.f26448b = j10;
        this.f26449c = j11;
        this.f26450d = j10 - 1;
    }

    public final void a() {
        long j10 = this.f26450d;
        if (j10 < this.f26448b || j10 > this.f26449c) {
            throw new NoSuchElementException();
        }
    }

    @Override // j4.n
    public final boolean next() {
        long j10 = this.f26450d + 1;
        this.f26450d = j10;
        return !(j10 > this.f26449c);
    }
}
