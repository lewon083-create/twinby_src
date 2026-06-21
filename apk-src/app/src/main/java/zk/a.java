package zk;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f46308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f46309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f46310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f46311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f46312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f46313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f46314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f46315h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f46316j;

    public a(String host, int i, i dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, d dVar, b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(host, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f46308a = dns;
        this.f46309b = socketFactory;
        this.f46310c = sSLSocketFactory;
        this.f46311d = hostnameVerifier;
        this.f46312e = dVar;
        this.f46313f = proxyAuthenticator;
        this.f46314g = proxySelector;
        l lVar = new l();
        String scheme = sSLSocketFactory != null ? "https" : "http";
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (scheme.equalsIgnoreCase("http")) {
            lVar.f46415a = "http";
        } else {
            if (!scheme.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(scheme));
            }
            lVar.f46415a = "https";
        }
        Intrinsics.checkNotNullParameter(host, "host");
        String strF = k3.f.F(i.e(host, 0, 0, 7));
        if (strF == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(host));
        }
        lVar.f46418d = strF;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(l7.o.i(i, "unexpected port: ").toString());
        }
        lVar.f46419e = i;
        this.f46315h = lVar.a();
        this.i = al.b.v(protocols);
        this.f46316j = al.b.v(connectionSpecs);
    }

    public final boolean a(a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.a(this.f46308a, that.f46308a) && Intrinsics.a(this.f46313f, that.f46313f) && Intrinsics.a(this.i, that.i) && Intrinsics.a(this.f46316j, that.f46316j) && Intrinsics.a(this.f46314g, that.f46314g) && Intrinsics.a(this.f46310c, that.f46310c) && Intrinsics.a(this.f46311d, that.f46311d) && Intrinsics.a(this.f46312e, that.f46312e) && this.f46315h.f46428e == that.f46315h.f46428e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.f46315h, aVar.f46315h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f46312e) + ((Objects.hashCode(this.f46311d) + ((Objects.hashCode(this.f46310c) + ((this.f46314g.hashCode() + a0.u.i(this.f46316j, a0.u.i(this.i, (this.f46313f.hashCode() + ((this.f46308a.hashCode() + gf.a.e(527, 31, this.f46315h.f46431h)) * 31)) * 31, 31), 31)) * VKApiCodes.CODE_CALL_LINK_OUTDATED)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        m mVar = this.f46315h;
        sb2.append(mVar.f46427d);
        sb2.append(':');
        sb2.append(mVar.f46428e);
        sb2.append(", ");
        sb2.append("proxySelector=" + this.f46314g);
        sb2.append('}');
        return sb2.toString();
    }
}
