package zk;

import g0.a2;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements Iterable, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f46414b;

    public k(String[] strArr) {
        this.f46414b = strArr;
    }

    public final String a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.f46414b;
        int length = strArr.length - 2;
        int iA = qj.c.a(length, 0, -2);
        if (iA > length) {
            return null;
        }
        while (!kotlin.text.a0.i(name, strArr[length])) {
            if (length == iA) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String c(int i) {
        return this.f46414b[i * 2];
    }

    public final a2 e() {
        a2 a2Var = new a2(2);
        kotlin.collections.x.n(a2Var.f19518a, this.f46414b);
        return a2Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return Arrays.equals(this.f46414b, ((k) obj).f46414b);
        }
        return false;
    }

    public final String f(int i) {
        return this.f46414b[(i * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f46414b);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(c(i), f(i));
        }
        return kotlin.jvm.internal.j.a(pairArr);
    }

    public final int size() {
        return this.f46414b.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strC = c(i);
            String strF = f(i);
            sb2.append(strC);
            sb2.append(": ");
            if (al.b.o(strC)) {
                strF = "██";
            }
            sb2.append(strF);
            sb2.append("\n");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
