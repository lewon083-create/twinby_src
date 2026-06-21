package ck;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements Iterable, xj.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f2372e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f2373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f2374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2375d = 1;

    public b(char c8, char c9) {
        this.f2373b = c8;
        this.f2374c = (char) qj.c.a(c8, c9, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.f2373b, this.f2374c, this.f2375d);
    }
}
