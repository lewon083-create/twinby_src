package ob;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30431b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f30432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f30433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f30434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f30435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f30436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e1.d0 f30437h;

    public u0(v0 v0Var, String str, URL url, byte[] bArr, Map map, t0 t0Var) {
        Objects.requireNonNull(v0Var);
        this.f30437h = v0Var;
        pa.c0.f(str);
        pa.c0.i(url);
        this.f30432c = url;
        this.f30433d = bArr;
        this.f30436g = t0Var;
        this.f30434e = str;
        this.f30435f = map;
    }

    public void a(int i, IOException iOException, byte[] bArr, Map map) {
        i1 i1Var = ((l1) ((n2) this.f30437h).f15951b).f30266h;
        l1.k(i1Var);
        i1Var.L(new k6.c(this, i, iOException, bArr, map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0285: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:646), block:B:141:0x0283 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0288: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:649), block:B:142:0x0287 */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0176  */
    /* JADX WARN: Type inference failed for: r14v0, types: [ob.u0] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.u0.run():void");
    }

    public u0(n2 n2Var, String str, URL url, byte[] bArr, HashMap map, m2 m2Var) {
        Objects.requireNonNull(n2Var);
        this.f30437h = n2Var;
        pa.c0.f(str);
        this.f30432c = url;
        this.f30433d = bArr;
        this.f30436g = m2Var;
        this.f30434e = str;
        this.f30435f = map;
    }
}
