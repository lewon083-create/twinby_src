package kotlin.ranges;

import ck.f;
import ck.g;
import org.jetbrains.annotations.NotNull;
import qj.c;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class a implements Iterable, xj.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final f f27525e = new f(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27528d;

    public a(int i, int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i11 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f27526b = i;
        this.f27527c = c.a(i, i10, i11);
        this.f27528d = i11;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g iterator() {
        return new g(this.f27526b, this.f27527c, this.f27528d);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f27526b == aVar.f27526b && this.f27527c == aVar.f27527c && this.f27528d == aVar.f27528d;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f27526b * 31) + this.f27527c) * 31) + this.f27528d;
    }

    public boolean isEmpty() {
        int i = this.f27528d;
        int i10 = this.f27527c;
        int i11 = this.f27526b;
        return i > 0 ? i11 > i10 : i11 < i10;
    }

    public String toString() {
        StringBuilder sb2;
        int i = this.f27527c;
        int i10 = this.f27526b;
        int i11 = this.f27528d;
        if (i11 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("..");
            sb2.append(i);
            sb2.append(" step ");
            sb2.append(i11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(" downTo ");
            sb2.append(i);
            sb2.append(" step ");
            sb2.append(-i11);
        }
        return sb2.toString();
    }
}
