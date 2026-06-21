package zk;

import com.google.android.gms.internal.ads.om1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f46343c = new d(CollectionsKt.V(new ArrayList()), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f46344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa.a f46345b;

    public d(Set pins, wa.a aVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f46344a = pins;
        this.f46345b = aVar;
    }

    public final void a(String hostname, Function0 cleanedPeerCertificatesFn) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set set = this.f46344a;
        kotlin.collections.b0 b0Var = kotlin.collections.b0.f27475b;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw om1.i(it);
        }
        b0Var.getClass();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(dVar.f46344a, this.f46344a) && Intrinsics.a(dVar.f46345b, this.f46345b);
    }

    public final int hashCode() {
        int iHashCode = (this.f46344a.hashCode() + 1517) * 41;
        wa.a aVar = this.f46345b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
