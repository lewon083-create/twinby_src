package uk;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements qk.a {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // qk.a
    public Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return e(decoder);
    }

    public final Object e(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Object objA = a();
        int iB = b(objA);
        tk.a aVarA = decoder.a(getDescriptor());
        while (true) {
            int iV = aVarA.v(getDescriptor());
            if (iV == -1) {
                aVarA.m(getDescriptor());
                return h(objA);
            }
            f(aVarA, iV + iB, objA);
        }
    }

    public abstract void f(tk.a aVar, int i, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
