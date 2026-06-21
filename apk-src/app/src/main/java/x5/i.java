package x5;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f35849f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f35854e;

    public final void a(byte[] bArr, int i, int i10) {
        if (this.f35850a) {
            int i11 = i10 - i;
            byte[] bArr2 = this.f35854e;
            int length = bArr2.length;
            int i12 = this.f35852c + i11;
            if (length < i12) {
                this.f35854e = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i, this.f35854e, this.f35852c, i11);
            this.f35852c += i11;
        }
    }
}
