package d1;

import a0.i0;
import android.util.Range;
import android.util.Size;
import com.google.android.gms.internal.auth.g;
import g0.s2;
import java.util.HashMap;
import java.util.Map;
import x0.k;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements f2.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Size f15518h = new Size(1280, 720);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s2 f15520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f15521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f15522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0 f15523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Range f15524g;

    public f(String str, s2 s2Var, k kVar, Size size, i0 i0Var, Range range) {
        this.f15519b = str;
        this.f15520c = s2Var;
        this.f15521d = kVar;
        this.f15522e = size;
        this.f15523f = i0Var;
        this.f15524g = range;
    }

    @Override // f2.f
    public final Object get() {
        Integer num;
        Range range = this.f15524g;
        k kVar = this.f15521d;
        d dVarB = e.b(kVar, range);
        StringBuilder sb2 = new StringBuilder("Resolved VIDEO frame rates: Capture frame rate = ");
        int i = dVarB.f15515a;
        sb2.append(i);
        sb2.append("fps. Encode frame rate = ");
        int i10 = dVarB.f15516b;
        sb2.append(i10);
        sb2.append("fps.");
        g.e("VidEncCfgDefaultRslvr", sb2.toString());
        Range range2 = kVar.f35630c;
        g.e("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        i0 i0Var = this.f15523f;
        int i11 = i0Var.f118b;
        int i12 = dVarB.f15516b;
        Size size = this.f15522e;
        int width = size.getWidth();
        Size size2 = f15518h;
        int iD = e.d(14000000, i11, 8, i12, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight(), range2);
        HashMap map = f1.b.f16565e;
        String str = this.f15519b;
        Map map2 = (Map) map.get(str);
        int iIntValue = (map2 == null || (num = (Integer) map2.get(i0Var)) == null) ? -1 : num.intValue();
        e1.e eVarA = e.a(iIntValue, str);
        e1.c cVarD = e1.d.d();
        cVarD.f15908a = str;
        s2 s2Var = this.f15520c;
        if (s2Var == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        cVarD.f15915h = s2Var;
        cVarD.i = size;
        cVarD.f15914g = Integer.valueOf(iD);
        cVarD.f15911d = Integer.valueOf(i);
        cVarD.f15912e = Integer.valueOf(i10);
        cVarD.f15909b = Integer.valueOf(iIntValue);
        cVarD.f15916j = eVarA;
        return cVarD.a();
    }
}
