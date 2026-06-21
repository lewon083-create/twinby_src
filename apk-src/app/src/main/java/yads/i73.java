package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o73 f39458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f39460e;

    public i73(boolean z5, String str, int i, byte[] bArr, int i10, int i11, byte[] bArr2) {
        ni.a((bArr2 == null) ^ (i == 0));
        this.f39456a = z5;
        this.f39457b = str;
        this.f39459d = i;
        this.f39460e = bArr2;
        this.f39458c = new o73(a(str), i10, i11, bArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        if (str == null) {
            return 1;
        }
        byte b2 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b2 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b2 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b2 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b2 = 3;
                }
                break;
        }
        switch (b2) {
            case 0:
            case 1:
                return 2;
            default:
                kh1.d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
