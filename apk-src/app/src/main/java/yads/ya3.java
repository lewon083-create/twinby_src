package yads;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ya3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f44988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f44989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f44990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44991d;

    public ya3(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.f44988a = strArr;
        this.f44989b = iArr;
        this.f44990c = strArr2;
        this.f44991d = i;
    }

    public final String a(String str, long j10, int i, long j11) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            int i11 = this.f44991d;
            if (i10 >= i11) {
                sb2.append(this.f44988a[i11]);
                return sb2.toString();
            }
            sb2.append(this.f44988a[i10]);
            int i12 = this.f44989b[i10];
            if (i12 == 1) {
                sb2.append(str);
            } else if (i12 == 2) {
                sb2.append(String.format(Locale.US, this.f44990c[i10], Long.valueOf(j10)));
            } else if (i12 == 3) {
                sb2.append(String.format(Locale.US, this.f44990c[i10], Integer.valueOf(i)));
            } else if (i12 == 4) {
                sb2.append(String.format(Locale.US, this.f44990c[i10], Long.valueOf(j11)));
            }
            i10++;
        }
    }
}
