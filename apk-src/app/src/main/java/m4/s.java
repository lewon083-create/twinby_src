package m4;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d2.a f28683g = new d2.a(12);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d2.a f28684h = new d2.a(13);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28690f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r[] f28686b = new r[5];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f28685a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28687c = -1;

    public final void a(float f10, int i) {
        r rVar;
        int i10 = this.f28687c;
        ArrayList arrayList = this.f28685a;
        if (i10 != 1) {
            Collections.sort(arrayList, f28683g);
            this.f28687c = 1;
        }
        int i11 = this.f28690f;
        r[] rVarArr = this.f28686b;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f28690f = i12;
            rVar = rVarArr[i12];
        } else {
            rVar = new r();
        }
        int i13 = this.f28688d;
        this.f28688d = i13 + 1;
        rVar.f28680a = i13;
        rVar.f28681b = i;
        rVar.f28682c = f10;
        arrayList.add(rVar);
        this.f28689e += i;
        while (true) {
            int i14 = this.f28689e;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 - 2000;
            r rVar2 = (r) arrayList.get(0);
            int i16 = rVar2.f28681b;
            if (i16 <= i15) {
                this.f28689e -= i16;
                arrayList.remove(0);
                int i17 = this.f28690f;
                if (i17 < 5) {
                    this.f28690f = i17 + 1;
                    rVarArr[i17] = rVar2;
                }
            } else {
                rVar2.f28681b = i16 - i15;
                this.f28689e -= i15;
            }
        }
    }

    public final float b() {
        int i = this.f28687c;
        ArrayList arrayList = this.f28685a;
        if (i != 0) {
            Collections.sort(arrayList, f28684h);
            this.f28687c = 0;
        }
        float f10 = 0.5f * this.f28689e;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            r rVar = (r) arrayList.get(i11);
            i10 += rVar.f28681b;
            if (i10 >= f10) {
                return rVar.f28682c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((r) gf.a.g(1, arrayList)).f28682c;
    }
}
