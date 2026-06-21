package ti;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f33909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f33910e;

    public w(t tVar, Context context, int i, Integer num, Integer num2) {
        k9.h hVar;
        if (num != null) {
            if (num.intValue() == 0) {
                k9.h hVar2 = k9.h.i;
                int iO = u9.d.o(context, 1);
                hVar = new k9.h(i, 0);
                if (iO == -1) {
                    hVar = k9.h.f27262l;
                } else {
                    hVar.f27268f = iO;
                    hVar.f27267e = true;
                }
            } else {
                k9.h hVar3 = k9.h.i;
                int iO2 = u9.d.o(context, 2);
                hVar = new k9.h(i, 0);
                if (iO2 == -1) {
                    hVar = k9.h.f27262l;
                } else {
                    hVar.f27268f = iO2;
                    hVar.f27267e = true;
                }
            }
        } else if (num2 != null) {
            int iIntValue = num2.intValue();
            hVar = new k9.h(i, 0);
            hVar.f27268f = iIntValue;
            hVar.f27267e = true;
            if (iIntValue < 32) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iIntValue).length() + 118);
                sb2.append("The maximum height set for the inline adaptive ad size was ");
                sb2.append(iIntValue);
                sb2.append(" dp, which is below the minimum recommended value of 32 dp.");
                u9.i.h(sb2.toString());
            }
        } else {
            k9.h hVar4 = k9.h.i;
            int iO3 = u9.d.o(context, 0);
            if (iO3 == -1) {
                hVar = k9.h.f27262l;
            } else {
                hVar = new k9.h(i, 0);
                hVar.f27268f = iO3;
                hVar.f27267e = true;
            }
        }
        super(hVar);
        this.f33909d = num;
        this.f33910e = num2;
    }
}
