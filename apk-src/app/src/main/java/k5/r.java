package k5;

import com.google.android.gms.internal.measurement.h5;
import q4.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f27007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f27009e;

    public r(boolean z5, String str, int i, byte[] bArr, int i10, int i11, byte[] bArr2) {
        int i12 = 1;
        h5.h((i == 0) ^ (bArr2 == null));
        this.f27005a = z5;
        this.f27006b = str;
        this.f27008d = i;
        this.f27009e = bArr2;
        if (str != null) {
            switch (str) {
                case "cbc1":
                case "cbcs":
                    i12 = 2;
                    break;
                case "cenc":
                case "cens":
                    break;
                default:
                    m3.b.s("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f27007c = new z(i12, i10, i11, bArr);
    }
}
