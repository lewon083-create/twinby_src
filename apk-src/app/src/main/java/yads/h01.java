package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h01 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f38963f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f38964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f38968e = new byte[128];

    public final void a(byte[] bArr, int i, int i10) {
        if (this.f38964a) {
            int i11 = i10 - i;
            byte[] bArr2 = this.f38968e;
            int length = bArr2.length;
            int i12 = this.f38966c + i11;
            if (length < i12) {
                this.f38968e = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i, this.f38968e, this.f38966c, i11);
            this.f38966c += i11;
        }
    }
}
