package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class rv1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f42739a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f42740b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f42741c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f42742d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f42743e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f42744f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f42745g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int a(int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        if ((i & (-2097152)) != -2097152 || (i10 = (i >>> 19) & 3) == 1 || (i11 = (i >>> 17) & 3) == 0 || (i12 = (i >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i14 = f42740b[i13];
        if (i10 == 2) {
            i14 /= 2;
        } else if (i10 == 0) {
            i14 /= 4;
        }
        int i15 = (i >>> 9) & 1;
        if (i11 == 3) {
            return ((((i10 == 3 ? f42741c[i12 - 1] : f42742d[i12 - 1]) * 12) / i14) + i15) * 4;
        }
        int i16 = i10 == 3 ? i11 == 2 ? f42743e[i12 - 1] : f42744f[i12 - 1] : f42745g[i12 - 1];
        if (i10 == 3) {
            return ((i16 * 144) / i14) + i15;
        }
        return (((i11 == 1 ? 72 : 144) * i16) / i14) + i15;
    }

    public static int b(int i) {
        int i10;
        int i11;
        if ((i & (-2097152)) != -2097152 || (i10 = (i >>> 19) & 3) == 1 || (i11 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i12 = (i >>> 12) & 15;
        int i13 = (i >>> 10) & 3;
        if (i12 != 0 && i12 != 15 && i13 != 3) {
            if (i11 == 1) {
                return i10 == 3 ? 1152 : 576;
            }
            if (i11 == 2) {
                return 1152;
            }
            if (i11 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        }
        return -1;
    }
}
