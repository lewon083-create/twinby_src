package yads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wo3 implements u43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f44437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f44438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f44439d;

    public wo3(ArrayList arrayList) {
        this.f44437b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f44438c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            oo3 oo3Var = (oo3) arrayList.get(i);
            int i10 = i * 2;
            long[] jArr = this.f44438c;
            jArr[i10] = oo3Var.f41675b;
            jArr[i10 + 1] = oo3Var.f41676c;
        }
        long[] jArr2 = this.f44438c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f44439d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // yads.u43
    public final long a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        long[] jArr = this.f44439d;
        if (i < jArr.length) {
            return jArr[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.u43
    public final List b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f44437b.size(); i++) {
            long[] jArr = this.f44438c;
            int i10 = i * 2;
            if (jArr[i10] <= j10 && j10 < jArr[i10 + 1]) {
                oo3 oo3Var = (oo3) this.f44437b.get(i);
                o20 o20Var = oo3Var.f41674a;
                if (o20Var.f41441f == -3.4028235E38f) {
                    arrayList2.add(oo3Var);
                } else {
                    arrayList.add(o20Var);
                }
            }
        }
        Collections.sort(arrayList2, new zl.v(5));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            o20 o20Var2 = ((oo3) arrayList2.get(i11)).f41674a;
            o20Var2.getClass();
            arrayList.add(new o20(o20Var2.f41437b, o20Var2.f41438c, o20Var2.f41439d, o20Var2.f41440e, (-1) - i11, 1, o20Var2.f41443h, o20Var2.i, o20Var2.f41444j, o20Var2.f41449o, o20Var2.f41450p, o20Var2.f41445k, o20Var2.f41446l, o20Var2.f41447m, o20Var2.f41448n, o20Var2.f41451q, o20Var2.f41452r));
        }
        return arrayList;
    }

    @Override // yads.u43
    public final int a() {
        return this.f44439d.length;
    }

    @Override // yads.u43
    public final int a(long j10) {
        int iA = lb3.a(this.f44439d, j10, false);
        if (iA < this.f44439d.length) {
            return iA;
        }
        return -1;
    }
}
