package vl;

import com.google.android.gms.internal.ads.oc;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends r {
    @Override // vl.r, vl.p
    public final String o() {
        return "#cdata";
    }

    @Override // vl.r, vl.p
    public final void q(StringBuilder sb2, int i, g gVar) throws IOException {
        sb2.append("<![CDATA[").append(t());
    }

    @Override // vl.r, vl.p
    public final void r(StringBuilder sb2, int i, g gVar) {
        try {
            sb2.append("]]>");
        } catch (IOException e3) {
            throw new oc(e3);
        }
    }
}
