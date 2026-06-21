package zk;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f46410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f46411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f46412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ij.p f46413d;

    public j(h0 tlsVersion, f cipherSuite, List localCertificates, Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f46410a = tlsVersion;
        this.f46411b = cipherSuite;
        this.f46412c = localCertificates;
        this.f46413d = ij.h.b(new c7.i(peerCertificatesFn));
    }

    public final List a() {
        return (List) this.f46413d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f46410a == this.f46410a && Intrinsics.a(jVar.f46411b, this.f46411b) && Intrinsics.a(jVar.a(), a()) && Intrinsics.a(jVar.f46412c, this.f46412c);
    }

    public final int hashCode() {
        return this.f46412c.hashCode() + ((a().hashCode() + ((this.f46411b.hashCode() + ((this.f46410a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(kotlin.collections.t.j(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f46410a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f46411b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f46412c;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.j(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Intrinsics.checkNotNullExpressionValue(type, "type");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
