package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements Iterator, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f27562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27566f;

    public k(CharSequence string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.f27562b = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i10;
        int i11 = this.f27563c;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.f27566f < 0) {
            this.f27563c = 2;
            return false;
        }
        CharSequence charSequence = this.f27562b;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i12 = this.f27564d; i12 < length2; i12++) {
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i10 = i12 + 1) < charSequence.length() && charSequence.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.f27563c = 1;
                this.f27566f = i;
                this.f27565e = length;
                return true;
            }
        }
        i = -1;
        this.f27563c = 1;
        this.f27566f = i;
        this.f27565e = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f27563c = 0;
        int i = this.f27565e;
        int i10 = this.f27564d;
        this.f27564d = this.f27566f + i;
        return this.f27562b.subSequence(i10, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
