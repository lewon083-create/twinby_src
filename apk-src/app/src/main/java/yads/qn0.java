package yads;

import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qn0 extends de2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f42345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f42346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nx0 f42347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f42348h;
    public final tm1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f42349j;

    public qn0(int i, Throwable th2, int i10, int i11) {
        this(a(i, null, null, -1, null, 4), th2, i10, i, null, -1, null, 4, null, SystemClock.elapsedRealtime(), false);
    }

    public static String a(int i, String str, String str2, int i10, nx0 nx0Var, int i11) {
        String string;
        String str3;
        if (i == 0) {
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" error, index=");
            sb2.append(i10);
            sb2.append(", format=");
            sb2.append(nx0Var);
            sb2.append(", format_supported=");
            int i12 = lb3.f40466a;
            if (i11 == 0) {
                str3 = "NO";
            } else if (i11 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i11 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i11 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            sb2.append(str3);
            string = sb2.toString();
        }
        return !TextUtils.isEmpty(str) ? gf.a.k(string, ": ", str) : string;
    }

    public qn0(String str, Throwable th2, int i, int i10, String str2, int i11, nx0 nx0Var, int i12, an1 an1Var, long j10, boolean z5) {
        super(str, th2, i, j10);
        ni.a(!z5 || i10 == 1);
        ni.a(th2 != null || i10 == 3);
        this.f42344d = i10;
        this.f42345e = str2;
        this.f42346f = i11;
        this.f42347g = nx0Var;
        this.f42348h = i12;
        this.i = an1Var;
        this.f42349j = z5;
    }
}
