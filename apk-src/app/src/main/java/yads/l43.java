package yads;

import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l43 implements fq2 {
    @Override // yads.fq2
    public final Object a(yp2 yp2Var) {
        byte[] bArr = yp2Var.f45142b.f45510a;
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, u01.a(yp2Var.f45143c));
        } catch (Exception unused) {
            return new String(bArr, Charsets.UTF_8);
        }
    }
}
