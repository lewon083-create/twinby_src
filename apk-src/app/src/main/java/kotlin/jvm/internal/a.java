package kotlin.jvm.internal;

import com.yandex.div.histogram.RenderConfiguration;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements n, Serializable {
    protected final Object receiver = e.NO_RECEIVER;
    private final Class owner = RenderConfiguration.class;
    private final String name = "<init>";
    private final String signature = "<init>(Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;)V";
    private final boolean isTopLevel = false;
    private final int arity = 0;
    private final int flags = 0;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.isTopLevel == aVar.isTopLevel && this.arity == aVar.arity && this.flags == aVar.flags && Intrinsics.a(this.receiver, aVar.receiver) && Intrinsics.a(this.owner, aVar.owner) && this.name.equals(aVar.name) && this.signature.equals(aVar.signature);
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((gf.a.e(gf.a.e((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        g0.f27511a.getClass();
        return h0.a(this);
    }
}
