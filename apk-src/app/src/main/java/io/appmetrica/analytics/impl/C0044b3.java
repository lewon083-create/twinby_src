package io.appmetrica.analytics.impl;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class C0044b3 implements InterfaceC0070c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23478a;

    public C0044b3(int i) {
        this.f23478a = i;
    }

    public static InterfaceC0070c3 a(InterfaceC0070c3... interfaceC0070c3Arr) {
        return new C0044b3(b(interfaceC0070c3Arr));
    }

    public static int b(InterfaceC0070c3... interfaceC0070c3Arr) {
        int bytesTruncated = 0;
        for (InterfaceC0070c3 interfaceC0070c3 : interfaceC0070c3Arr) {
            if (interfaceC0070c3 != null) {
                bytesTruncated = interfaceC0070c3.getBytesTruncated() + bytesTruncated;
            }
        }
        return bytesTruncated;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0070c3
    public final int getBytesTruncated() {
        return this.f23478a;
    }

    public String toString() {
        return om1.l(new StringBuilder("BytesTruncatedInfo{bytesTruncated="), this.f23478a, '}');
    }
}
