package zk;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f46385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f46386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f46387c;

    public g0(a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f46385a = address;
        this.f46386b = proxy;
        this.f46387c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.a(g0Var.f46385a, this.f46385a) && Intrinsics.a(g0Var.f46386b, this.f46386b) && Intrinsics.a(g0Var.f46387c, this.f46387c);
    }

    public final int hashCode() {
        return this.f46387c.hashCode() + ((this.f46386b.hashCode() + ((this.f46385a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f46387c + '}';
    }
}
