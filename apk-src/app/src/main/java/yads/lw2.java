package yads;

import javax.net.ssl.X509TrustManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lw2 extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final lw2 f40708b = new lw2();

    public lw2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        X509TrustManager x509TrustManagerA = e93.a(null);
        if (x509TrustManagerA != null) {
            return x509TrustManagerA;
        }
        throw new IllegalArgumentException("Failed to create default TrustManager");
    }
}
