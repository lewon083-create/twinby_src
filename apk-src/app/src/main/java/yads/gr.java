package yads;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gr {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fr f38852e = new fr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38853a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f38854b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38855c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38856d = 4096;

    public final synchronized byte[] a(int i) {
        for (int i10 = 0; i10 < this.f38854b.size(); i10++) {
            byte[] bArr = (byte[]) this.f38854b.get(i10);
            if (bArr.length >= i) {
                this.f38855c -= bArr.length;
                this.f38854b.remove(i10);
                this.f38853a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f38856d) {
                this.f38853a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f38854b, bArr, f38852e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f38854b.add(iBinarySearch, bArr);
                this.f38855c += bArr.length;
                a();
            }
        }
    }

    public final synchronized void a() {
        while (this.f38855c > this.f38856d) {
            byte[] bArr = (byte[]) this.f38853a.remove(0);
            this.f38854b.remove(bArr);
            this.f38855c -= bArr.length;
        }
    }
}
