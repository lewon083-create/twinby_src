package yads;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38366e;

    public f33(int i, int i10, int i11, int i12, int i13) {
        this.f38362a = i;
        this.f38363b = i10;
        this.f38364c = i11;
        this.f38365d = i12;
        this.f38366e = i13;
    }

    public static f33 a(String str) {
        if (!str.startsWith("Format:")) {
            throw new IllegalArgumentException();
        }
        String[] strArrSplit = TextUtils.split(str.substring(7), StringUtils.COMMA);
        int i = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < strArrSplit.length; i13++) {
            String strA = ki.a(strArrSplit[i13].trim());
            strA.getClass();
            switch (strA) {
                case "end":
                    i10 = i13;
                    break;
                case "text":
                    i12 = i13;
                    break;
                case "start":
                    i = i13;
                    break;
                case "style":
                    i11 = i13;
                    break;
            }
        }
        if (i == -1 || i10 == -1 || i12 == -1) {
            return null;
        }
        return new f33(i, i10, i11, i12, strArrSplit.length);
    }
}
