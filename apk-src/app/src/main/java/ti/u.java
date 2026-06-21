package ti;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f33899d;

    /* JADX WARN: Illegal instructions before constructor call */
    public u(Context context, t tVar, String str, int i) {
        k9.h hVarJ;
        if (str == null) {
            k9.h hVar = k9.h.i;
            hVarJ = u9.d.j(context, i, 0);
            hVarJ.f27266d = true;
        } else if (str.equals("portrait")) {
            k9.h hVar2 = k9.h.i;
            hVarJ = u9.d.j(context, i, 1);
            hVarJ.f27266d = true;
        } else {
            if (!str.equals("landscape")) {
                throw new IllegalArgumentException("Unexpected value for orientation: ".concat(str));
            }
            k9.h hVar3 = k9.h.i;
            hVarJ = u9.d.j(context, i, 2);
            hVarJ.f27266d = true;
        }
        super(hVarJ);
        this.f33899d = str;
    }
}
