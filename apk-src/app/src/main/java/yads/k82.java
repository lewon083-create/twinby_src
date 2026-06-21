package yads;

import android.util.Base64;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k82 implements j82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hn f40102a;

    public /* synthetic */ k82() {
        this(new hn());
    }

    public final String a(yp2 yp2Var) {
        byte[] bArr = yp2Var.f45142b.f45510a;
        if (bArr == null) {
            return null;
        }
        String strC = u01.c(yp2Var.f45143c, v11.T);
        if (strC != null && !Boolean.parseBoolean(strC)) {
            return new String(bArr, Charsets.UTF_8);
        }
        this.f40102a.getClass();
        try {
            return new String(Base64.decode(bArr, 0), Charsets.UTF_8);
        } catch (Exception unused) {
            return new String(bArr, Charsets.UTF_8);
        }
    }

    public k82(hn hnVar) {
        this.f40102a = hnVar;
    }
}
