package uk;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qk.a f34552a;

    public n(qk.a aVar) {
        this.f34552a = aVar;
    }

    @Override // uk.a
    public void f(tk.a decoder, int i, Object obj) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        i(i, obj, decoder.i(getDescriptor(), i, this.f34552a, null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    @Override // qk.a
    public void serialize(tk.c encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iD = d(obj);
        sk.f descriptor = getDescriptor();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        wk.o oVarA = ((wk.o) encoder).a(descriptor);
        Iterator itC = c(obj);
        for (int i = 0; i < iD; i++) {
            oVarA.u(getDescriptor(), i, this.f34552a, itC.next());
        }
        oVarA.w(descriptor);
    }
}
