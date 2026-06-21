package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f01 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f38305e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f38306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f38309d = new byte[128];

    public final void a(byte[] bArr, int i, int i10) {
        if (this.f38306a) {
            int i11 = i10 - i;
            byte[] bArr2 = this.f38309d;
            int length = bArr2.length;
            int i12 = this.f38307b + i11;
            if (length < i12) {
                this.f38309d = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i, this.f38309d, this.f38307b, i11);
            this.f38307b += i11;
        }
    }
}
