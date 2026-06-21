package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Iterator, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27538b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IntRange f27541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f27543g;

    public b(c cVar) {
        this.f27543g = cVar;
        int iB = ck.o.b(0, 0, cVar.f27545a.length());
        this.f27539c = iB;
        this.f27540d = iB;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.f27540d
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f27538b = r1
            r0 = 0
            r7.f27541e = r0
            return
        Lb:
            kotlin.text.c r2 = r7.f27543g
            int r3 = r2.f27546b
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f27542f
            int r6 = r6 + r5
            r7.f27542f = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.f27545a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r7.f27539c
            java.lang.CharSequence r2 = r2.f27545a
            int r2 = kotlin.text.StringsKt.A(r2)
            r0.<init>(r1, r2, r5)
            r7.f27541e = r0
            r7.f27540d = r4
            goto L79
        L34:
            kotlin.jvm.functions.Function2 r0 = r2.f27547c
            java.lang.CharSequence r3 = r2.f27545a
            int r6 = r7.f27540d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.invoke(r3, r6)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 != 0) goto L58
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r7.f27539c
            java.lang.CharSequence r2 = r2.f27545a
            int r2 = kotlin.text.StringsKt.A(r2)
            r0.<init>(r1, r2, r5)
            r7.f27541e = r0
            r7.f27540d = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.f27469b
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f27470c
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f27539c
            kotlin.ranges.IntRange r3 = ck.o.e(r3, r2)
            r7.f27541e = r3
            int r2 = r2 + r0
            r7.f27539c = r2
            if (r0 != 0) goto L76
            r1 = r5
        L76:
            int r2 = r2 + r1
            r7.f27540d = r2
        L79:
            r7.f27538b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.b.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f27538b == -1) {
            a();
        }
        return this.f27538b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f27538b == -1) {
            a();
        }
        if (this.f27538b == 0) {
            throw new NoSuchElementException();
        }
        IntRange intRange = this.f27541e;
        Intrinsics.c(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f27541e = null;
        this.f27538b = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
