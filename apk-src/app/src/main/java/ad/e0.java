package ad;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f788c;

    public e0(int i) {
        q.d(i, "initialCapacity");
        this.f786a = new Object[i];
        this.f787b = 0;
    }

    public static int f(int i, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i10 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i10) {
            iHighestOneBit = Integer.highestOneBit(i10 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public abstract e0 a(Object obj);

    public final void b(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f786a;
        int i = this.f787b;
        this.f787b = i + 1;
        objArr[i] = obj;
    }

    public final void c(Object... objArr) {
        int length = objArr.length;
        q.b(length, objArr);
        e(length);
        System.arraycopy(objArr, 0, this.f786a, this.f787b, length);
        this.f787b += length;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof f0) {
                this.f787b = ((f0) collection).c(this.f787b, this.f786a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void e(int i) {
        Object[] objArr = this.f786a;
        int iF = f(objArr.length, this.f787b + i);
        if (iF > objArr.length || this.f788c) {
            this.f786a = Arrays.copyOf(this.f786a, iF);
            this.f788c = false;
        }
    }
}
