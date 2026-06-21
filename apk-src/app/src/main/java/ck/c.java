package ck;

import java.util.NoSuchElementException;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2379e;

    public c(char c8, char c9, int i) {
        this.f2376b = i;
        this.f2377c = c9;
        boolean z5 = false;
        if (i <= 0 ? Intrinsics.d(c8, c9) >= 0 : Intrinsics.d(c8, c9) <= 0) {
            z5 = true;
        }
        this.f2378d = z5;
        this.f2379e = z5 ? c8 : c9;
    }

    @Override // kotlin.collections.q
    public final char a() {
        int i = this.f2379e;
        if (i != this.f2377c) {
            this.f2379e = this.f2376b + i;
        } else {
            if (!this.f2378d) {
                throw new NoSuchElementException();
            }
            this.f2378d = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2378d;
    }
}
