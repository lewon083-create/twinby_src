package tj;

import ek.p;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements Iterator, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f33941d;

    public n(p pVar) {
        this.f33941d = pVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f33939b == null && !this.f33940c) {
            String line = ((BufferedReader) this.f33941d.f16420b).readLine();
            this.f33939b = line;
            if (line == null) {
                this.f33940c = true;
            }
        }
        return this.f33939b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f33939b;
        this.f33939b = null;
        Intrinsics.b(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
