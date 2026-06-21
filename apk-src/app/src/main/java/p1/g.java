package p1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f30828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f30829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f30831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f30832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f30834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f30835h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f30836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f30837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f30838l;

    public final void a(float f10, int i) {
        int i10 = this.f30833f;
        int[] iArr = this.f30831d;
        if (i10 >= iArr.length) {
            this.f30831d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f30832e;
            this.f30832e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f30831d;
        int i11 = this.f30833f;
        iArr2[i11] = i;
        float[] fArr2 = this.f30832e;
        this.f30833f = i11 + 1;
        fArr2[i11] = f10;
    }

    public final void b(int i, int i10) {
        int i11 = this.f30830c;
        int[] iArr = this.f30828a;
        if (i11 >= iArr.length) {
            this.f30828a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f30829b;
            this.f30829b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f30828a;
        int i12 = this.f30830c;
        iArr3[i12] = i;
        int[] iArr4 = this.f30829b;
        this.f30830c = i12 + 1;
        iArr4[i12] = i10;
    }

    public final void c(int i, String str) {
        int i10 = this.i;
        int[] iArr = this.f30834g;
        if (i10 >= iArr.length) {
            this.f30834g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f30835h;
            this.f30835h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f30834g;
        int i11 = this.i;
        iArr2[i11] = i;
        String[] strArr2 = this.f30835h;
        this.i = i11 + 1;
        strArr2[i11] = str;
    }

    public final void d(int i, boolean z5) {
        int i10 = this.f30838l;
        int[] iArr = this.f30836j;
        if (i10 >= iArr.length) {
            this.f30836j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f30837k;
            this.f30837k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f30836j;
        int i11 = this.f30838l;
        iArr2[i11] = i;
        boolean[] zArr2 = this.f30837k;
        this.f30838l = i11 + 1;
        zArr2[i11] = z5;
    }
}
