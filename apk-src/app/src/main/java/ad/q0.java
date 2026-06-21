package ad;

import com.google.android.gms.internal.measurement.h5;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ q0[] f858c;

    static {
        q0 q0Var = new q0("INSTANCE", 0);
        f857b = q0Var;
        f858c = new q0[]{q0Var};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) f858c.clone();
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
        h5.q("no calls to next() since the last call to remove()", false);
    }
}
