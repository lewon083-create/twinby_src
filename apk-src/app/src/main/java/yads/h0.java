package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f38957a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f38958b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f38959c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f38960d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f38961e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f38962f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, VKApiCodes.CODE_ANONYM_TOKEN_EXPIRED, 1253, 1393};

    public static int a(int i, int i10) {
        int i11 = i10 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f38958b;
        if (i >= 3 || i10 < 0) {
            return -1;
        }
        int[] iArr2 = f38962f;
        if (i11 >= 19) {
            return -1;
        }
        int i12 = iArr[i];
        if (i12 == 44100) {
            return ((i10 % 2) + iArr2[i11]) * 2;
        }
        int i13 = f38961e[i11];
        return i12 == 32000 ? i13 * 6 : i13 * 4;
    }
}
