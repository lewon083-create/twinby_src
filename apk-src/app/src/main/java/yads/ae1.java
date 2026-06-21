package yads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ae1 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ae1 f36694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ae1[] f36695c;

    static {
        ae1 ae1Var = new ae1();
        f36694b = ae1Var;
        f36695c = new ae1[]{ae1Var};
    }

    public static ae1 valueOf(String str) {
        return (ae1) Enum.valueOf(ae1.class, str);
    }

    public static ae1[] values() {
        return (ae1[]) f36695c.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
