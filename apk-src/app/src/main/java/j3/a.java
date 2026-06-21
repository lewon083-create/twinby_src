package j3;

import android.net.Uri;
import com.google.android.gms.internal.measurement.h5;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri[] f26210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x[] f26211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f26212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f26213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f26214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b[] f26215h;

    static {
        gf.a.o(0, 1, 2, 3, 4);
        gf.a.o(5, 6, 7, 8, 9);
        m3.z.G(10);
        m3.z.G(11);
    }

    public a(int i, int i10, int[] iArr, x[] xVarArr, long[] jArr, String[] strArr, b[] bVarArr) {
        Uri uri;
        int i11 = 0;
        h5.h(iArr.length == xVarArr.length);
        h5.h(iArr.length == bVarArr.length);
        this.f26208a = i;
        this.f26209b = i10;
        this.f26212e = iArr;
        this.f26211d = xVarArr;
        this.f26213f = jArr;
        this.f26210c = new Uri[xVarArr.length];
        while (true) {
            Uri[] uriArr = this.f26210c;
            if (i11 >= uriArr.length) {
                this.f26214g = strArr;
                this.f26215h = bVarArr;
                return;
            }
            x xVar = xVarArr[i11];
            if (xVar == null) {
                uri = null;
            } else {
                u uVar = xVar.f26407b;
                uVar.getClass();
                uri = uVar.f26396a;
            }
            uriArr[i11] = uri;
            i11++;
        }
    }

    public final int a(int i) {
        int i10;
        int i11 = i + 1;
        while (true) {
            int[] iArr = this.f26212e;
            if (i11 >= iArr.length || (i10 = iArr[i11]) == 0 || i10 == 1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f26208a == aVar.f26208a && this.f26209b == aVar.f26209b && Arrays.equals(this.f26211d, aVar.f26211d) && Arrays.equals(this.f26212e, aVar.f26212e) && Arrays.equals(this.f26213f, aVar.f26213f) && Arrays.equals(this.f26214g, aVar.f26214g) && Arrays.equals(this.f26215h, aVar.f26215h);
    }

    public final int hashCode() {
        int i = ((this.f26208a * 31) + this.f26209b) * 31;
        int i10 = (int) 0;
        return (Arrays.hashCode(this.f26215h) + ((((((Arrays.hashCode(this.f26213f) + ((Arrays.hashCode(this.f26212e) + ((Arrays.hashCode(this.f26211d) + ((i + i10) * 31)) * 31)) * 31)) * 31) + i10) * VKApiCodes.CODE_CALL_LINK_OUTDATED) + Arrays.hashCode(this.f26214g)) * 31)) * 31;
    }
}
