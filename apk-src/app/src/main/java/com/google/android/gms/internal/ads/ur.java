package com.google.android.gms.internal.ads;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ur implements w9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11053d;

    public ur(HashSet hashSet, boolean z5, int i, boolean z10) {
        this.f11053d = hashSet;
        this.f11051b = z5;
        this.f11050a = i;
        this.f11052c = z10;
    }

    @Override // w9.d
    public int a() {
        return this.f11050a;
    }

    @Override // w9.d
    public boolean b() {
        return this.f11052c;
    }

    @Override // w9.d
    public boolean c() {
        return this.f11051b;
    }

    @Override // w9.d
    public Set d() {
        return (Set) this.f11053d;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.String[]] */
    public zk.g e(SSLSocket sslSocket) throws UnknownServiceException {
        zk.g connectionSpec;
        int i;
        boolean z5;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i10 = this.f11050a;
        List list = (List) this.f11053d;
        int size = list.size();
        while (true) {
            if (i10 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = (zk.g) list.get(i10);
            if (connectionSpec.b(sslSocket)) {
                this.f11050a = i10 + 1;
                break;
            }
            i10++;
        }
        if (connectionSpec == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb2.append(this.f11052c);
            sb2.append(", modes=");
            sb2.append(list);
            sb2.append(", supported protocols=");
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.b(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
            sb2.append(string);
            throw new UnknownServiceException(sb2.toString());
        }
        int i11 = this.f11050a;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i11 >= size2) {
                z5 = false;
                break;
            }
            if (((zk.g) list.get(i11)).b(sslSocket)) {
                z5 = true;
                break;
            }
            i11++;
        }
        this.f11051b = z5;
        boolean z10 = this.f11052c;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        ?? r22 = connectionSpec.f46384d;
        String[] strArr = connectionSpec.f46383c;
        if (strArr != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = al.b.n(enabledCipherSuites, strArr, zk.f.f46361c);
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        if (r22 != 0) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "sslSocket.enabledProtocols");
            kj.b bVar = kj.b.f27401b;
            Intrinsics.c(bVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
            tlsVersionsIntersection = al.b.n(enabledProtocols2, r22, bVar);
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        zk.e comparator = zk.f.f46361c;
        byte[] bArr = al.b.f1041a;
        Intrinsics.checkNotNullParameter(supportedCipherSuites, "<this>");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (comparator.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z10 && i != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String value = supportedCipherSuites[i];
            Intrinsics.checkNotNullExpressionValue(value, "supportedCipherSuites[indexOfFallbackScsv]");
            Intrinsics.checkNotNullParameter(cipherSuitesIntersection, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) objArrCopyOf;
            Intrinsics.checkNotNullParameter(cipherSuitesIntersection, "<this>");
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = value;
        }
        Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
        m.t2 t2Var = new m.t2();
        t2Var.f28365a = connectionSpec.f46381a;
        t2Var.f28367c = strArr;
        t2Var.f28368d = r22;
        t2Var.f28366b = connectionSpec.f46382b;
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        t2Var.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        t2Var.d((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        zk.g gVarA = t2Var.a();
        if (gVarA.c() != null) {
            sslSocket.setEnabledProtocols(gVarA.f46384d);
        }
        if (gVarA.a() != null) {
            sslSocket.setEnabledCipherSuites(gVarA.f46383c);
        }
        return connectionSpec;
    }

    public void f(String str) {
        ((ob.s0) this.f11053d).L(this.f11050a, this.f11051b, this.f11052c, str, null, null, null);
    }

    public void g(Object obj, String str) {
        ((ob.s0) this.f11053d).L(this.f11050a, this.f11051b, this.f11052c, str, obj, null, null);
    }

    public void h(Object obj, String str, Object obj2) {
        ((ob.s0) this.f11053d).L(this.f11050a, this.f11051b, this.f11052c, str, obj, obj2, null);
    }

    public void i(String str, Object obj, Object obj2, Object obj3) {
        ((ob.s0) this.f11053d).L(this.f11050a, this.f11051b, this.f11052c, str, obj, obj2, obj3);
    }

    public ur(ob.s0 s0Var, int i, boolean z5, boolean z10) {
        this.f11053d = s0Var;
        this.f11050a = i;
        this.f11051b = z5;
        this.f11052c = z10;
    }

    public ur(List connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f11053d = connectionSpecs;
    }
}
