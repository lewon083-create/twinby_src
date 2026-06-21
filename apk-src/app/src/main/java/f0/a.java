package f0;

import a0.l2;
import android.util.Size;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g0.p f16476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l2 f16477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l2 f16478d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Size f16480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f16482h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d2.e f16483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d2.e f16484k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0.p f16475a = new k(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l2 f16479e = null;

    public a(Size size, int i, ArrayList arrayList, boolean z5, d2.e eVar, d2.e eVar2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f16480f = size;
        this.f16481g = i;
        this.f16482h = arrayList;
        this.i = z5;
        this.f16483j = eVar;
        this.f16484k = eVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16480f.equals(aVar.f16480f) && this.f16481g == aVar.f16481g && this.f16482h.equals(aVar.f16482h) && this.i == aVar.i && this.f16483j.equals(aVar.f16483j) && this.f16484k.equals(aVar.f16484k);
    }

    public final int hashCode() {
        return ((((((((((this.f16480f.hashCode() ^ 1000003) * 1000003) ^ this.f16481g) * 1000003) ^ this.f16482h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237)) * 583896283) ^ this.f16483j.hashCode()) * 1000003) ^ this.f16484k.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.f16480f + ", inputFormat=" + this.f16481g + ", outputFormats=" + this.f16482h + ", virtualCamera=" + this.i + ", imageReaderProxyProvider=null, postviewSettings=null, requestEdge=" + this.f16483j + ", errorEdge=" + this.f16484k + "}";
    }
}
