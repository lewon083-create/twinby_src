package s3;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.h5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends j3.e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f32554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j3.o f32556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f32557h;
    public final i4.c0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f32558j;

    public i(int i, Exception exc, int i10) {
        this(i, exc, null, i10, null, -1, null, 4, null, false);
    }

    public final i a(i4.c0 c0Var) {
        String message = getMessage();
        String str = m3.z.f28608a;
        return new i(message, getCause(), this.f26229b, this.f32553d, this.f32554e, this.f32555f, this.f32556g, this.f32557h, c0Var, this.f26230c, this.f32558j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, Throwable th2, int i, int i10, String str2, int i11, j3.o oVar, int i12, i4.c0 c0Var, long j10, boolean z5) {
        super(str, th2, i, j10);
        Bundle bundle = Bundle.EMPTY;
        h5.h(!z5 || i10 == 1);
        h5.h(th2 != null || i10 == 3);
        this.f32553d = i10;
        this.f32554e = str2;
        this.f32555f = i11;
        this.f32556g = oVar;
        this.f32557h = i12;
        this.i = c0Var;
        this.f32558j = z5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(int i, Exception exc, String str, int i10, String str2, int i11, j3.o oVar, int i12, i4.c0 c0Var, boolean z5) {
        String str3;
        int i13;
        j3.o oVar2;
        String string;
        String str4;
        if (i == 0) {
            str3 = str2;
            i13 = i11;
            oVar2 = oVar;
            string = "Source error";
        } else if (i != 1) {
            if (i != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str3 = str2;
            i13 = i11;
            oVar2 = oVar;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str3 = str2;
            sb2.append(str3);
            sb2.append(" error, index=");
            i13 = i11;
            sb2.append(i13);
            sb2.append(", format=");
            oVar2 = oVar;
            sb2.append(oVar2);
            sb2.append(", format_supported=");
            String str5 = m3.z.f28608a;
            if (i12 == 0) {
                str4 = "NO";
            } else if (i12 == 1) {
                str4 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i12 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i12 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i12 == 4) {
                str4 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb2.append(str4);
            string = sb2.toString();
        }
        this(TextUtils.isEmpty(str) ? string : gf.a.k(string, ": ", str), exc, i10, i, str3, i13, oVar2, i12, c0Var, SystemClock.elapsedRealtime(), z5);
    }
}
