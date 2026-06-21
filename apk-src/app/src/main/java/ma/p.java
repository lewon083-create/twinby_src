package ma;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f28794d;

    public p(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f28794d = bArr;
    }

    @Override // ma.o
    public final byte[] L1() {
        return this.f28794d;
    }
}
