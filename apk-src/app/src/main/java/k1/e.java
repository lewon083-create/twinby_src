package k1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26819b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f26823f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f26829m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26820c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26821d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26822e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26824g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f26825h = new float[9];
    public final float[] i = new float[9];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b[] f26826j = new b[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26827k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f26828l = 0;

    public e(int i) {
        this.f26829m = i;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i10 = this.f26827k;
            if (i >= i10) {
                b[] bVarArr = this.f26826j;
                if (i10 >= bVarArr.length) {
                    this.f26826j = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f26826j;
                int i11 = this.f26827k;
                bVarArr2[i11] = bVar;
                this.f26827k = i11 + 1;
                return;
            }
            if (this.f26826j[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(b bVar) {
        int i = this.f26827k;
        int i10 = 0;
        while (i10 < i) {
            if (this.f26826j[i10] == bVar) {
                while (i10 < i - 1) {
                    b[] bVarArr = this.f26826j;
                    int i11 = i10 + 1;
                    bVarArr[i10] = bVarArr[i11];
                    i10 = i11;
                }
                this.f26827k--;
                return;
            }
            i10++;
        }
    }

    public final void c() {
        this.f26829m = 5;
        this.f26822e = 0;
        this.f26820c = -1;
        this.f26821d = -1;
        this.f26823f = 0.0f;
        this.f26824g = false;
        int i = this.f26827k;
        for (int i10 = 0; i10 < i; i10++) {
            this.f26826j[i10] = null;
        }
        this.f26827k = 0;
        this.f26828l = 0;
        this.f26819b = false;
        Arrays.fill(this.i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f26820c - ((e) obj).f26820c;
    }

    public final void d(c cVar, float f10) {
        this.f26823f = f10;
        this.f26824g = true;
        int i = this.f26827k;
        this.f26821d = -1;
        for (int i10 = 0; i10 < i; i10++) {
            this.f26826j[i10].h(cVar, this, false);
        }
        this.f26827k = 0;
    }

    public final void e(c cVar, b bVar) {
        int i = this.f26827k;
        for (int i10 = 0; i10 < i; i10++) {
            this.f26826j[i10].i(cVar, bVar, false);
        }
        this.f26827k = 0;
    }

    public final String toString() {
        return "" + this.f26820c;
    }
}
